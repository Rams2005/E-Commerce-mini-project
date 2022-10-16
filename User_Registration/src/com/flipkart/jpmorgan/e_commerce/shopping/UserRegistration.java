package com.flipkart.jpmorgan.e_commerce.shopping;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserRegistration {
Connection conn=null;
PreparedStatement ps=null;
String id=null,fname=null,lname=null,email=null,contact=null,username=null,password=null;
public void insertData(String id,String fname,String lname,String email,String contact, String username, String password){
	  try {
		 ConnectionClass connection =  new ConnectionClass();
		 conn=connection.getConnection();
		 ps=conn.prepareStatement("insert into user_details(User_ID, First_Name, Last_Name, Email_ID, Contact_NO, User_Name, Password)Values(?,?,?,?,?,?,?)");
		 ps.setString(1, id);
		 ps.setString(2, fname);
		 ps.setString(3, lname);
		 ps.setString(4, email);
		 ps.setString(5, contact);
		 ps.setString(6, username);
		 ps.setString(7, password);
		 long i =ps.executeLargeUpdate();
		 System.out.println(i);
		 conn.close();
		 ps.close();
	  } catch (SQLException e) {
		e.printStackTrace();
	}
}		 
		public void doProcess() {
    	Scanner sc=new Scanner(System.in);
    	for(int i=1; i<=10; i++) {
    		System.out.println("Enter Your ID");
    		 id = sc.next();
    		System.out.println("Enter Your First Name");
    		fname=sc.next();
    		System.out.println("Enter Your Last Name");
    		lname=sc.next();
    		System.out.println("Enter Your Email ID");
    		email=sc.next();
    		System.out.println("Enter Your Contact Number");
    		contact=sc.next();
    		System.out.println("Successfully Registered");
    		System.out.println("Logging Here");
    		System.out.println("User Name");
    		username=sc.next();
    		System.out.println("Password");
    		password=sc.next();
    		
    		UserRegistration ur=new UserRegistration();
    		ur.insertData(id,fname,lname,email,contact,username,password);
    		
    	}
	  }
        public static void main(String args[]) {
        	UserRegistration urg=new UserRegistration();
        	urg.doProcess();
        	
        }
}

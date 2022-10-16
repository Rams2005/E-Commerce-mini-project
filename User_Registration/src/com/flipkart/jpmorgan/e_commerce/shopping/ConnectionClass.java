package com.flipkart.jpmorgan.e_commerce.shopping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
Connection conn=null;
public Connection getConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		conn=java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/mini_project","root","R@ms7030646480");
	    
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	return conn;
	


	
}
}

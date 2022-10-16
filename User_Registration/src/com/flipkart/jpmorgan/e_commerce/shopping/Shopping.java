package com.flipkart.jpmorgan.e_commerce.shopping;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Shopping  {

public static void main(String args[]) {
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try {
		ConnectionClass connection=new ConnectionClass();
		conn=connection.getConnection();
		stmt=conn.createStatement();
		rs=stmt.executeQuery("select * from products");
		while(rs.next()) {
			System.out.print(rs.getString(1)+ "  --  ");
			System.out.print(rs.getString(2)+"  --  ");
			System.out.print(rs.getString(3)+"  --  ");
			System.out.print(rs.getString(4)+"  --  ");
			System.out.println(rs.getString(5)+"  --  ");
 
		}
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

}


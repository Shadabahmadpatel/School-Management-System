package com.jsp.schoolmanagement.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HelperClass {
	
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
				String password="T#9758@qlph";
				
				
				Connection connection=null;
				
				public Connection getconnection() {
				try {
					//load/register the driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					//To establish connection
		connection=DriverManager.getConnection(url, username, password);
	
} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
				return connection;
				}


}

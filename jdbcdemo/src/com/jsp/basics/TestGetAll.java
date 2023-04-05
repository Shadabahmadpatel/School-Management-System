package com.jsp.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestGetAll {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
				String password="T#9758@qlph";
				
				String sql="SELECT * FROM STUDENT";
				Connection connection=null;
				try {
					//load/register the driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					//To establish connection
		connection=DriverManager.getConnection(url, username, password);
		//To create statement 
	java.sql.Statement statement= connection.createStatement();	
	// Execute Statement 
	ResultSet resultSet=statement.executeQuery(sql);
	while(resultSet.next()) {
		System.out.println(resultSet.getInt("id"));
		System.out.println(resultSet.getString("name"));
		System.out.println(resultSet.getString("email"));
		System.out.println("=======");
	}
	//close
	
		
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		finally {
			System.out.println("connection close");
		}
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
}
	}
}

package com.jsp.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetById {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
				String password="T#9758@qlph";
				
				String sql="SELECT * FROM STUDENT WHERE ID=3";
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
		System.out.println(resultSet.getInt(1));
		System.out.println(resultSet.getString(2));
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

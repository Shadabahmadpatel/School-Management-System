package com.jsp.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class Demo {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
				String password="T#9758@qlph";
				
				String sql="INSERT INTO car VALUES(9,'THAR','MAHINDRA')";
				Connection connection=null;
				try {
					//load/resgister the driver
					Class.forName("com.mysql.cj.jdbc.Driver");
					//To establish connection
		connection=DriverManager.getConnection(url, username, password);
		//To create statement 
	java.sql.Statement statement= connection.createStatement();	
	// Execute Statement 
	statement.execute(sql);
	
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
			
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

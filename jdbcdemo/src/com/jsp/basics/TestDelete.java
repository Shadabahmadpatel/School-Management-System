package com.jsp.basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Execute;

public class TestDelete {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/javabatch";
		String username="root";
		String password="T#9758@qlph";
		String sql="DELETE FROM  teacher WHERE ID=3";
		Connection connection=null;
		
		
		
		try {
			// load/register the drivers 
			Class.forName("com.mysql.cj.jdbc.Driver");
			//establish connection
		 connection = DriverManager.getConnection(url, username, password);
		 //create statement
		Statement statement=connection.createStatement();
		//execute statement
		int i=statement.executeUpdate(sql);
		
		if(i>0){
			System.out.println("entry deleted");
			
		}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("connection is closed");
			try {
				//close connection
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}{ 
			
			
		}
	}

}

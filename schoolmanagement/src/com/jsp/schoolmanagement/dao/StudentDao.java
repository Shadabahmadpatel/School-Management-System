package com.jsp.schoolmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import com.jsp.schoolmanagement.dto.Student;
import com.jsp.schoolmanagement.util.HelperClass;

public class StudentDao {

	HelperClass helperClass=new HelperClass();
	public Student saveStudent(Student student) {
		Connection connection=helperClass.getconnection();
		String sql="INSERT INTO student VALUES(?,?,?);";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,student.getId());
			preparedStatement.setString(2,student.getName());
			preparedStatement.setString(3,student.getEmail());
			
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return student;
		
}
		

	public Student updateStudent(Student student) {
Connection connection=helperClass.getconnection();
String sql="UPDATE student SET name=?  WHERE ID=?";

try {
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
	// in the same way you can update the other columns also 
	//preparedStatement.setString(1, student.getEmail());
      preparedStatement.setString(1, student.getName());
      preparedStatement.setInt(2,student.getId());

	preparedStatement.execute();
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return student;
	}
	
	public Student readAll(Student student) {
		  Connection connection=helperClass.getconnection();
		  String sql="SELECT * FROM STUDENT WHERE ID=?"; 
		  //the same way by changing the query you can create another method and fetch all the details 
		  //by calling that method in the controller class.
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,student.getId());
			//preparedStatement.setString(2,student.getName());
			//preparedStatement.setString(3,student.getEmail());
		   ResultSet resultSet=preparedStatement.executeQuery();
		    while(resultSet.next()) {
		    	System.out.println(resultSet.getInt("id"));
		        System.out.println(resultSet.getString("name"));
		        System.out.println(resultSet.getString("email"));
		        System.out.println("==========");
		    
		    
		    }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		return student;
} 
	public boolean deleteStudent(int id) {
	    Connection connection=helperClass.getconnection();
	    String sql="DELETE FROM STUDENT WHERE ID=?";
	    try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1,id);
		preparedStatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
	
		
	 
	 }
}
	
	
	
	
		
	
	

	

	
	
             

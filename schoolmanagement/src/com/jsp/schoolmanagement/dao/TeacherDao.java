package com.jsp.schoolmanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.schoolmanagement.dto.Student;
import com.jsp.schoolmanagement.dto.Teacher;
import com.jsp.schoolmanagement.util.HelperClass;

public class TeacherDao {
	HelperClass helperClass=new HelperClass();
	public Teacher saveTeacher(Teacher teacher) {
		Connection connection=helperClass.getconnection();
		String sql="INSERT INTO teacher VALUES(?,?,?);";
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,teacher.getId());
			preparedStatement.setString(2,teacher.getName());
			preparedStatement.setString(3,teacher.getSubject());
			
			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return teacher;
		
}
	
	public Teacher updateTeacher(Teacher teacher) {
		Connection connection=helperClass.getconnection();
		String sql="UPDATE teacher SET name=?  WHERE ID=?";

		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			// in the same way you can update the other columns also 
			//preparedStatement.setString(1, student.getEmail());
		      preparedStatement.setString(1, teacher.getName());
		      preparedStatement.setInt(2,teacher.getId());

			preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				return teacher;
			}
	
	
	public Teacher readAll(Teacher teacher) {
		  Connection connection=helperClass.getconnection();
		  String sql="SELECT * FROM TEACHER WHERE ID=?"; 
		  //the same way by changing the query you can create another method and fetch all the details 
		  //by calling that method in the controller class.
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1,teacher.getId());
			//preparedStatement.setString(2,student.getName());
			//preparedStatement.setString(3,student.getEmail());
		   ResultSet resultSet=preparedStatement.executeQuery();
		    while(resultSet.next()) {
		    	System.out.println(resultSet.getInt("id"));
		        System.out.println(resultSet.getString("name"));
		        System.out.println(resultSet.getString("subject"));
		        System.out.println("==========");
		    
		    
		    }
		    
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		return teacher;
} 
	public boolean deleteTeacher(int id){
		 Connection connection=  helperClass.getconnection();
		String sql="DELETE FROM TEACHER WHERE ID=?";
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

package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.StudentDao;
import com.jsp.schoolmanagement.dto.Student;

public class UpdateStudent {
 public static void main(String[] args) {
	 Student s2=new Student();
	 s2.setId(6);
	 s2.setName("mueez");
	 //by passing below argument and changing the implementation 
	 //in studentdao class you change email as well as update any data 
	 //in your table and according to your need 
	// s2.setEmail("xyz");
	 
	 
	
	 StudentDao studentDao=new StudentDao();
	Student student=studentDao.updateStudent(s2);
	 if(student!=null) {
		 System.out.println("student data updated");
	 }
	 else { 
		 System.out.println("studnet data failed to update");
	 }
	 
	
}
}

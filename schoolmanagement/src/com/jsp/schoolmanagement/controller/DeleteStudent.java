package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.StudentDao;
import com.jsp.schoolmanagement.dto.Student;

public class DeleteStudent {
	public static void main(String[] args) { 
	
		StudentDao studentDao=new StudentDao();
		boolean i=studentDao.deleteStudent(4);
		if(i==true) {
			System.out.println("student data deleted successfully");
			
		}else {
			System.out.println("failed to delete the data");
			
		}
	}
}

	      
	     
	    	  
	

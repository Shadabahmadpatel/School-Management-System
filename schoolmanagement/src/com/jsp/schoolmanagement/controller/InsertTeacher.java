package com.jsp.schoolmanagement.controller;

import com.jsp.schoolmanagement.dao.StudentDao;
import com.jsp.schoolmanagement.dao.TeacherDao;
import com.jsp.schoolmanagement.dto.Student;
import com.jsp.schoolmanagement.dto.Teacher;

public class InsertTeacher {
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.setId(3);
		t1.setName("prof.patil");
		t1.setSubject("science");
		
		TeacherDao teacherDao=new TeacherDao();
		    Teacher teacher=teacherDao.saveTeacher(t1);
		if(teacher !=null) {
			System.out.println("teacher data upadted");
			
		}else {
			System.out.println("teacher"
					+ " data not updtaed");
			
		}
		
		
		
		
	}

}

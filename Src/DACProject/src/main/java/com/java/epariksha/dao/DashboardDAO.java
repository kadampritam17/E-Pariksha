package com.java.epariksha.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.repository.StudentRepository;
import com.java.epariksha.repository.TeacherRepository;

@Service
public class DashboardDAO {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	public Integer studentCount()
	{
		System.out.println("count" + studentRepository.getStudentCount());
		return studentRepository.getStudentCount();
	}
	
	

}

package com.java.epariksha.dao;


import java.sql.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Student;
import com.java.epariksha.repository.StudentRepository;

@Service
public class StudentSignupDAO {
	
	@Autowired 
	StudentRepository student;
	
	

	public void register(String firstName, String lastName, double mobNo, Date dob, String userName, String password,
			String emailId) {
		
		Student stud = new Student(firstName, lastName, mobNo, dob, userName, password, emailId);
		student.save(stud);
	}

}

package com.java.epariksha.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Student;
import com.java.epariksha.entity.Teacher;
import com.java.epariksha.repository.StudentRepository;
import com.java.epariksha.repository.TeacherRepository;



@Service
public class LoginDAO {
	
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
    
    
	public Teacher validateTeacher(String username, String password)
	{
		List<Teacher> teacherFound = teacherRepository.findTeacherByUsernameAndPassword(username, password);
		return teacherFound.size() > 0 ? teacherFound.get(0) : null;   
	}
	
	
	public Student validateStudent(String username, String password)
	{
		List<Student> studentFound = studentRepository.findStudentByUsernameAndPassword(username, password);
		return studentFound.size() > 0 ? studentFound.get(0) : null;   
	}

}

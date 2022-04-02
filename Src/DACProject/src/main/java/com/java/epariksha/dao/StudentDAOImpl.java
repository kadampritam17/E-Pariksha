package com.java.epariksha.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Question;
import com.java.epariksha.entity.Student;
import com.java.epariksha.repository.StudentRepository;

@Service
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	public Student getDetails(int studentId) {
		return studentRepository.findById(studentId).get();	}

<<<<<<< HEAD
//	//for React
//	
//	public Object save(Student stud) {
//		return studentRepository.save(stud);
//	}
=======
	public Student save(Student student) 
	{
		return studentRepository.save(student);
	}

>>>>>>> c93daf7deff7d777e509ab9198cc9c8c4cf9a0ed

}

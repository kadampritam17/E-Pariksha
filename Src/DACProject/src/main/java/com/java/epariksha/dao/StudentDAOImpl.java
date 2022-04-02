package com.java.epariksha.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		return studentRepository.findById(studentId).get();
	}

	public Student save(Student student) 
	{
		return studentRepository.save(student);
	}

	public void delete(int id) {
		studentRepository.deleteById(id);
	}


}

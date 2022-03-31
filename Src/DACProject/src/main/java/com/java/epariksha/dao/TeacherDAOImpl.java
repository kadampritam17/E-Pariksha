package com.java.epariksha.dao;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Teacher;
import com.java.epariksha.repository.TeacherRepository;

@Service
public class TeacherDAOImpl implements TeacherDAO {

	
	@Autowired
	TeacherRepository teacherRepository;
	
	//done
	@Override
	public List<Teacher> getAll() {
		return teacherRepository.findAll();
	}

	
	public Optional<Teacher> get(int id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(teacherRepository.findById(id).get());
	}
	
}

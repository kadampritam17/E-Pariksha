package com.java.epariksha.dao;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.repository.TeacherRepository;

@Service
public class TeacherDAOImpl implements TeacherDAO {

	
	@Autowired
	TeacherRepository teacherRepository;
	
	
	@Override
	public Collection getAll() {
		return teacherRepository.findAll();
	}

}

package com.java.epariksha.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Exam;
import com.java.epariksha.repository.ExamRepository;

@Service
public class ExamDAOImpl {

	@Autowired
	ExamRepository examRepository;

	
	public List<Exam> getAll() {
		return examRepository.findAll();
	}

}

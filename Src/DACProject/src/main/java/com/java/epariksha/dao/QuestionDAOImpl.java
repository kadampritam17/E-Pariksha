package com.java.epariksha.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Question;
import com.java.epariksha.repository.QuestionRepository;

@Service
public class QuestionDAOImpl implements QuestionDAO {

	@Autowired
	QuestionRepository questionRepository;

	
	public List<Question> getAll() {
		return questionRepository.findAll();
	}
	
	
	public Object save(Question que) {
		// TODO Auto-generated method stub
		return questionRepository.save(que);
	}
}

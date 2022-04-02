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
	
<<<<<<< HEAD
	
	public Object save(Question que) {
=======
	//done
	public Object save(Question que) {
		
>>>>>>> c93daf7deff7d777e509ab9198cc9c8c4cf9a0ed
		return questionRepository.save(que);
	}
}

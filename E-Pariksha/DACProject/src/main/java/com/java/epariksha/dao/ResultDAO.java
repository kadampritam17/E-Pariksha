package com.java.epariksha.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Result;
import com.java.epariksha.repository.ResultRepository;

@Service
public class ResultDAO {

	
	@Autowired
	ResultRepository resultRepository;
	
	
	public List<Result> getAll() {
		return resultRepository.findAll();
	}

}

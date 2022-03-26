package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.QuestionDAOImpl;
import com.java.epariksha.entity.Question;

@CrossOrigin
@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionDAOImpl dao;

	ModelAndView mv = new ModelAndView(); 
	
	
	@GetMapping("/admin/question")
	public ModelAndView admin_question() 
	{
		List<Question> list = dao.getAll();
		mv.addObject("questions", list); //request.setAttribute
		mv.setViewName("admin/question");
		return mv;
	}
	
}

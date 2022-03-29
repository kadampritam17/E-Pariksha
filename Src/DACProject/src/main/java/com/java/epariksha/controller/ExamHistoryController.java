package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.ExamDAOImpl;
import com.java.epariksha.entity.Exam;

@Controller
public class ExamHistoryController {

	
	@Autowired
	ExamDAOImpl dao;
	
	ModelAndView mv = new ModelAndView(); 
	
	@GetMapping("/admin/exam_history")
	public ModelAndView examHistory()
	{
		List<Exam> list = dao.getAllPreviousExams();
		mv.addObject("exams_history", list); //request.setAttribute
		mv.setViewName("admin/exam_history");
		return mv;
	}
	
	
}

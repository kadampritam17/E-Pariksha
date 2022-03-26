package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.ExamDAOImpl;
import com.java.epariksha.entity.Exam;

@Controller
public class ExamController {

	

	@GetMapping("/admin/exam")
	public String f4()
	{
		return "admin/exam";
	}
	
	
	
	@Autowired
	ExamDAOImpl dao;

	ModelAndView mv = new ModelAndView(); 
	
	
	@GetMapping("/admin/exam")
	public ModelAndView admin_exam() 
	{
		List<Exam> list = dao.getAll();
		mv.addObject("exams", list); //request.setAttribute
		mv.setViewName("admin/exam");
		return mv;
	}
	
}

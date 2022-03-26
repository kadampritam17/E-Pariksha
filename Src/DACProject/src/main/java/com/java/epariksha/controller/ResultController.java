package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.ResultDAO;
import com.java.epariksha.entity.Result;

@Controller
public class ResultController {

	
	@Autowired
	ResultDAO dao;

	ModelAndView mv = new ModelAndView(); 
	
	
	@GetMapping("/admin/result")
	public ModelAndView admin_result() 
	{
		List<Result> list = dao.getAll();
		mv.addObject("results", list); //request.setAttribute
		mv.setViewName("admin/result");
		return mv;
	}
	
	
}

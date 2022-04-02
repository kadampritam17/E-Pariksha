package com.java.epariksha.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.ResultDAO;
import com.java.epariksha.entity.Result;
import com.java.epariksha.entity.Teacher;

@Controller
public class ResultController {


	@Autowired
	ResultDAO dao;

	ModelAndView mv = new ModelAndView(); 

	//--------------------------------------------------------------
	//	ADMIN CONTROLLERS

	//done
	@GetMapping("/admin/result")
	public ModelAndView admin_result() 
	{
		List<Result> list = dao.getAll();
		mv.addObject("results", list); //request.setAttribute
		mv.setViewName("admin/result");
		return mv;
	}






	//------------------------------------------------------------------
	//	TEACHER CONTROLLERS

	//done
	@GetMapping("/teacher/result")
	public ModelAndView teacher_result(HttpServletRequest request) 
	{
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		mv.addObject("teach", teacher);//request.setAttribute (session data)
		List<Result> list = dao.getAll();
		mv.addObject("results", list); //request.setAttribute
		mv.setViewName("teacher/result");
		return mv;
	}


}

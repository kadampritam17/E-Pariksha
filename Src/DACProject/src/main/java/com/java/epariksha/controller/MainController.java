package com.java.epariksha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.DashboardDAO;

@Controller
public class MainController {


	@Autowired
	DashboardDAO dao;

	ModelAndView mv = new ModelAndView();



	@GetMapping("/index")
	public String f1()
	{
		return "index";
	}


	//--------------------------------------------------------------
	//	ADMIN CONTROLLERS


	@GetMapping("/admin/home")
	public ModelAndView admin_StudentCount()
	{
		int studCount = dao.studentCount();

		mv.addObject("studCount",studCount);
		mv.setViewName("admin/home");
		return mv;
	}

	//--------------------------------------------------------------
	//	STUDENT CONTROLLERS

	@GetMapping("/student/home")
	public String f2()
	{
		return "student/home";
	}


	//------------------------------------------------------------------
	//	TEACHER CONTROLLERS


	@GetMapping("/teacher/home")
	public ModelAndView teacher_StudentCount()
	{
		System.out.println("ncjdncd");
		int studCount = dao.studentCount();

		mv.addObject("studCount",studCount);
		mv.setViewName("teacher/home");
		return mv;
	}

}

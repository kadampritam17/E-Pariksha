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
	//DOne

	@GetMapping("/admin/home")
	public ModelAndView admin_StudentCount()
	{
		int studCount = dao.studentCount();
		mv.addObject("studCount",studCount);
		
		int subCount = dao.subjectCount();
		mv.addObject("subCount",subCount);
		
		int examCount = dao.examCount();		
		mv.addObject("examCount",examCount);
		
		int teacherCount = dao.teacherCount();		
		mv.addObject("teacherCount",teacherCount);
		
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
	//DOne

	@GetMapping("/teacher/home")
	public ModelAndView teacher_StudentCount()
	{
		int studCount = dao.studentCount();
		int subCount = dao.subjectCount();
		
		mv.addObject("studCount",studCount);
		mv.addObject("subCount",subCount);
		
		int examCount = dao.examCount();
		
		mv.addObject("examCount",examCount);
		mv.setViewName("teacher/home");
		return mv;
	}
	
	

}

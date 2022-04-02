package com.java.epariksha.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.QuestionDAOImpl;
import com.java.epariksha.entity.Question;
import com.java.epariksha.entity.Teacher;

@Controller
public class QuestionController {

	@Autowired
	QuestionDAOImpl dao;

	ModelAndView mv = new ModelAndView(); 

	//--------------------------------------------------------------
	//	ADMIN CONTROLLERS

	//done
	@GetMapping("/admin/question")
	public ModelAndView admin_question() 
	{
		List<Question> list = dao.getAll();
		mv.addObject("questions", list); //request.setAttribute
		mv.setViewName("admin/question");
		return mv;
	}




	//------------------------------------------------------------------
	//	TEACHER CONTROLLERS

	//done
	@GetMapping("/teacher/question")
	public ModelAndView teacher_question(HttpServletRequest request) 
	{
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		mv.addObject("teach", teacher);//request.setAttribute (session data)
		List<Question> list = dao.getAll();
		mv.addObject("questions", list); //request.setAttribute
		mv.setViewName("teacher/question");
		return mv;
	}
}

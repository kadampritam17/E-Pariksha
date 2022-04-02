package com.java.epariksha.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.ExamDAOImpl;
import com.java.epariksha.entity.Exam;
import com.java.epariksha.entity.Teacher;

@Controller
public class ExamHistoryController {


	@Autowired
	ExamDAOImpl dao;

	ModelAndView mv = new ModelAndView(); 


	//--------------------------------------------------------------
	//	ADMIN CONTROLLERS

	//done
	@GetMapping("/admin/exam_history")
	public ModelAndView admin_examHistory()
	{
		List<Exam> list = dao.getAllPreviousExams();
		mv.addObject("exams_history", list); //request.setAttribute
		mv.setViewName("admin/exam_history");
		return mv;
	}



	//------------------------------------------------------------------
	//	TEACHER CONTROLLERS

	//done
	@GetMapping("/teacher/exam_history")
	public ModelAndView teacher_examHistory(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		mv.addObject("teach", teacher);//request.setAttribute (session data)
		List<Exam> list = dao.getAllPreviousExams();
		mv.addObject("exams_history", list); //request.setAttribute
		mv.setViewName("teacher/exam_history");
		return mv;
	}

}

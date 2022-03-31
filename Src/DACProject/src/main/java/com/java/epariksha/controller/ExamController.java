package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.ExamDAOImpl;
import com.java.epariksha.dao.SubjectDAOImpl;
import com.java.epariksha.dao.TeacherDAOImpl;
import com.java.epariksha.entity.Exam;
import com.java.epariksha.entity.Result;
import com.java.epariksha.entity.Subject;
import com.java.epariksha.entity.Teacher;

@Controller
//@RequestMapping("/admin")
public class ExamController {


	/*
	 * @GetMapping("/admin/exam") public String f4() { return "admin/exam"; }
	 * 
	 */

	@Autowired
	ExamDAOImpl dao;

	@Autowired
	SubjectDAOImpl subDAO;
	
	@Autowired
	TeacherDAOImpl TeacherDAO;
	
	ModelAndView mv = new ModelAndView(); 

	//--------------------------------------------------------------
	//	ADMIN CONTROLLERS

	//done
	@GetMapping("/admin/exam")
	public ModelAndView admin_exam() 
	{
		List<Exam> list = dao.getAll();
		mv.addObject("exams", list); //request.setAttribute
		mv.setViewName("admin/exam");
		return mv;
	}


	//------------------------------------------------------------------
	//	TEACHER CONTROLLERS

	@GetMapping("/teacher/exam_add")
	public ModelAndView admin_exam_add() 
	{
		List<Subject> list = subDAO.getAll();
		List<Teacher> list2 = TeacherDAO.getAll();
		mv.addObject("subjects", list); //request.setAttribute
		mv.addObject("teachers", list2); //request.setAttribute		
		mv.setViewName("teacher/exam_add");
		return mv;
	}
	
	
	@PostMapping("/teacher/exam_add") 
	public ModelAndView subject_add(@ModelAttribute("formexam")Exam exam) 
	{
		
		System.out.println(exam);
		dao.save(exam);
		
		mv.addObject("exam", dao.save(exam)); //request.setAttribute
		mv.setViewName("redirect:/teacher/exam");
		return mv;
	}
	
	
	//done
	@GetMapping("/teacher/exam")
	public ModelAndView teacher_exam() 
	{
		List<Exam> list = dao.getAll();
		mv.addObject("exams", list); //request.setAttribute
		mv.setViewName("teacher/exam");
		return mv;
	}
}

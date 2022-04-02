package com.java.epariksha.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.StudentDAOImpl;
import com.java.epariksha.entity.Student;
import com.java.epariksha.entity.Teacher;


@Controller
public class StudentController {

	@Autowired
	StudentDAOImpl dao;

	ModelAndView mv = new ModelAndView(); 

	//--------------------------------------------------------------
	//	ADMIN CONTROLLERS

	//done
	@GetMapping("/admin/student")
	public ModelAndView admin_student() 
	{
		List<Student> list = dao.getAll();
		mv.addObject("students", list); //request.setAttribute
		mv.setViewName("admin/student");
		return mv;
	}

	@GetMapping("/admin/student_add")
	public ModelAndView admin_student_add() 
	{
		mv.setViewName("admin/student_add");
		return mv;
	}


	//working
	@PostMapping("/admin/student_add") 
	public ModelAndView student_add(@ModelAttribute("studentAddForm") Student student) 
	{
		System.out.println(student + " postMapping student ");
		mv.addObject("students", dao.save(student)); //request.setAttribute
		mv.setViewName("redirect:/admin/student");
		return mv;
	}



	//------------------------------------------------------------------
	//	TEACHER CONTROLLERS

	//done
	@GetMapping("/teacher/student")
	public ModelAndView teacher_student(HttpServletRequest request) 
	{
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		mv.addObject("teach", teacher);//request.setAttribute (session data)
		List<Student> list = dao.getAll();
		mv.addObject("students", list); //request.setAttribute
		mv.setViewName("teacher/student");
		return mv;
	}
}

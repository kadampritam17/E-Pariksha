package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.StudentDAOImpl;
import com.java.epariksha.entity.Student;


@Controller
public class StudentController {

	@Autowired
	StudentDAOImpl dao;

	ModelAndView mv = new ModelAndView(); 
	
	
	@GetMapping("/admin/student")
	public ModelAndView admin_student() 
	{
		List<Student> list = dao.getAll();
		mv.addObject("students", list); //request.setAttribute
		mv.setViewName("admin/student");
		return mv;
	}
}

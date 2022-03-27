package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.TeacherDAOImpl;
import com.java.epariksha.entity.Teacher;

@Controller
public class TeacherController {

	
	@Autowired
	TeacherDAOImpl dao;

	ModelAndView mv = new ModelAndView(); 
	
	
	@GetMapping("/admin/teacher")
	public ModelAndView admin_teacher() 
	{
		List<Teacher> list = (List<Teacher>) dao.getAll();
		mv.addObject("teachers", list); //request.setAttribute
		mv.setViewName("admin/teacher");
		return mv;
	}
}

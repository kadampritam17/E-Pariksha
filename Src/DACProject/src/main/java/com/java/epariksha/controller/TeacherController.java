package com.java.epariksha.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.TeacherDAOImpl;
import com.java.epariksha.entity.Subject;
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
	
	@GetMapping("/teacher/teacher_profile")
	public ModelAndView teacher_profile() 
	{
		
		mv.setViewName("/teacher/teacher_profile");
		return mv;
	}
	
	@PostMapping("/profile")
	public ModelAndView update(@RequestParam ("firstName") String fistName, @RequestParam ("lastName") String lastName, @RequestParam ("mobno") double mobNo, @RequestParam ("username") String userName, @RequestParam ("email") String email, @RequestParam ("qualification") String qualification, @RequestParam ("experience") int experience)
	{
		Teacher teacher = new Teacher();
		teacher.setFirstName(fistName);
		teacher.setLastName(lastName);
		teacher.setMobileNo(mobNo);
		teacher.setUserName(userName);
		teacher.setEmailId(email);
		teacher.setQualification(qualification);
		teacher.setExperience(experience);
		
		mv.addObject("teacher", dao.update(teacher)); //request.setAttribute
		mv.setViewName("redirect:/teacher/profile");
		
		
		return mv;
	}
	
	
	
	
}

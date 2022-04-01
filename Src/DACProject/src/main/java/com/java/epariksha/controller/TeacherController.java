package com.java.epariksha.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.SubjectDAOImpl;
import com.java.epariksha.dao.TeacherDAOImpl;
import com.java.epariksha.entity.Subject;
import com.java.epariksha.entity.Teacher;

@Controller
public class TeacherController {


	@Autowired
	TeacherDAOImpl dao;
	
	@Autowired
	SubjectDAOImpl subjectDao;

	ModelAndView mv = new ModelAndView(); 

	//--------------------------------------------------------------
	//	ADMIN CONTROLLERS


	//done
	@GetMapping("/admin/teacher")
	public ModelAndView admin_teacher() 
	{
		List<Teacher> list = (List<Teacher>) dao.getAll();
		mv.addObject("teachers", list); //request.setAttribute
		mv.setViewName("admin/teacher");
		return mv;
	}


	//working
	@GetMapping("/admin/teacher_add")
	public ModelAndView admin_teacher_add() 
	{
		List<Subject> list = subjectDao.getAll();
		mv.addObject("subjects", list);  //attached subject lists
		mv.setViewName("admin/teacher_add");
		return mv;
	}

	//working
	@PostMapping("/admin/teacher_add") 
	public ModelAndView teacher_add(@ModelAttribute("teacherAddForm") Teacher teacher) 
	{
		System.out.println(teacher + " ");
		mv.addObject("teachers", dao.save(teacher)); //request.setAttribute
		mv.setViewName("redirect:/admin/teacher");
		return mv;
	}





	//------------------------------------------------------------------
	//	TEACHER CONTROLLERS

	//working
	@GetMapping("/teacher/teacher_profile")
	public ModelAndView teacher_profile(HttpServletRequest request) 
	{
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		mv.addObject("teach", teacher);//request.setAttribute (session data)
		mv.setViewName("/teacher/teacher_profile");
		return mv;
	}

	@PostMapping("/profile")
	public ModelAndView update(@RequestParam ("firstName") String fistName, @RequestParam ("lastName") String lastName, @RequestParam ("mobno") long mobNo, @RequestParam ("username") String userName, @RequestParam ("email") String email, @RequestParam ("qualification") String qualification, @RequestParam ("experience") int experience)
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

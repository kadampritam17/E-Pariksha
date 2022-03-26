package com.java.epariksha.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.java.epariksha.dao.LoginDAO;
import com.java.epariksha.entity.Student;
import com.java.epariksha.entity.Teacher;


@Controller

public class LoginController {

	@Autowired
	LoginDAO dao;
		
	ModelAndView mv = new ModelAndView();
	
	@GetMapping("/admin_login")
	public ModelAndView admin_login()
	{
		mv.setViewName("admin_login");
		return mv;
	}
	
	
	
	@PostMapping("/admin/home")
	public ModelAndView admin_login(@RequestParam String username, @RequestParam String password)
	{
		if(username.equalsIgnoreCase("admin@gmail.com") && password.equals("admin"))
		{
			System.out.println("adminlogin success");
			mv.setViewName("admin/home");
			return mv;
		}
		else
		{
			mv.addObject("errMsg", "username / password incorrect");
			mv.setViewName("redirect:/admin_login");
			return mv;	
		}
		
		
	}
	
	

	@GetMapping("/teacher_login")
	public ModelAndView teacher_login()
	{
		mv.setViewName("teacher_login");
		return mv;
	}
	
	
	@PostMapping("/teacher/home")
	public ModelAndView teacher_login(@RequestParam String username, @RequestParam String password)
	{
		//validate method in dao
		//call here
		Teacher teacher = dao.validateTeacher(username, password);
		if(teacher != null)
		{
			mv.setViewName("teacher/home");
			return mv;
		}
		else
		{
			mv.addObject("errMsg", "username / password incorrect");
			mv.setViewName("redirect:/teacher_login");
			return mv;	
		}
		
	}
	

	@GetMapping("/student_login")
	public ModelAndView student_login()
	{
		mv.setViewName("student_login");
		return mv;	
	}
	
	
	@PostMapping("/student/home")
	public ModelAndView  student_login(@RequestParam String username, @RequestParam String password)
	{
		Student student = dao.validateStudent(username, password);
		
		if(student != null)
		{
			System.out.println("student login success");
			mv.setViewName("student/home");	
			return mv;
		}
		else
		{
			mv.addObject("errMsg", "username / password incorrect");
			mv.setViewName("redirect:/student_login");	
			return mv;
		}
		
	}
	
	
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		//if
		session.removeAttribute("username");
		return "redirect:../account";
	}

	
}

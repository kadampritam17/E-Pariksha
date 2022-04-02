package com.java.epariksha.controller;

import javax.servlet.http.HttpServletRequest;
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
import com.java.epariksha.dao.TeacherDAOImpl;
import com.java.epariksha.entity.Student;
import com.java.epariksha.entity.Teacher;


@Controller

public class LoginController {

	@Autowired
	LoginDAO dao;
	
	@Autowired
	TeacherDAOImpl teacherDao;
		
	ModelAndView mv = new ModelAndView();
	
	//done
	@GetMapping("/admin_login")
	public ModelAndView admin_login()
	{
		mv.setViewName("admin_login");
		return mv;
	}
	
	
	//done
	@PostMapping("/admin/home")
	public ModelAndView admin_login(@RequestParam String username, @RequestParam String password, HttpSession session)
	{
		if(username.equalsIgnoreCase("admin@gmail.com") && password.equals("admin"))
		{
			System.out.println("adminlogin success");
			session.setAttribute("username", username);
//			System.out.println(session.get);;
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
	
	
	@RequestMapping(value = "/admin/adminlogout", method = RequestMethod.GET)
	public String adminlogout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:../index";
	}
	
	
	
	//done
	@GetMapping("/teacher_login")
	public ModelAndView teacher_login()
	{
		mv.setViewName("teacher_login");
		return mv;
	}
	
	

	//done
	@PostMapping("/teacher/home")
	public ModelAndView teacher_login(@RequestParam String username, @RequestParam String password, HttpServletRequest request)
	{
		//validate method in dao
		//call here
		Teacher teacher = dao.validateTeacher(username, password);
		if(teacher != null)
		{
			request.getSession().setAttribute("teacher",teacher);
//			session.setAttribute("teacher", teacher);
			mv.addObject("teach", teacher);//request.setAttribute (session data)

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
	
	//done
	@RequestMapping(value = "/teacher/teacherlogout", method = RequestMethod.GET)
	public String teacherlogout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:../index";
	}

	
	
	
	
	
	
	//done
	@GetMapping("/student_login")
	public ModelAndView student_login()
	{
		mv.setViewName("student_login");
		return mv;	
	}
	
	
	@PostMapping("/student/home")
	public ModelAndView  student_login( HttpSession session, @RequestParam String username, @RequestParam String password)
	{
		Student student = dao.validateStudent(username, password);
		
		if(student != null)
		{
			session.setAttribute("student", student);
		//	System.out.println("student login success");
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
	
	
	
	@RequestMapping(value = "/student/studentlogout", method = RequestMethod.GET)
	public String studentlogout(HttpSession session) {
		session.removeAttribute("student");
		return "redirect:../index";
	}

	
}

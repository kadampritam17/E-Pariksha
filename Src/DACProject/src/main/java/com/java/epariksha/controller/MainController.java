package com.java.epariksha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/index")
	public String f1()
	{
		return "index";
	}
	
	
	
	@GetMapping("/admin/home")
	public String f4()
	{
		return "admin/home";
	}
	
	
	@GetMapping("/student/home")
	public String f2()
	{
		return "student/home";
	}
	
	
	
	@GetMapping("/teacher/home")
	public String f3()
	{
		return "teacher/home";
	}
	
}

package com.java.epariksha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExamController {

	

	@GetMapping("/admin/exam")
	public String f4()
	{
		return "admin/exam";
	}
	
	
}

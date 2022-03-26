package com.java.epariksha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExamHistoryController {

	
	@GetMapping("/admin/exam_history")
	public String examHistory()
	{
		return "admin/exam_history";
	}
	
	
	
}

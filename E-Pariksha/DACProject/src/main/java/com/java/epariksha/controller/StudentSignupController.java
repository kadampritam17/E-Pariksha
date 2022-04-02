package com.java.epariksha.controller;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.java.epariksha.dao.StudentSignupDAO;

@Controller
public class StudentSignupController {

	@Autowired
	StudentSignupDAO dao;
	
	@GetMapping("/student_signup")
	public String f1()
	{
		return "student_signup";
	}

	@PostMapping(path="/signup")
	public String  register(@RequestParam String firstName, @RequestParam String lastName, @RequestParam long mobNo, @RequestParam Date Dob, @RequestParam String userName, @RequestParam String password, @RequestParam String emailId)
	{
		dao.register(firstName, lastName, mobNo, Dob, userName, password, emailId);
		return "student_login";
	}


}

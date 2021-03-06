package com.java.epariksha.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.java.epariksha.dao.LoginDAO;
import com.java.epariksha.dao.StudentDAOImpl;
import com.java.epariksha.entity.Student;


@CrossOrigin
@RestController
public class StudentRestController {

	@Autowired
	LoginDAO loginDao;

	@Autowired
	StudentDAOImpl studentDao;
	//--------------------------------------------------------------
	//	STUDENT CONTROLLERS


	//test plz
	@PostMapping("/login")
	public Student student_login(@RequestBody Student student, HttpServletRequest request) 
	{
		System.out.println(student);
		Student stud = loginDao.validateStudent(student.getUserName(), student.getPassword());
		if(stud != null)
		{
			request.getSession().setAttribute("student", stud);
			//	System.out.println("student login success");
			return stud;
		}
		else
		{
			return null;
		}

	}

	
	//test plz
	@RequestMapping(value = "/student/logout", method = RequestMethod.GET)
	public String teacherlogout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "success";
	}
	


	//test plz
	@GetMapping("/student")
	public Student student_getDetails(HttpServletRequest request) 
	{
		HttpSession session = request.getSession();
		Student student = (Student)session.getAttribute("student");
		return student;
	}
}

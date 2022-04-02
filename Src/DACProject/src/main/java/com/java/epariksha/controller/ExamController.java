package com.java.epariksha.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.CSVService;
import com.java.epariksha.dao.ExamDAOImpl;
import com.java.epariksha.dao.SubjectDAOImpl;
import com.java.epariksha.dao.TeacherDAOImpl;
import com.java.epariksha.entity.Exam;
import com.java.epariksha.entity.Question;
import com.java.epariksha.entity.Result;
import com.java.epariksha.entity.Subject;
import com.java.epariksha.entity.Teacher;
import com.java.epariksha.helper.CSVHelper;
import com.java.epariksha.message.ResponseMessage;

@Controller
//@RequestMapping("/admin")
public class ExamController {

	@Autowired
	ExamDAOImpl dao;

	@Autowired
	SubjectDAOImpl subDAO;

	@Autowired
	TeacherDAOImpl TeacherDAO;

	@Autowired
	CSVService fileService;


	ModelAndView mv = new ModelAndView(); 

	//--------------------------------------------------------------
	//	ADMIN CONTROLLERS

	//done
	@GetMapping("/admin/exam")
	public ModelAndView admin_exam() 
	{
		List<Exam> list = dao.getAll();
		mv.addObject("exams", list); //request.setAttribute
		mv.setViewName("admin/exam");
		return mv;
	}


	//------------------------------------------------------------------
	//	TEACHER CONTROLLERS


	//working
	@GetMapping("/teacher/exam_add")
	public ModelAndView teacher_exam_add(HttpServletRequest request) 
	{
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");

		List<Subject> list = subDAO.getAll();

		mv.addObject("teach", teacher);//request.setAttribute (session data)
		mv.addObject("subjects", list); //request.setAttribute
		mv.setViewName("teacher/exam_add");
		return mv;
	}


	@PostMapping("/teacher/exam_add") 
	public ModelAndView exam_add(@RequestParam("subject") Subject subject, @RequestParam("teacher") Teacher teacher, @RequestParam("examName") String examName, @RequestParam("import_file") MultipartFile importFile, @RequestParam("examDate") String examDate, @RequestParam("actualTime") int actualTime, @RequestParam("loginTime") int loginTime,@RequestParam("marks") int marks, @RequestParam("examLevel") String examLevel) throws ParseException 
	{
		Date newexamdate=new SimpleDateFormat("yyyy-MM-dd").parse(examDate);
		//		System.out.println( "this is exam constructor"+ subject + " " + teacher  + " " + examName + " " + importFile + " " + newexamdate + " " + actualTime + " " + loginTime + " " + examLevel  );

		List<Question> queList = uploadFile(importFile, subject);
		int noOfQue = queList.size();

		//		dao.add(subject,teacher,examName,examDate, actualTime, loginTime, examLevel,noOfQue,queList);

		mv.addObject("exam", dao.add(subject,teacher,examName,newexamdate, actualTime, loginTime, examLevel,noOfQue,queList,marks)); //request.setAttribute
		mv.setViewName("redirect:/teacher/exam");
		return mv;
	}



	public List<Question> uploadFile(MultipartFile file,Subject subject) {
		String message = "";
		List<Question> questionCount= new ArrayList();
		if (CSVHelper.hasCSVFormat(file)) {
			try {
				questionCount = fileService.save(file,subject);

				message = "Uploaded the file successfully: " + file.getOriginalFilename();

			} catch (Exception e) {
				message = "Could not upload the file: " + file.getOriginalFilename() + "!";
				return questionCount;
			}
		}
		return questionCount;
	}





	//done
	@GetMapping("/teacher/exam")
	public ModelAndView teacher_exam(HttpServletRequest request) 
	{
		HttpSession session = request.getSession();
		Teacher teacher = (Teacher)session.getAttribute("teacher");
		mv.addObject("teach", teacher);//request.setAttribute (session data)
		List<Exam> list = dao.getAll();
		mv.addObject("exams", list); //request.setAttribute
		mv.setViewName("teacher/exam");
		return mv;
	}
}

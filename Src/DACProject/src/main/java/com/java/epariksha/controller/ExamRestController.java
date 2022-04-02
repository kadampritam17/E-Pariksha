package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.epariksha.dao.ExamDAOImpl;
import com.java.epariksha.entity.Exam;
import com.java.epariksha.entity.Question;

@CrossOrigin
@RestController
public class ExamRestController {

	@Autowired
	ExamDAOImpl dao;


	@GetMapping("/student/getAllExam")
	public List<Exam> student_getAllExam() 
	{
		List<Exam> list = dao.getAll();
		return list;
	}



	@GetMapping("/student/getQuestionByExamId")
	public List<Question> student_getQuestionByExamId(@RequestParam int id) 
	{
		List<Question> list = dao.getQuestionByExamId(id);
		return list;
	}


	@GetMapping("/student/getAllPreviousExams")
	public List<Exam> student_getAllPreviousExams() 
	{
		List<Exam> list = dao.getAllPreviousExams();
		return list;
	}





}
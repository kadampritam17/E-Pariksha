package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.java.epariksha.dao.QuestionDAOImpl;
import com.java.epariksha.entity.Question;
import com.java.epariksha.entity.Question;

@CrossOrigin
@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	QuestionDAOImpl dao;

	ModelAndView mv = new ModelAndView(); 
	
	
	@GetMapping("/admin/question")
	public ModelAndView admin_question() 
	{
		List<Question> list = dao.getAll();
		mv.addObject("questions", list); //request.setAttribute
		mv.setViewName("admin/question");
		return mv;
	}
	
	
	@PostMapping("/question_add") 
	public ModelAndView question_add(@RequestParam("question_id") String questionId, 
			@RequestParam("subject_id") String subjectId, 
			@RequestParam("question") String question,
			@RequestParam("question_level") String questionLevel, 
			@RequestParam("answer") String answer, 
			@RequestParam("option1") String option1, 
			@RequestParam("option2") String option2, 
			@RequestParam("option3") String option3, 
			@RequestParam("option4") String option4) 
	{
		System.out.println(subjectId +" "+ question);
		//System.out.println(question.toString());
		Question que = new Question(  );
		que.setQuestionId(Integer.parseInt(questionId));
		que.setQuestion(question);
		que.setQuestionLevel(questionLevel);
		que.setAnswer(answer);
		que.setOption1(option1);
		que.setOption2(option2);
		que.setOption3(option3);
		que.setOption4(option4);
		
		mv.addObject("questions", dao.save(que)); //request.setAttribute
		mv.setViewName("redirect:/admin/question");
		return mv;
	}

	
}

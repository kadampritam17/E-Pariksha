package com.java.epariksha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.java.epariksha.dao.QuestionDAOImpl;
import com.java.epariksha.entity.Question;

@CrossOrigin
@RestController
public class QuestionRestController {

	@Autowired
	QuestionDAOImpl dao;

	//done
	@GetMapping("/admin/getquestions")
	public List<Question> admin_question() {
		return dao.getAll();
	}
	
	//wrong
//	@PostMapping("/admin/question_add") 
//	public String question_add(@RequestBody Question que)
//	{
//		return dao.save(que);
//	}
	

	/*
	 * @PostMapping("/admin/question_add") public ModelAndView question_add(
	 * 
	 * @RequestBody int subjectId,
	 * 
	 * @RequestParam("question") String question,
	 * 
	 * @RequestParam("question_level") String questionLevel,
	 * 
	 * @RequestParam("answer") String answer,
	 * 
	 * @RequestParam("option1") String option1,
	 * 
	 * @RequestParam("option2") String option2,
	 * 
	 * @RequestParam("option3") String option3,
	 * 
	 * @RequestParam("option4") String option4)
	 * 
	 * public ModelAndView question_add(
	 * 
	 * @RequestBody Question que){ // System.out.println(que.subject_id );
	 * System.out.println(que.toString()); // Question que = new Question( );
	 * //que.setQuestionId(questionId); // que.setQuestion(question); //
	 * que.setQuestionLevel(questionLevel); // que.setAnswer(answer); //
	 * que.setOption1(option1); // que.setOption2(option2); //
	 * que.setOption3(option3); // que.setOption4(option4); //
	 * mv.addObject("questions", dao.save(que)); //request.setAttribute
	 * mv.setViewName("redirect:/admin/question"); return mv; }
	 */

}

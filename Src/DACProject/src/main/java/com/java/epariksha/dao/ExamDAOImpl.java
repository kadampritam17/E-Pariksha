package com.java.epariksha.dao;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Exam;
import com.java.epariksha.entity.Question;
import com.java.epariksha.entity.Subject;
import com.java.epariksha.entity.Teacher;
import com.java.epariksha.repository.ExamRepository;

@Service
public class ExamDAOImpl implements ExamDAO {

	@Autowired
	ExamRepository examRepository;


	public List<Exam> getAll() {
		return examRepository.findAll();
	}


	public List<Exam> getAllPreviousExams() {
		return examRepository.findAllPreviousExams();
	}


	public Exam add(Subject subject, Teacher teacher, String examName, Date newexamdate, int actualTime, int loginTime,
			String examLevel, int noOfQue, List<Question> queList, int marks) 
	{
		Exam exam= new Exam(subject,teacher,actualTime,newexamdate,examLevel,examName,noOfQue,loginTime,marks);

		exam.setQuestionInfoTbl(queList);
		examRepository.save(exam);

		return exam;
	}


	public List<Question> getQuestionByExamId(int id) {
		
		List<Question> list = examRepository.getQuestionByExamId(id);
		return list;
	}
	
	//done
	public void delete(int id) {
		examRepository.deleteById(id);
	}



}
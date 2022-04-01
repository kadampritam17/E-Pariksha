package com.java.epariksha.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "exam_question_map_info_tbl")
public class ExamQuestionMap implements Serializable
{
	
	//@Column(name = "question_id")  //FK int
	@Id
	@ManyToOne(cascade=CascadeType.ALL)
	private Question question;
	
	
	//@Column(name = "exam_id")  //FK int
	@Id
	@ManyToOne(cascade=CascadeType.ALL)
	private Exam exam;

	private static final long serialVersionUID = 17154676L;
	
	public ExamQuestionMap() {
		super();
	}

	public ExamQuestionMap(Question question, Exam exam) {
		super();
		this.question = question;
		this.exam = exam;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "question=" + question + ", exam=" + exam ;
	}

	
	
	
}

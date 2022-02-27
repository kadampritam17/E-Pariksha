package com.epariksha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "question_info_tbl")
public class Question {
	
	
	@Column(name = "exam_id")  //PK int
	@Id
	private int examId;
	
	
	@Column(name = "subject_id")  //FK  int
	@OneToMany
	private int subjectId;
	
	
	@Column(name = "question_level")  //varchar
	private String questionLevel;

	
	@Column(name = "question")   //varchar
	private String question;
	
	
	@Column(name = "option1")  //varchar
	private String option1;
	
	
	@Column(name = "option2")  //varchar
	private String option2;
	
	@Column(name = "option3") //varchar
	private String option3;
	
	
	@Column(name = "option4") //varchar
	private String option4;
	
	
	@Column(name = "answer") //varchar
	private String answer;
	
	
	public Question() {
		super();
	}

	
}

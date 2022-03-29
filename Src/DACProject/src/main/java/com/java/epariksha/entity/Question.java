package com.java.epariksha.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "question_info_tbl")
public class Question {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="question_id",unique=true,nullable=false) //primary key int
	private int questionId;
	
	@OneToMany(mappedBy = "question")
	private List<ExamQuestionMap> examquestion;
	
	@ManyToOne
	@JoinColumn(name="subject_id")
	private Subject subject;
	
	
	@JsonProperty("subjectId")
	private void unpackNested(Integer subjectId) {
	    this.subject = new Subject();
	    subject.setSubjectId(subjectId);
	}


	public List<ExamQuestionMap> getExamquestion() {
		return examquestion;
	}


	public void setExamquestion(List<ExamQuestionMap> examquestion) {
		this.examquestion = examquestion;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


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


	public Question(int questionId, String questionLevel, String question, String option1, String option2,
			String option3, String option4, String answer) {
		super();
		this.questionId = questionId;
		this.questionLevel = questionLevel;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
	}


	public int getQuestionId() {
		return questionId;
	}


	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}


	public String getQuestionLevel() {
		return questionLevel;
	}


	public void setQuestionLevel(String questionLevel) {
		this.questionLevel = questionLevel;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getOption1() {
		return option1;
	}


	public void setOption1(String option1) {
		this.option1 = option1;
	}


	public String getOption2() {
		return option2;
	}


	public void setOption2(String option2) {
		this.option2 = option2;
	}


	public String getOption3() {
		return option3;
	}


	public void setOption3(String option3) {
		this.option3 = option3;
	}


	public String getOption4() {
		return option4;
	}


	public void setOption4(String option4) {
		this.option4 = option4;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "questionId=" + questionId + ", questionLevel=" + questionLevel + ", question=" + question
				+ ", option1=" + option1 + ", option2=" + option2 + ", option3=" + option3 + ", option4=" + option4
				+ ", answer=" + answer;
	}

	
	
	
}

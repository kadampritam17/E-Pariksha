package com.java.epariksha.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "subject_info_tbl")
public class Subject {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="subject_id",unique=true,nullable=false) //primary key int
	private int subjectId;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "subject")
	private List<Exam> exam;
	
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy = "subject")
	private List<Question> question;
	
	
	@OneToMany(mappedBy="subject")
	private List<TeacherSubject> teacherSubject;
	
	@JsonCreator(mode = JsonCreator.Mode.DELEGATING)
	private Subject (@JsonProperty("subjectId") Integer subject ) {
	    this.subjectId = subject;
	}
	
	

	
	@Column(name = "subject_name")  //varchar
	private String subjectName;
	
	
	@Column(name = "subject_description")  //varchar
	private String subjectDescription;

	
	public Subject() {
		super();
	}


	public Subject(int subjectId, List<Exam> exam, List<Question> question, String subjectName,
			String subjectDescription) {
		super();
		this.subjectId = subjectId;
		this.exam = exam;
		this.question = question;
		this.subjectName = subjectName;
		this.subjectDescription = subjectDescription;
	}


	public int getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}


	public List<Exam> getExam() {
		return exam;
	}


	public void setExam(List<Exam> exam) {
		this.exam = exam;
	}


	public List<Question> getQuestion() {
		return question;
	}


	public void setQuestion(List<Question> question) {
		this.question = question;
	}


	public String getSubjectName() {
		return subjectName;
	}


	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}


	public String getSubjectDescription() {
		return subjectDescription;
	}


	public void setSubjectDescription(String subjectDescription) {
		this.subjectDescription = subjectDescription;
	}


	@Override
	public String toString() {
		return "subjectId=" + subjectId + ", exam=" + exam + ", question=" + question + ", subjectName="
				+ subjectName + ", subjectDescription=" + subjectDescription ;
	}
	
	
	
	
}

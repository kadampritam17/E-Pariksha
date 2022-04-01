package com.java.epariksha.entity;

import java.sql.Time;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "exam_info_tbl")
public class Exam {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="exam_id",unique=true,nullable=false) //primary key int
	private int examId;
	
	
	@OneToMany(mappedBy = "exam")
	private List<ExamQuestionMap> examQuestion;
	
	
	@Column(name = "exam_name")  //varchar
	private String examName;
	
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "exam_date")  //date
	private Date examDate;
	
	
	@Column(name = "no_of_question")  //int
	private int noOfQuestion;
	
	
	@Column(name = "marks")  //int
	private int marks;
	
	
	@Column(name = "actual_time")  //Time
	private Time actualTime;
	
	
	@Column(name = "login_time")  //Time
	private Time loginTime;
	
	
	@Column(name = "exam_status") //tinyint
	private Boolean examStatus;
	
	
	@Column(name = "exam_level") //varchar(10)
	private String examLevel;

	
	@ManyToOne
	@JoinColumn(name="subject_id")
	private Subject subject;
	
	
	@ManyToOne
	@JoinColumn(name="teacher_id")
	private Teacher teacher;
	
	
	
	public Exam() {
		super();
	}


	public Exam(int examId, String examName, Date examDate, int noOfQuestion, int marks, Time actualTime,
			Time loginTime, Boolean examStatus, String examLevel) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examDate = examDate;
		this.noOfQuestion = noOfQuestion;
		this.marks = marks;
		this.actualTime = actualTime;
		this.loginTime = loginTime;
		this.examStatus = examStatus;
		this.examLevel = examLevel;
	}


	public int getExamId() {
		return examId;
	}


	public void setExamId(int examId) {
		this.examId = examId;
	}


	public String getExamName() {
		return examName;
	}


	public void setExamName(String examName) {
		this.examName = examName;
	}


	public Date getExamDate() {
		return examDate;
	}


	public void setExamDate(Date examDate) {
		this.examDate = examDate;
	}


	public int getNoOfQuestion() {
		return noOfQuestion;
	}


	public void setNoOfQuestion(int noOfQuestion) {
		this.noOfQuestion = noOfQuestion;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public Time getActualTime() {
		return actualTime;
	}


	public void setActualTime(Time actualTime) {
		this.actualTime = actualTime;
	}


	public Time getLoginTime() {
		return loginTime;
	}


	public void setLoginTime(Time loginTime) {
		this.loginTime = loginTime;
	}


	public Boolean getExamStatus() {
		return examStatus;
	}


	public void setExamStatus(Boolean examStatus) {
		this.examStatus = examStatus;
	}


	public String getExamLevel() {
		return examLevel;
	}


	public void setExamLevel(String examLevel) {
		this.examLevel = examLevel;
	}


	@Override
	public String toString() {
		return "examId=" + examId + ", examName=" + examName + ", examDate=" + examDate + ", noOfQuestion="
				+ noOfQuestion + ", marks=" + marks + ", actualTime=" + actualTime + ", loginTime=" + loginTime
				+ ", examStatus=" + examStatus + ", examLevel=" + examLevel;
	}

	
	
	
}

package com.java.epariksha.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	
	
	@ManyToMany
    @JoinTable(
            name = "exam_question_map_info_tbl",
            joinColumns = @JoinColumn(name = "exam_exam_id"),
            inverseJoinColumns = @JoinColumn(name = "question_question_id")
    )
    private List<Question> questionInfoTbl = new ArrayList<>();
	
	
	
	@Column(name = "exam_name")  //varchar
	private String examName;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "exam_date")  //date
	private Date examDate;
	
	
	@Column(name = "no_of_question")  //int
	private int noOfQuestion;
	
	
	@Column(name = "marks")  //int
	private int marks;
	
	
	@Column(name = "actual_time")  //Time
	private int actualTime;
	
	
	@Column(name = "login_time")  //Time
	private int loginTime;
	
	
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

//
//	public Exam(int examId, String examName, Date examDate, int noOfQuestion, int marks, int actualTime,
//			int loginTime, Boolean examStatus, String examLevel) {
//		super();
//		this.examId = examId;
//		this.examName = examName;
//		this.examDate = examDate;
//		this.noOfQuestion = noOfQuestion;
//		this.marks = marks;
//		this.actualTime = actualTime;
//		this.loginTime = loginTime;
//		this.examStatus = examStatus;
//		this.examLevel = examLevel;
//	}
	
	// used in examDaoImpl
	public Exam(Subject subject, Teacher teacher, int actualTime, Date newexamdate, String examLevel,
			String examName, int noOfQue, int loginTime, int marks) {
		super();
		this.examName = examName;
		this.examDate = newexamdate;
		this.noOfQuestion = noOfQue;
		this.marks = marks;
		this.actualTime = actualTime;
		this.loginTime = loginTime;
		this.examStatus = true;
		this.examLevel = examLevel;
		this.subject=subject;
		this.teacher=teacher;
	}


	public List<Question> getQuestionInfoTbl() {
		return questionInfoTbl;
	}


	public void setQuestionInfoTbl(List<Question> questionInfoTbl) {
		this.questionInfoTbl = questionInfoTbl;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public Teacher getTeacher() {
		return teacher;
	}


	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
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


	public int getActualTime() {
		return actualTime;
	}


	public void setActualTime(int actualTime) {
		this.actualTime = actualTime;
	}


	public int getLoginTime() {
		return loginTime;
	}


	public void setLoginTime(int loginTime) {
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

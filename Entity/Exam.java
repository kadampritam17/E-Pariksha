package com.epariksha.entity;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "exam_info_tbl")
public class Exam {
	
	
	@Column(name = "exam_id")  //PK  int
	@Id
	private int examId;
	
	
	@Column(name = "subject_id")  //FK int
	@OneToMany
	private int subjectId;
	
	
	@Column(name = "teacher_id")  //FK  int
	@OneToMany
	private int teacherId;
	
	
	@Column(name = "exam_name")  //varchar
	private String examName;
	
	
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

	
	public Exam() {
		super();
	}

	
}

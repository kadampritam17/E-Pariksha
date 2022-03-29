package com.java.epariksha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "result_info_tbl")
public class Result {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="result_id",unique=true,nullable=false) //primary key int
	private int resultId;
	
	
	@ManyToOne
	@JoinColumn(name="student_id")
	private Student student;
	

	@ManyToOne
	@JoinColumn(name="exam_id")
	private Exam exam;
	
	@Column(name = "marks") //int
	private int marks;

	
	public Result() {
		super();
	}


	public Result(int resultId, int marks) {
		super();
		this.resultId = resultId;
		this.marks = marks;
	}


	public int getResultId() {
		return resultId;
	}


	public void setResultId(int resultId) {
		this.resultId = resultId;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	@Override
	public String toString() {
		return "resultId=" + resultId + ", marks=" + marks ;
	}

	
	

}

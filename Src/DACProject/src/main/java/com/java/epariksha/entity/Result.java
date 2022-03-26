package com.java.epariksha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "result_info_tbl")
public class Result {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="result_id",unique=true,nullable=false) //primary key int
	private int resultId;
	
	//@Column(name = "student_id") //from student table 
	//FK int
//	@ManyToOne
//	private Student student;
	
	//@Column(name = "exam_id") //FK int
//	@ManyToOne
//	private Exam exam;
	
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

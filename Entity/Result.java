package com.epariksha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "result_info_tbl")
public class Result {
	
	@Column(name = "result_id")   //PK int
	@Id
	private int resultId;
	
	@Column(name = "student_id") //FK int
	@OneToMany
	private int studentId;
	
	@Column(name = "exam_id") //FK int
	@OneToMany
	private int examId;
	
	@Column(name = "marks") //int
	private int marks;

	
	public Result() {
		super();
	}

	

}

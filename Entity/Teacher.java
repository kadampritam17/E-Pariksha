package com.epariksha.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher_info_tbl")
public class Teacher {

	@Column(name = "teacher_id")  //PK  int
	@Id
	@ManyToOne
	private int teacherId;  

	@Column(name = "teacher_firstname") //varchar
	private String firstName;

	
	@Column(name = "teacher_lastname") //varchar
	private String lastName;

	
	@Column(name = "teacher_mobile") //UK //varchar
	private double mobileNo; 

	
	@Column(name = "teacher_dob")   //Date
	private Date dob;

	
	@Column(name = "teacher_username") //UK   //varchar
	private String userName;

	
	@Column(name = "teacher_password") //varchar
	private String password; 

	
	@Column(name = "teacher_email_id")  //UK  //varchar
	private String emailId;

	
	@Column(name = "teacher_qualification")  //int
	private int qualification;

	
	@Column(name = "teacher_experience")  //int
	private int experience;


	public Teacher() {
		super();
	}

	
}

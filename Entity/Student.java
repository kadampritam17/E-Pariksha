package com.epariksha.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_info_tbl")
public class Student {
	
	@Column(name = "student_id") //primary key int
	@Id
	private int studentId;
	
	
	@Column(name = "student_firstname") //varchar
	private String firstName;
	
	
	@Column(name = "student_lastname") //varchar
	private String lastName;
	
	
	@Column(name = "student_mobile") //varchar   UK
	private double mobileNo;
	
	
	@Column(name = "student_dob")	//Date  
	private Date dob;
	
	
	@Column(name = "student_username") //varchar UK
	private String userName; 
	
	
	@Column(name = "student_password") //varchar
	private String password;
	
	
	@Column(name = "student_email_id") //varchar  UK
	private String emailId; 
	
	
	@Column(name = "ssc_percentage")	//int
	private double sscPercentage;
	
	
	@Column(name = "hsc_percentage")  //int
	private double hscPercentage;
	
	
	@Column(name = "degree_percentage")  //int
	private double degreePercentage;
	
	
	public Student() {
		super();
	}

	
	
}

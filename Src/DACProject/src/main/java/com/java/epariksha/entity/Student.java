package com.java.epariksha.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student_info_tbl")
public class Student {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_id",unique=true,nullable=false) //primary key int
	private int studentId;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="student_id",nullable=false)
	private List<Result> result;
	
	
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
	
	
	@Column(name = "student_ssc_percentage")	//int
	private double sscPercentage;
	
	
	@Column(name = "student_hsc_percentage")  //int
	private double hscPercentage;
	
	
	@Column(name = "student_degree_percentage")  //int
	private double degreePercentage;
	
	
	public Student() {
		super();
	}


	public Student(int studentId, List<Result> result, String firstName, String lastName, double mobileNo, Date dob,
			String userName, String password, String emailId, double sscPercentage, double hscPercentage,
			double degreePercentage) {
		super();
		this.studentId = studentId;
		this.result = result;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.sscPercentage = sscPercentage;
		this.hscPercentage = hscPercentage;
		this.degreePercentage = degreePercentage;
	}


	public Student(String firstName, String lastName, double mobno, Date dob, String username, String password,
			String emailid) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobno;
		this.dob = dob;
		this.userName = username;
		this.password = password;
		this.emailId = emailid;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public List<Result> getResult() {
		return result;
	}


	public void setResult(List<Result> result) {
		this.result = result;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(double mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public double getSscPercentage() {
		return sscPercentage;
	}


	public void setSscPercentage(double sscPercentage) {
		this.sscPercentage = sscPercentage;
	}


	public double getHscPercentage() {
		return hscPercentage;
	}


	public void setHscPercentage(double hscPercentage) {
		this.hscPercentage = hscPercentage;
	}


	public double getDegreePercentage() {
		return degreePercentage;
	}


	public void setDegreePercentage(double degreePercentage) {
		this.degreePercentage = degreePercentage;
	}


	@Override
	public String toString() {
		return "studentId=" + studentId + ", result=" + result + ", firstName=" + firstName + ", lastName="
				+ lastName + ", mobileNo=" + mobileNo + ", dob=" + dob + ", userName=" + userName + ", password="
				+ password + ", emailId=" + emailId + ", sscPercentage=" + sscPercentage + ", hscPercentage="
				+ hscPercentage + ", degreePercentage=" + degreePercentage;
	}

	
	
	
	
	
}

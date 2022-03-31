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
@Table(name="teacher_info_tbl")
public class Teacher {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="teacher_id",unique=true,nullable=false) //primary key int
	private int teacherId;  

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_id",nullable=false)
	public List<Exam> exam;
	
//	@OneToMany(cascade=CascadeType.ALL)
//	@JoinColumn(name="teacher_id",nullable=false)
//	public List<TeacherSubject> teacherSubject;
	
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
	private String qualification;

	
	@Column(name = "teacher_experience")  //int
	private int experience;


	public Teacher() {
		super();
	}


	public Teacher(int teacherId, List<Exam> exam, String firstName, String lastName, double mobileNo, Date dob,
			String userName, String password, String emailId, String qualification, int experience) {
		super();
		this.teacherId = teacherId;
		this.exam = exam;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNo = mobileNo;
		this.dob = dob;
		this.userName = userName;
		this.password = password;
		this.emailId = emailId;
		this.qualification = qualification;
		this.experience = experience;
	}


	public int getTeacherId() {
		return teacherId;
	}


	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}


	public List<Exam> getExam() {
		return exam;
	}


	public void setExam(List<Exam> exam) {
		this.exam = exam;
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


	public String getQualification() {
		return qualification;
	}


	public void setQualification(String qualification) {
		this.qualification = qualification;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	@Override
	public String toString() {
		return "teacherId=" + teacherId + ", exam=" + exam + ", firstName=" + firstName + ", lastName="
				+ lastName + ", mobileNo=" + mobileNo + ", dob=" + dob + ", userName=" + userName + ", password="
				+ password + ", emailId=" + emailId + ", qualification=" + qualification + ", experience=" + experience
				;
	}

	
}

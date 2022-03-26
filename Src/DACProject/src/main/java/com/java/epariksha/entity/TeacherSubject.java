package com.java.epariksha.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_subject_info_tbl")
public class TeacherSubject implements Serializable
{
	
	@Id
	@ManyToOne(cascade=CascadeType.ALL)
	private Teacher techer;
	

	@Id
	@ManyToOne(cascade=CascadeType.ALL)
	private Subject subject;

	private static final long serialVersionUID = 1798070786993154676L;
	
	
	public TeacherSubject() {
		super();
	}


	public TeacherSubject(Teacher techer, Subject subject) {
		super();
		this.techer = techer;
		this.subject = subject;
	}


	public Teacher getTecher() {
		return techer;
	}


	public void setTecher(Teacher techer) {
		this.techer = techer;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "techer=" + techer + ", subject=" + subject ;
	}

	
	
	
}

package com.epariksha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "subject_info_tbl")
public class Subject {
	
	@Column(name = "subject_id")  //PK int
	@Id
	@ManyToOne
	private int subjectId;
	
	
	@Column(name = "subject_name")  //varchar
	private String subjectName;
	
	
	@Column(name = "subject_description")  //varchar
	private String subjectDescription;

	
	public Subject() {
		super();
	}
	
	
}

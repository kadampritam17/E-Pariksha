package com.epariksha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_subject_info_tbl")
public class TeacherSubject {
	
	@Column(name = "teacher_id")   //FK int
	@OneToMany
	private int teacherId;
	
	@Column(name = "subject_id")   //FK int
	@OneToMany
	private int subjectId;

	public TeacherSubject() {
		super();
	}

	
}

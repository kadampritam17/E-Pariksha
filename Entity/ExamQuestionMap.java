package com.epariksha.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "exam_question_map_info_tbl")
public class ExamQuestionMap {
	
	@Column(name = "question_id")  //FK int
	@ManyToOne
	private int questionId;
	
	@Column(name = "exam_id")  //FK int
	@ManyToOne
	private int examId;

	public ExamQuestionMap() {
		super();
	}

	
}

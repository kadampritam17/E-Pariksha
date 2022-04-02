package com.java.epariksha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.epariksha.entity.Subject;
import com.java.epariksha.entity.Teacher;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

	//count of subjects
	@Query(value="select count(*) from subject_info_tbl",nativeQuery=true)
	public Integer getSubjetCount();



	//used in SubjectDAOImpl
	//list of subjects by teacher pressetn in session
//	@Query(value="select subject_id from teacher_info_tbl a where a.teacher_teacher_id =:teacher;",nativeQuery=true)
//	public List<Subject> getSubjectListByTeacher(@PathVariable("teacher") Teacher teacher);
	//select subject_subject_id  from teacher_subject_info_tbl join teacher_info_tbl on teacher_subject_info_tbl.teacher_teacher_id = teacher_info_tbl.teacher_id;

}

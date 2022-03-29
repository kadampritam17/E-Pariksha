package com.java.epariksha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.epariksha.entity.Exam;
import com.java.epariksha.entity.Student;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {

	//Query using Hibernate Query Language
		 @Query(value="select * from student_info_tbl a where a.student_email_id =:username and a.student_password=:password",nativeQuery=true)
		 public List<Student> findStudentByUsernameAndPassword(@PathVariable("username") String username,@PathVariable("password") String password);

	//Query using Hibernate Query Language
	@Query(value="select * from exam_info_tbl a where a.exam_status = 'deactive'",nativeQuery=true)
	List<Exam> findAllPreviousExams();

}

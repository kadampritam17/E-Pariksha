package com.java.epariksha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.epariksha.entity.Exam;
import com.java.epariksha.entity.Question;
import com.java.epariksha.entity.Student;

@Repository
public interface ExamRepository extends JpaRepository<Exam, Integer> {

	//Query using Hibernate Query Language
	@Query(value="select * from student_info_tbl a where a.student_email_id =:username and a.student_password=:password",nativeQuery=true)
	public List<Student> findStudentByUsernameAndPassword(@PathVariable("username") String username,@PathVariable("password") String password);

	//to get all previous exam
	@Query(value="select * from exam_info_tbl a where a.exam_status = 'deactive'",nativeQuery=true)
	List<Exam> findAllPreviousExams();


	//count of exams
	@Query(value="select count(*) from exam_info_tbl",nativeQuery=true)
	public Integer getExamCount();



	//count of exams
	@Query(value="select * from question_info_tbl que inner join exam_question_map_info_tbl map on que.question_id = map.question_question_id inner join exam_info_tbl ex on ex.exam_id = map.exam_exam_id where ex.exam_id =:id",nativeQuery=true)
	public List<Question> getQuestionByExamId(int id);

}
package com.java.epariksha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.epariksha.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	//Query using Hibernate Query Language
	@Query(value="select * from student_info_tbl a where a.student_email_id =:username and a.student_password=:password",nativeQuery=true)
	public List<Student> findStudentByUsernameAndPassword(@PathVariable("username") String username,@PathVariable("password") String password);


	//count of students
	@Query(value="select count(*) from student_info_tbl",nativeQuery=true)
	public Integer getStudentCount();

	

}

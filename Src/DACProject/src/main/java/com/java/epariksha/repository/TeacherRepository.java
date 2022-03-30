package com.java.epariksha.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.java.epariksha.entity.Teacher;


@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer>
{
	//Query using Hibernate Query Language
	 @Query(value="select * from teacher_info_tbl a where a.teacher_email_id =:username and a.teacher_password=:password",nativeQuery=true)
	 public List<Teacher> findTeacherByUsernameAndPassword(@PathVariable("username") String username,@PathVariable("password") String password);
	 
}



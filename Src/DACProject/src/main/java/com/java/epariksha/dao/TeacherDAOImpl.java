package com.java.epariksha.dao;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Subject;
import com.java.epariksha.entity.Teacher;
import com.java.epariksha.repository.TeacherRepository;

@Service
public class TeacherDAOImpl  {


	@Autowired
	TeacherRepository teacherRepository;


	

	//done
	public List<Teacher> getAll() {
		return teacherRepository.findAll();
	}


	public Optional<Teacher> get(int id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(teacherRepository.findById(id).get());
	}


	//for profile update
	public Teacher update(Teacher teacher)
	{
		return teacherRepository.save(teacher);
	}

	//to add new teacher
	public Teacher add(String firstName, String lastName, long mobileNo, Date birthdate, String userName, String password,
			String emailId, String qualification, int experience, List<Subject> subjectList) {

		Teacher teacher = new Teacher(firstName, lastName, mobileNo, birthdate, userName, password, emailId, qualification, experience);

		teacher.setSubjectInfoTbl(subjectList);
		teacherRepository.save(teacher);
		return  teacher;
	}

}

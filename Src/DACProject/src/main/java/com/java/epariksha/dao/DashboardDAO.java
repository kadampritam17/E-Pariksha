package com.java.epariksha.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.repository.ExamRepository;
import com.java.epariksha.repository.StudentRepository;
import com.java.epariksha.repository.SubjectRepository;
import com.java.epariksha.repository.TeacherRepository;

@Service
public class DashboardDAO {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	TeacherRepository teacherRepository;
	
	@Autowired
	SubjectRepository subjectRepository;
	
	@Autowired
	ExamRepository examRepository;
	
	
	public Integer studentCount()
	{
		
		return studentRepository.getStudentCount();
	}
	
	
	public Integer subjectCount()
	{
		return subjectRepository.getSubjetCount();
	}
	
	
	public Integer examCount()
	{
		return examRepository.getExamCount();
	}
	
	public Integer teacherCount()
	{
		return teacherRepository.getTeacherCount();
	}

}

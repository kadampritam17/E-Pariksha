package com.java.epariksha.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.epariksha.entity.Subject;
import com.java.epariksha.repository.SubjectRepository;

@Service
public class SubjectDAO implements DAO<Subject> {

	@Autowired
	SubjectRepository subjectRepository;


	@Override
	public Optional<Subject> get(int id) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(subjectRepository.findById(id).get());
	}

	@Override
	public List<Subject> getAll() {
		return subjectRepository.findAll();
	}

//	public Object save(String subjectName, String subjectDescription) {
//		
//		subjectRepository.save(s);
//		return s;
//	}

	
	@Override
	public Subject save(Subject subject) {
		return subjectRepository.save(subject);
	}


	

	@Override
	public Subject update(int id) {
		return subjectRepository.findById(id).get();
		
	}

	
	@Override
	public void update(Subject subject) {
		Subject foundSubject = subjectRepository.findById(subject.getSubjectId()).get();
		foundSubject.setSubjectName(subject.getSubjectName());
		foundSubject.setSubjectDescription(subject.getSubjectDescription());
		subjectRepository.save(foundSubject);
	}

	
	
	@Override
	public void delete(int id) {
		subjectRepository.deleteById(id);
	}
}

package com.java.epariksha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.epariksha.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {

}

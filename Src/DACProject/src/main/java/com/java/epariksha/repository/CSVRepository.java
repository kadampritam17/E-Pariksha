package com.java.epariksha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.epariksha.entity.Question;

@Repository
public interface CSVRepository extends JpaRepository<Question, Integer> {
}

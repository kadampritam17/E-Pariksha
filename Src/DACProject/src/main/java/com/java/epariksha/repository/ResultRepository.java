package com.java.epariksha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.epariksha.entity.Result;

@Repository
public interface ResultRepository extends JpaRepository<Result, Integer>{

}

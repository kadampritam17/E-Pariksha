package com.java.epariksha.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.epariksha.entity.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
	
	//count of subjects
		@Query(value="select count(*) from subject_info_tbl",nativeQuery=true)
		public Integer getSubjetCount();

}

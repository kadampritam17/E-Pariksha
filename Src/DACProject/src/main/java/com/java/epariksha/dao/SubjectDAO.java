package com.java.epariksha.dao;

import java.util.Collection;
import java.util.Optional;

import com.java.epariksha.entity.Subject;

public interface SubjectDAO<T> {

	Optional<T> get(int id);
    Collection<T> getAll();
    T save(T t);
    void delete(int id);
	Subject update(int id);
	void update(Subject subject);
	
}

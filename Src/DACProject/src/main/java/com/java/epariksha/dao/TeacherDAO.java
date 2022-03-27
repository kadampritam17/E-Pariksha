package com.java.epariksha.dao;

import java.util.Collection;

public interface TeacherDAO<T> {

	Collection<T> getAll();
}

package com.example.springJdbc.dao;

import com.example.springJdbc.entity.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int id);
}

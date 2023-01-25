package com.jspiders.mvcrest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.mvcrest.pojo.StudentPOJO;
import com.jspiders.mvcrest.repository.StudentRepository;
import com.jspiders.mvcrest.response.StudentResponse;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public StudentPOJO add(StudentPOJO student) {
		StudentPOJO pojo = repository.add(student);
		return pojo;
	}

	public StudentPOJO search(int id) {
		StudentPOJO student = repository.search(id);
		return student;
	}

}

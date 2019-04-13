package com.dev.dao;

import com.dev.models.Student;

import org.springframework.http.ResponseEntity;

import com.dev.models.ResponseObject;

public interface StudentDao {
	public void addStudent(Student student);
	public ResponseObject getStudentById(int id);
	public Student updateStudent(Student student);
	public void delateStudent(Student student);
	public ResponseObject deleteStudentById(int id);
}

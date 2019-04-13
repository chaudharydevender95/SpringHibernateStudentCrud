package com.dev.services;

import com.dev.models.ResponseObject;
import com.dev.models.Student;

public interface StudentServices {
	
	public void addStudent(Student student);
	public ResponseObject getStudentById(int id);
	public Student updateStudent(Student student);
	public void delateStudent(Student student);
	public ResponseObject deleteStudentById(int id);
}

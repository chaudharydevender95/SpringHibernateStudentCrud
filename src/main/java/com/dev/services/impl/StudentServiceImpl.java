package com.dev.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.dao.StudentDao;
import com.dev.models.ResponseObject;
import com.dev.models.Student;
import com.dev.services.StudentServices;

@Service
public class StudentServiceImpl implements StudentServices {

	@Autowired
	StudentDao studentDao;
	
	@Transactional
	public void addStudent(Student student) {
		this.studentDao.addStudent(student);

	}
	
	@Transactional
	public ResponseObject getStudentById(int id) {
		return this.studentDao.getStudentById(id);
	}

	@Transactional
	public Student updateStudent(Student student) {
		Student student1 = this.studentDao.updateStudent(student);
		return student1;
	}

	@Transactional
	public void delateStudent(Student student) {
		this.studentDao.delateStudent(student);

	}

	@Transactional
	public ResponseObject deleteStudentById(int id) {
		return this.studentDao.deleteStudentById(id);

	}
	
	

}

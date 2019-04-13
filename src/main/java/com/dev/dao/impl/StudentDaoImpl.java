package com.dev.dao.impl;

import java.util.Date;

import javax.persistence.EntityNotFoundException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.http.HttpStatus;
import com.dev.dao.StudentDao;
import com.dev.models.ResponseObject;
import com.dev.models.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	SessionFactory sessionFactory;
	
	public void addStudent(Student student) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(student);
	}

	public ResponseObject getStudentById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = null;
		try {
			student = session.load(Student.class, id);
			if(student == null) System.out.println("student is null");
			else System.out.println(student.getAge());
		}catch(EntityNotFoundException exception) {
			return new ResponseObject(HttpStatus.OK,"NOT FOUND",null);
		}catch(Exception ex) {
			return new ResponseObject(HttpStatus.OK,"NOT FOUND",null);
		}
		
		return new ResponseObject(HttpStatus.OK,"FOUND",student);
	}

	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delateStudent(Student student) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(student);
	}

	public ResponseObject deleteStudentById(int id) {
		Session session = sessionFactory.getCurrentSession();
		Student student = (Student)this.getStudentById(id).getPayload();
		if(student == null) return new ResponseObject(HttpStatus.NOT_FOUND,"Record Not Found");
		else {
			session.delete(student);
			return new ResponseObject(HttpStatus.OK,"Record Deleted",student);
		}
	}


}

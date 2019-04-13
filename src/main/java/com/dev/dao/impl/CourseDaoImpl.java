package com.dev.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import com.dev.dao.CourseDao;
import com.dev.models.Course;
import com.dev.models.ResponseObject;
import com.dev.models.Student;

public class CourseDaoImpl implements CourseDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public ResponseObject getStudents(int id) {
		Session session = sessionFactory.getCurrentSession();
		Course course = session.load(Course.class, id);
		System.out.print(course.getStudentList().size());
		return new ResponseObject(HttpStatus.OK,"Success",course.getStudentList());
	}

}

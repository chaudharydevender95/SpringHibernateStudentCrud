package com.dev.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dev.dao.CourseDao;
import com.dev.models.ResponseObject;
import com.dev.services.CourseServices;

@Service
public class CourseServicesImpl implements CourseServices {

	@Autowired
	CourseDao courseDao;
	
	@Transactional
	public ResponseObject getStudents(int id) {
		// TODO Auto-generated method stub
		return courseDao.getStudents(id);
	}

}

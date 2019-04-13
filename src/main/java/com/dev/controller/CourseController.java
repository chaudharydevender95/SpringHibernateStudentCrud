package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.models.ResponseObject;
import com.dev.services.CourseServices;

@RestController
public class CourseController {
	
	@Autowired
	CourseServices courseServices;
	
	@RequestMapping(value="/getStudentsFromCourse/{id}",method=RequestMethod.GET)
	public ResponseObject getStudents(@PathVariable("id") int courseId) {
		return this.courseServices.getStudents(courseId);
	}
}

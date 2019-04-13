package com.dev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.dev.models.ResponseObject;
import com.dev.models.Student;
import com.dev.services.StudentServices;

@RestController
public class StudentController {
	
	@Autowired
	StudentServices studentService;
	
	@RequestMapping(value="/postRegister", method=RequestMethod.POST)
	public @ResponseBody Student postRegister(@RequestBody Student student) {
		this.studentService.addStudent(student);
		return student;
	}
	
	@RequestMapping(value="/student/{id}", method=RequestMethod.GET)
	public ResponseObject getStudent(@PathVariable("id") int id) {
		return this.studentService.getStudentById(id);
	}
	
	@RequestMapping(value="/remove/{id}", method=RequestMethod.GET)
	public ResponseObject removeStudent(@PathVariable("id") int id) {
		return this.studentService.deleteStudentById(id);
	}
	
}

package com.dl.controller;

import java.util.List;
import java.util.Optional;

import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dl.service.StudentService;
import com.dl.model.Student;


@RestController
@RequestMapping(path= "/springbootrest/students")
public class StudentController {

	//its a data member of studentService
	private StudentService studentService;

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
	
	
	@Autowired
	public StudentController(StudentService studentService) {
		
		this.studentService = studentService;
	}

	
	
	//@RequestMapping (method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	
	@GetMapping(produces = MediaType.APPLICATION_JSON)
	public List<Student>getStudents(@QueryParam(value = "id") Integer id){
		return studentService.listStudents(Optional.ofNullable(id));
		
	}
	
	
}

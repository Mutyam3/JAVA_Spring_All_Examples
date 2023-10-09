package com.dl.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.dao.Studentdao;
import com.dl.model.Student;


@Service
public class StudentService {
	
	
	// Autowired is enable at setter injection, constructor injection, return type level
	//Autowired means injecting beans => means getting internal data to configure from xml file
	@Autowired 
	// its a data member of Studentdao 
	private Studentdao studentDao;

	public Studentdao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(Studentdao studentDao) {
		this.studentDao = studentDao;
	}
	
	// list <modelName> methodName    Optional<entity> first id
	public List<Student> listStudents(Optional<Integer>id){
		
		List<Student> selectStudents = studentDao.selectStudents();
		
		return selectStudents;
	
	}
	
    
	
	
	
	
	
	
	

}

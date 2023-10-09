package com.dl.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dl.model.Student;

import jakarta.annotation.PostConstruct;

@Repository
public class StudentDaoImpl implements Studentdao {

	
	// here we can declare a map object with integer as key and modelName as value
	// in my case integer is key and Student as value
	Map<Integer, Student> students = new HashMap<Integer, Student>();
	
	
	
	
	// This PostConstructor annotation is used when u dont have my sql and by this annotation we have declare static data
	@PostConstruct 
	// here this init method purpose is object only , when object is started this init method is loaded
	public void init() {
		
		students.put(101, new Student(1 , "Mutyam", "Bhargav", 9854769854L, "Hyderabad" ));
		students.put(102, new Student(2 , "Sai", "Krishna", 995474554L, "Vijayawada" ));
		students.put(103, new Student(3 , "Mahesh", "babu", 9554769854L, "VIzag" ));
	}
	
	
	
	
	 @Override
	 public List<Student> selectStudents(){
	
	   return new ArrayList<>(students.values()) ;
	   // here we have to return the student values when we call selectStudents method so in return type we have taken an Arraylist object and pass studentvalues 
	   // those values are stored in an HashMap object.
	}

	
	
}

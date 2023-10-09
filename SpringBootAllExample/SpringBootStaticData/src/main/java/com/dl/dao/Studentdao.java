package com.dl.dao;


import java.util.List;

import com.dl.model.Student;
public interface Studentdao {

	// dao / repository / persistence layer
	// This layer includes writing the database queries
	// first u should create interface and implement that methods
	

	// here we have taken the abstract method
    List<Student> selectStudents();
	
 // list<genericType> method name(); => here generic type is Student model and method name is given as selectStudents 
	
}

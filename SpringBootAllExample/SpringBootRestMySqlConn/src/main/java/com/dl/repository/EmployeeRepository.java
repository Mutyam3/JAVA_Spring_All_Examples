package com.dl.repository; // this layer is also called as persistence layer | Dao layer which is in hibernate

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dl.model.Employee;
// both are interfaces so we use extends keyword   =>    < modelName, Type of Id


@Repository
public interface EmployeeRepository extends JpaRepository <Employee, Integer>  {

}

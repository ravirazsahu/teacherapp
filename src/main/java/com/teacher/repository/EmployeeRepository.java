package com.teacher.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teacher.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

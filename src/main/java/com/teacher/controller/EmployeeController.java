package com.teacher.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teacher.model.Employee;
import com.teacher.repository.EmployeeRepository;

@RestController
@RequestMapping(path="/api/employee")
public class EmployeeController {
@Autowired
EmployeeRepository emprepo;

@GetMapping("/alltest")
public String gettest() {
	return "index";
}

@GetMapping("/all")
public List<Employee> getEmployeed() {
	return (List<Employee>) emprepo.findAll();
}
	
}

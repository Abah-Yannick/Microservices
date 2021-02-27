package com.jobertcode.department.controller;

import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobertcode.department.entity.Department;
import com.jobertcode.department.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(DepartmentController.class);
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
		log.info("Indide saveDepartment method of DepartmentController");
		return departmentService.saveDepartment(department);
	}
	@GetMapping("/{id}")
	public Optional<Department> findDepartmentById(@PathVariable("id") Long departmentId) {
		log.info("Indide findDepartmentById method of DepartmentController");
		return departmentService.findDepartmentById(departmentId);
	}

}

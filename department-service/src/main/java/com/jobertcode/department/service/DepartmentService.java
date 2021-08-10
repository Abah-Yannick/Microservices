package com.jobertcode.department.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobertcode.department.entity.Department;
import com.jobertcode.department.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Indide saveDepartment method of DepartmentService");
		return departmentRepository.save(department);
	}
	
	public Optional<Department> findDepartmentById(Long departmentId) {
		log.info("Indide findDepartmentById method of DepartmentService");
		return departmentRepository.findById(departmentId);
	}

}

package com.jobertcode.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jobertcode.user.VO.ResponseTemplateVO;
import com.jobertcode.user.entity.User;
import com.jobertcode.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserService userService; 
	
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Indide saveUser method of UserController");
		return userService.saveUser(user);
	}
	
	@GetMapping("{id}")
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		return userService.getUserWithDepartment(userId);
	}
	
	

}

package com.jobertcode.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jobertcode.user.VO.Department;
import com.jobertcode.user.VO.ResponseTemplateVO;
import com.jobertcode.user.entity.User;
import com.jobertcode.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Indide saveUser method of UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("Indide getUserWithDepartment method of UserService");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Optional<User> user = userRepository.findById(userId);

		Department department = restTemplate
				.getForObject("http://localhost:8080/departments/" + user.get().getDepartmentId(), Department.class);

		vo.setUser(user.get());
		vo.setDepartment(department);
		return vo;

	}

}

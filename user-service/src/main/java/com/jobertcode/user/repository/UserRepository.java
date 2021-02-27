package com.jobertcode.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobertcode.user.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}

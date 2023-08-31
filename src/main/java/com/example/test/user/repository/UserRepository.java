package com.example.test.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.user.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}

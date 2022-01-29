package com.sample.todolistjpah2.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.todolistjpah2.model.dto.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
package com.sample.todolist.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.todolist.model.dto.User;

public interface UserRepository extends CrudRepository<User, Long> {
	User findByUsername(String username);
}
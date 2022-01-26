package com.sample.todolist.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.todolist.model.dto.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
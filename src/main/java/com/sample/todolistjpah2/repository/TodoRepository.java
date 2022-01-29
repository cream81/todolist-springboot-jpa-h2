package com.sample.todolistjpah2.repository;

import org.springframework.data.repository.CrudRepository;

import com.sample.todolistjpah2.model.dto.Todo;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}
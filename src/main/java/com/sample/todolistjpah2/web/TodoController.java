package com.sample.todolistjpah2.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.sample.todolistjpah2.model.dto.Todo;
import com.sample.todolistjpah2.repository.TodoRepository;

@Controller
public class TodoController {
	@Autowired
	private TodoRepository repository;

	@GetMapping(value = "/login")
	public String login() {
		return "login";
	}

	// Show all todos
	@GetMapping(value = "/todos")
	public String todoList(Model model) {
		model.addAttribute("todolist", repository.findAll());
		return "todos";
	}

	// Add new todo
	@GetMapping(value = "/add")
	public String addTodo(Model model) {
		model.addAttribute("todo", new Todo());
		return "addtodo";
	}

	// Save todo
	@PostMapping(value = "/save")
	public String save(@Valid Todo todo, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			return "addtodo";
		}
		repository.save(todo);
		return "redirect:todos";
	}

	// Delete todo
	@PostMapping(value = "/delete")
	public String delete(long id) {
		repository.deleteById(id);
		return "redirect:todos";
	}

}

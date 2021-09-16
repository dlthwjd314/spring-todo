package com.myapp.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.todo.service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	TodoService todoService;
	

	
}

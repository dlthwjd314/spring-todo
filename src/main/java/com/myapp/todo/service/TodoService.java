package com.myapp.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.myapp.todo.vo.TodoVO;


public interface TodoService {
	
	public List<TodoVO> getAll();

	public List<TodoVO> getByDate(String date);
	
	public TodoVO insertTodo(TodoVO todoVO);
	
	public void updateTodo(TodoVO todoVO);
	
	public void deleteTodo(int id);
	
	

}

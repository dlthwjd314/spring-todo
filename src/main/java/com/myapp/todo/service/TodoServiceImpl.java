package com.myapp.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.todo.dao.TodoDAO;
import com.myapp.todo.vo.TodoVO;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	TodoDAO todoDAO;

	@Override
	public List<TodoVO> getAll() {
		return todoDAO.getAll();
	}

}

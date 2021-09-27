package com.myapp.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myapp.todo.dao.TodoDAO;
//import com.myapp.todo.dao.TodoDAO;
import com.myapp.todo.vo.TodoVO;

@Service
public class TodoServiceImpl implements TodoService{
	
	@Autowired
	TodoDAO todoDAO;

	@Override
	public List<TodoVO> getAll() {
		return todoDAO.getAll();
		
	}
	

	@Override
	public List<TodoVO> getByDate(String date) {
		return todoDAO.getByDate(date);
	}

	@Override
	public TodoVO insertTodo(TodoVO todoVO) { //여러 DAO호출하여 여러번의 데이터 접근/갱신
		todoDAO.insertTodo(todoVO);
		// 인설트한거 들고오는 dao
		todoVO = todoDAO.getLastData();
		return todoVO;
	}

	@Override
	public void updateTodo(TodoVO todoVO) {
		
		todoDAO.updateTodo(todoVO);
		
	}

	@Override
	public void deleteTodo(int id) {
		todoDAO.deleteTodo(id);
		
	}

	


}

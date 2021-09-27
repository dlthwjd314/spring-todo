package com.myapp.todo.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.myapp.todo.vo.TodoVO;

public interface TodoDAO {
	
	public List<TodoVO> getAll();
	
	public List<TodoVO> getByDate(String date);
	
	public int getLastId();
	
	public TodoVO getLastData();
	
	public void insertTodo(TodoVO todoVO);
	
	public void updateTodo(TodoVO todoVO);
	
	public void deleteTodo(int id);
}


package com.myapp.todo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.myapp.todo.vo.TodoVO;

@Mapper
public interface TodoDAO {
	public List<TodoVO> getAll();
}

package com.myapp.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.todo.service.TodoService;
import com.myapp.todo.vo.TodoVO;

@RestController
@CrossOrigin 
@RequestMapping("/")
public class TodoController {

	@Autowired
	private TodoService todoService;

////	@RequestMapping(value="get",method = RequestMethod.GET)
//	@GetMapping("")
//	public List<TodoVO> getTodo() {
//		List<TodoVO> list = todoService.getAll();
////		for (TodoVO a : list) {
////			System.out.println(a);
////		}
//		return list;							
//	}
	
	@GetMapping("{date}")
	public List<TodoVO> getTodo(@PathVariable(name="date") String date){
		List<TodoVO> list = todoService.getByDate(date);
		return list;
	}

	@PostMapping("")
	public TodoVO insertTodo(@RequestBody TodoVO todoVO) {
		TodoVO insertVO;
		insertVO = todoService.insertTodo(todoVO);
		return insertVO;
	}

	
	@PutMapping("")
	public TodoVO updateTodo( @RequestBody TodoVO todoVO) {
		todoService.updateTodo(todoVO);
		return todoVO; //프론트단에서 response.data를 받기 위해서 
	}

	@DeleteMapping("{id}")
	public int deleteTodo(@PathVariable(name="id") int id) {
		todoService.deleteTodo(id);
		return id;
	}

}

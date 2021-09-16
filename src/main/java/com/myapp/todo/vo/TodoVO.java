package com.myapp.todo.vo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TodoVO {
	int id;
	String description;
	boolean checked;
	String date;
}

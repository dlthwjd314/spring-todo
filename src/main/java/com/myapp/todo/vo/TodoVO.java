package com.myapp.todo.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class TodoVO {
	int id;
	String description;
	boolean checked;
	String date;
	int userOrder;
	int levelOrder;
}

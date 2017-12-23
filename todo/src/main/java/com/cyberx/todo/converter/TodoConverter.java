package com.cyberx.todo.converter;

import java.util.ArrayList;
import java.util.List;

import com.cyberx.todo.model.Todo;
import com.cyberx.todo.vo.TodoVo;

public class TodoConverter {
	public static Todo voToBo(TodoVo vo) {
		Todo bo = new Todo();
		bo.setTodo(vo.getTodo());
		bo.setId(vo.getId());
		return bo;
	}
	
	public static List<Todo> voToBo(List<TodoVo> vos){
		List<Todo> bo = new ArrayList<Todo>();
		for (TodoVo vo: vos) {
			bo.add(voToBo(vo));
		}
		return bo;
	}
	
	public static TodoVo boToVo(Todo bo) {
		TodoVo vo = new TodoVo();
		vo.setId(bo.getId());
		vo.setTodo(bo.getTodo());
		return vo;
	}
	
	public static List<TodoVo> boToVo(List<Todo> bos){
		List<TodoVo> vos = new ArrayList<TodoVo>();
		for (Todo bo: bos) {
			vos.add(boToVo(bo));
		}
		return vos;
	}
	
	
}

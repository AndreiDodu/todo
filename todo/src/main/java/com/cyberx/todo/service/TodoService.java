package com.cyberx.todo.service;

import java.util.List;

import com.cyberx.todo.vo.TodoVo;

public interface TodoService {

	public void add(TodoVo todo);

	public void update(TodoVo todo);

	public void remove(int id);

	public List<TodoVo> list();

	public List<TodoVo> search(String key);
}

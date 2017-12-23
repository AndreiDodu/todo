package com.cyberx.todo.dao;

import java.util.List;

import com.cyberx.todo.model.Todo;

public interface TodoDao {
	
	public void add(Todo todo);

	public void update(Todo todo);

	public List<Todo> list();

	public List<Todo> search(String key);
	
	public void delete(int id);
}

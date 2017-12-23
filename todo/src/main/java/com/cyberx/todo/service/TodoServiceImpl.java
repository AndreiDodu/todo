package com.cyberx.todo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyberx.todo.converter.TodoConverter;
import com.cyberx.todo.dao.TodoDao;
import com.cyberx.todo.model.Todo;
import com.cyberx.todo.vo.TodoVo;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired(required=true)
	private TodoDao todoDao;
	
	public void setTodoDao(TodoDao todoDao) {
		this.todoDao = todoDao;
	}
	
	protected TodoDao getTodoDao() {
		return this.todoDao;
	}
	
	@Transactional
	@Override
	public void add(TodoVo vo) {
		Todo todo = TodoConverter.voToBo(vo);
		this.getTodoDao().add(todo);
	}
	@Transactional
	@Override
	public void update(TodoVo vo) {
		Todo todo = TodoConverter.voToBo(vo);
		this.getTodoDao().update(todo);
		
	}
	@Transactional
	@Override
	public void remove(int id) {
		this.getTodoDao().delete(id);
		
	}
	@Transactional
	@Override
	public List<TodoVo> list() {
		List<Todo> bo = this.getTodoDao().list();
		return TodoConverter.boToVo(bo);
	}
	@Transactional
	@Override
	public List<TodoVo> search(String key) {
		List<Todo> bo = this.getTodoDao().search(key);
		return TodoConverter.boToVo(bo);
	}

}

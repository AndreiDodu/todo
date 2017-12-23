package com.cyberx.todo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyberx.todo.dao.TodoDao;
import com.cyberx.todo.vo.TodoVo;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired(required=true)
	private TodoDao todoDao;
	
	@Transactional
	public void setTodoDao(TodoDao todoDao) {
		this.todoDao = todoDao;
	}
	@Transactional
	@Override
	public void add(TodoVo todo) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void update(TodoVo todo) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public void remove(int id) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	@Override
	public List<TodoVo> list() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional
	@Override
	public List<TodoVo> search(String key) {
		// TODO Auto-generated method stub
		return null;
	}

}

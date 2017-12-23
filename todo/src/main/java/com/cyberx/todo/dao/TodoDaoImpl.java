package com.cyberx.todo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.cyberx.todo.model.Todo;

@Repository
public class TodoDaoImpl implements TodoDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}
	
	private Session getSession() {
		return this.getSessionFactory().getCurrentSession();
	}

	@Override
	public void add(Todo todo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Todo todo) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Todo> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Todo> search(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}

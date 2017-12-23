package com.cyberx.todo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
		this.getSession().persist(todo);

	}

	@Override
	public void update(Todo todo) {
		this.getSession().update(todo);

	}

	@Override
	public List<Todo> list() {
		return this.getSession().createQuery("from Todo").list();
	}

	@Override
	public List<Todo> search(String key) {
		return this.getSession().createCriteria(Todo.class).add(Restrictions.like("todo", "%"+key+"%")).list();
	}

	@Override
	public void delete(int id) {
		Todo todo = (Todo)this.getSession().load(Todo.class, id);
		if (todo!=null) {
			this.getSession().delete(todo);
		}

	}

}

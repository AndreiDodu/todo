package com.cyberx.todo.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the todo database table.
 * 
 */
@Entity
@Table(name="todo")
@NamedQuery(name="Todo.findAll", query="SELECT t FROM Todo t")
public class Todo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String todo;

	public Todo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTodo() {
		return this.todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

}
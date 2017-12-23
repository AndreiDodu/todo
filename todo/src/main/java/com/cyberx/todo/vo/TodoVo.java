package com.cyberx.todo.vo;

public class TodoVo {
	private int id;

	private String todo;

	public String getTodo() {
		return todo;
	}

	public void setTodo(String todo) {
		this.todo = todo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "TodoVo [id=" + id + ", todo=" + todo + "]";
	}

}

package com.cyberx.todo.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cyberx.todo.service.TodoService;
import com.cyberx.todo.vo.TodoVo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired(required = true)
	private TodoService todoService;

	public void setTosoService(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public TodoService getTodoService() {
		return this.todoService;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		model.addAttribute("todo", new TodoVo());
		return "home";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String home(@ModelAttribute TodoVo todo, Model model) {
		this.getTodoService().add(todo);
		model.addAttribute("todo", new TodoVo());
		return "home";
	}
	

}

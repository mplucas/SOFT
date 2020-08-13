package com.example.myapp.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.dao.impl.UserDAOImpl;
import com.example.myapp.model.Professor;
import com.example.myapp.model.Student;

@RestController
@RequestMapping
public class AppController {

	UserDAOImpl userDAO = new UserDAOImpl();
	
	public AppController() {
	}

	@PostMapping(path="/student")
	public boolean saveUserAsStudent(@RequestBody Student student) {
		//TODO: check if this new user already exists
		
		userDAO.saveUserAsStudent(student);
		return true;
	}
	
	@PostMapping(path="/professor")
	public boolean saveUserAsProfessor(@RequestBody Professor professor) {
		//TODO: check if this new user already exists
		
		userDAO.saveUserAsProfessor(professor);
		return true;
	}
	
	@DeleteMapping(path="/delete")
	public boolean deleteUserStudent(@RequestParam Long id) {
	
		userDAO.deleteUserStudent(id);
		return false;
	}
}

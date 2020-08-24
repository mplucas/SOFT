package com.example.myapp.dao;

import com.example.myapp.model.Professor;

public interface ProfessorDAO {

	public void save(Professor professor);

	public boolean delete(Long id);	

}

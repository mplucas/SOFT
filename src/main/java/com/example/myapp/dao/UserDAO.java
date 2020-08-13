package com.example.myapp.dao;

import com.example.myapp.model.Professor;
import com.example.myapp.model.Student;

public interface UserDAO {
	
	public void saveUser(Integer age, String name);

    public boolean deleteUserStudent(Long id);
    
    public boolean deleteUserProfessor(Long id);
    
    public void saveUserAsStudent(Student student);
    
    public void saveUserAsProfessor(Professor professor);
    
}

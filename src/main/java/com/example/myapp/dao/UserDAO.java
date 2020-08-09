package com.example.myapp.dao;

import com.example.domain.User;

public interface UserDAO {
	
	public void saveUser(Integer age, String name);

    public void updateUser(Long id, User user);

    public void deleteUser(Long id);
    
}

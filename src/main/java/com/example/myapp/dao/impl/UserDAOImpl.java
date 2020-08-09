package com.example.myapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.domain.User;
import com.example.myapp.dao.UserDAO;
import com.example.myapp.factory.DatabaseConnection;

public class UserDAOImpl implements UserDAO{

	public UserDAOImpl() {
	}
	
	@Override
	public void saveUser(Integer age, String name) {
		String sql = "INSERT INTO userinfo(name, age) VALUES('" + name + "', " + age +")";
		
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
			PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.executeQuery();
     	   
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateUser(Long id, User user) {
		
	}

	@Override
	public void deleteUser(Long id) {
		
	}

}

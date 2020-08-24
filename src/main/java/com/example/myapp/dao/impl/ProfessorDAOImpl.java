package com.example.myapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.myapp.dao.ProfessorDAO;
import com.example.myapp.factory.DatabaseConnection;
import com.example.myapp.model.Professor;

public class ProfessorDAOImpl implements ProfessorDAO{

	public ProfessorDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void save(Professor professor) {
		String sql = "INSERT INTO professor(name, age, classroom, speciality) VALUES('" + professor.getName() + "', " + 
											professor.getAge() + ", '" + professor.getClassroom() + "', '" + professor.getSpeciality() + "')";
		
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
			PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.executeQuery();
     	   
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean delete(Long id) {
		String sql = "DELETE FROM professor WHERE reg_number = " + id;

		try(Connection connection = DatabaseConnection.getInstance().getConnection();
		PreparedStatement pstm = connection.prepareStatement(sql)){
		ResultSet rs = pstm.executeQuery();
		
		return rs.rowDeleted();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

}

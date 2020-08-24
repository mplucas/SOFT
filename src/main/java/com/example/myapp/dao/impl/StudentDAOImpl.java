package com.example.myapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.myapp.dao.StudentDAO;
import com.example.myapp.factory.DatabaseConnection;
import com.example.myapp.model.Student;

public class StudentDAOImpl implements StudentDAO{

	public StudentDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void save(Student student) {
		String sql = "INSERT INTO Estudante (Nome, Idade, TipoCurso) VALUES('" + student.getName() + "', " + 
											student.getAge() + ", '" + student.getCourse() + "')";
		
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
			PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.executeQuery();
     	   
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean delete(Long id) {
		String sql = "DELETE FROM Estudante WHERE Matricula = " + id;

		try(Connection connection = DatabaseConnection.getInstance().getConnection();
		PreparedStatement pstm = connection.prepareStatement(sql)){
		ResultSet rs =	pstm.executeQuery();
		
		return rs.rowDeleted();
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return true;
	}
		
	@Override
	public ArrayList<Student> listAll(){
		String sql = "SELECT * FROM Estudante";
		ArrayList<Student> students = new ArrayList<Student>();
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
				PreparedStatement pstm = connection.prepareStatement(sql)){
				ResultSet rs = pstm.executeQuery();
				
				while(rs.next()) {
					Student student = new Student();
					Long reg_number = rs.getLong("Matricula");
					String name = rs.getString("Nome");
					int age = rs.getInt("Idade");
					String course = rs.getString("TipoCurso");
					student.setReg_number(reg_number);
					student.setName(name);
					student.setAge(age);
					student.setCourse(course);
					students.add(student);
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return students;
	}
}

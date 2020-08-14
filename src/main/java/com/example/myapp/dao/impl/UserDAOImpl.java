package com.example.myapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import com.example.myapp.dao.UserDAO;
import com.example.myapp.factory.DatabaseConnection;
import com.example.myapp.model.Professor;
import com.example.myapp.model.Student;

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
	public void saveUserAsProfessor(Professor professor) {
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
	public void saveUserAsStudent(Student student) {
		String sql = "INSERT INTO student(name, age, course) VALUES('" + student.getName() + "', " + 
											student.getAge() + ", '" + student.getCourse() + "')";
		
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
			PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.executeQuery();
     	   
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean deleteUserStudent(Long id) {
		String sql = "DELETE FROM student WHERE reg_number = " + id;

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
	public boolean deleteUserProfessor(Long id) {
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

	@Override
	public Professor searchProfessorById(Long id) {
		return null;
	}

	@Override
	public Student searchStudentById(Optional<Long> id) {
		String sql = "SELECT * FROM student WHERE reg_number = " + id.get();
		Student student = new Student();
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
				PreparedStatement pstm = connection.prepareStatement(sql)){
				ResultSet rs = pstm.executeQuery();
				
				while(rs.next()) {
					String test = rs.toString();
					Long reg_number = rs.getLong("reg_number");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					String course = rs.getString("course");
					student.setReg_number(reg_number);
					student.setName(name);
					student.setAge(age);
					student.setCourse(course);
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;		
	}
	
	@Override
	public Student searchStudentByName(Optional<String> studentName) {
		String sql = "SELECT * FROM student WHERE name = '" + studentName.get() + "'";
		Student student = new Student();
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
				PreparedStatement pstm = connection.prepareStatement(sql)){
				ResultSet rs = pstm.executeQuery();
				
				while(rs.next()) {
					String test = rs.toString();
					Long reg_number = rs.getLong("reg_number");
					String name = rs.getString("name");
					int age = rs.getInt("age");
					String course = rs.getString("course");
					student.setReg_number(reg_number);
					student.setName(name);
					student.setAge(age);
					student.setCourse(course);
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return student;		
	}
	


}

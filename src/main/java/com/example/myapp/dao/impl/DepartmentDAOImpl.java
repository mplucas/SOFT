package com.example.myapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.myapp.dao.DepartmentDAO;
import com.example.myapp.factory.DatabaseConnection;
import com.example.myapp.model.Department;
import com.example.myapp.model.Professor;

public class DepartmentDAOImpl implements DepartmentDAO{

	public DepartmentDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	private boolean exists(Department department) {
		
		String sql = "SELECT * FROM Departamento WHERE Numero = " + department.getDep_number();
		boolean exists = false;
		
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
				PreparedStatement pstm = connection.prepareStatement(sql)){
				ResultSet rs = pstm.executeQuery();
				
				if(rs.next()) {
					exists = true;
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return exists;
	}
	
	@Override
	public void save(Department department) {
		
		String sql = "";
		boolean isUpdate = exists(department);
		
		if(!isUpdate) {
			sql = "INSERT INTO Departamento (Numero, Nome, EscritorioPrincipal, MatLider)"
					+ " VALUES(" + department.getDep_number() + ", '" + department.getName() + "', '"
					+ department.getCentralOffice() + "', " + department.getProfLeader().getReg_number() + ")";
		}
		else {
			sql = "UPDATE Departamento"
					+ " SET Nome = '" + department.getName() + "'"
					+ " , EscritorioPrincipal = '" + department.getCentralOffice() + "'"
					+ " , MatLider = " + department.getProfLeader().getReg_number()
					+ " WHERE Numero = " + department.getDep_number();
		}
		
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
			PreparedStatement pstm = connection.prepareStatement(sql)){
			pstm.executeUpdate();
     	   
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean delete(Long id) {
		String sql = "DELETE FROM Departamento WHERE Numero = " + id;

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
	public ArrayList<Department> listAll(){
		
		String sql = "SELECT * FROM Departamento";
		ArrayList<Department> departments = new ArrayList<Department>();
		try(Connection connection = DatabaseConnection.getInstance().getConnection();
				PreparedStatement pstm = connection.prepareStatement(sql)){
				
			ResultSet rs = pstm.executeQuery();
				
				while(rs.next()) {
					
					Department department = new Department();
					Long dep_number = rs.getLong("Numero");
					String name = rs.getString("Nome");
					String centralOffice = rs.getString("EscritorioPrincipal");
					Long profLeaderRegNumber = rs.getLong("MatLider");
					ProfessorDAOImpl professorDAOImpl = new ProfessorDAOImpl();
					Professor profLeader = professorDAOImpl.listByRegNumber(profLeaderRegNumber);
					
					department.setDep_number(dep_number);
					department.setName(name);	
					department.setCentralOffice(centralOffice);
					if(profLeader.getReg_number() != null) {
						department.setProfLeader(profLeader);						
					}
					departments.add(department);
				}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return departments;
	}
}

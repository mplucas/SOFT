package com.example.myapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;

import com.example.myapp.dao.StudentDAO;
import com.example.myapp.model.Student;

public class StudentDAOImpl implements StudentDAO{
	
	ArrayList<Student> students;
	
	private void CreateBaseStudents() throws Exception {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		students = new ArrayList<Student>();
		
		students.add(new Student("07715819980", "Lucas Pereira", "Jairo Pereira", "Marlene Pereira",
				"99845000", "96241314", "marlene@gmail.com", new Timestamp(dateFormat.parse("10/02/2013").getTime())));
		
		students.add(new Student("99999999999", "André Francisco", "Pai do André", "Mão do André",
				"999999999", "999999999", "paisdoandre@gmail.com", new Timestamp(dateFormat.parse("15/07/2013").getTime())));
	}
	
	private Iterator<Student> FindStudent(String document) {
		
		Iterator<Student> itr = students.iterator();
		
        while (itr.hasNext()) 
        { 
            Student student = (Student)itr.next(); 
            if (student.getDocument().equals(document) ) {
            	return itr;
            }
        }
        
        return null;
	}
	
	public StudentDAOImpl() {
		
		if(students == null) {
			try {
				CreateBaseStudents();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public void save(Student student) {
		
		Iterator<Student> itr = FindStudent(student.getDocument());
		
		if(itr != null) {
			itr.set(student);
		}
		else {			
			students.add(student);
		}
		
	}
	
	@Override
	public boolean delete(String document) {
		
		Iterator<Student> itr = FindStudent(document);
		
		if(itr != null) {
			itr.remove();
		}
        
        return itr != null;
	}
		
	@Override
	public ArrayList<Student> listAll(){
		
		return students;
	}
}

/**
 * 
 */
package com.example.myapp.dao.impl;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.myapp.model.Student;

/**
 * @author Andre
 *
 */
class StudentDAOImplTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testCreateBaseStudents() {
		StudentDAOImpl s = new StudentDAOImpl(); 	
		assertNotNull(s.students);
		assertNotNull(s.FindStudent("07715819980"));
		assertNotNull(s.FindStudent("99999999999"));
	}
	
	@Test
	void testFindStudent() {
		StudentDAOImpl s = new StudentDAOImpl(); 		
		assertNull(s.FindStudent("1"));
		assertNotNull(s.FindStudent("07715819980"));		
	}
	
	@Test
	void testStudentDAOImpl() {
		
	}
	
	@Test
	void testsave() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student estudante = new Student("10101010101","João","Mario","Maria","34343434","36363636","emaildospais@email.com",new Timestamp(dateFormat.parse("15/07/2013").getTime()));
		StudentDAOImpl s = new StudentDAOImpl(); 
		s.save(estudante);
		//assertTrue(s.students.contains(estudante));		
		assertNotNull(s.FindStudent("10101010101"));
	}
	
	@Test
	void testdelete() throws ParseException {
		StudentDAOImpl s = new StudentDAOImpl();
		s.delete("07715819980");
		assertNull(s.FindStudent("07715819980"));
	}

	@Test
	void testlistAll() {
		StudentDAOImpl s = new StudentDAOImpl();
		assertEquals(s.students, s.listAll());
		//fail("Not yet implemented");
	}
		
}


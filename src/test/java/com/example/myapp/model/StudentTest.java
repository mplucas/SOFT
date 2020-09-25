/**
 * 
 */
package com.example.myapp.model;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Andre
 *
 */
class StudentTest {

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

	/**
	 * Test method for {@link com.example.myapp.model.Student#Student(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.sql.Timestamp)}.
	 * @throws ParseException 
	 */
	@Test
	void testStudent() throws ParseException {
		String doc, nam, paiNome, maeNome, paiFone, maeFone, email;
		Timestamp data;
		doc = "123456";
		nam = "João";
		paiNome = "Pai do João";
		maeNome = "Mãe do João";
		paiFone = "34343434";
		maeFone = "36363636";
		email = "email@email.com";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		data = new Timestamp(dateFormat.parse("01/01/2011").getTime());
		Student s = new Student(doc, nam, paiNome, maeNome, paiFone, maeFone, email,data);
		assertEquals(doc, s.getDocument());
		assertEquals(nam, s.getName());
		assertEquals(paiNome, s.getFatherName());
		assertEquals(maeNome, s.getMotherName());
		assertEquals(paiFone, s.getFatherPhone());
		assertEquals(maeFone, s.getMotherPhone());
		assertEquals(email, s.getParentsEmail());
		assertEquals(data, s.getBirth());
		
		
		//System.out.println(stud.getName());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#getDocument()}.
	 * @throws ParseException 
	 */
	@Test
	void testGetDocument() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("123456","","","","","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		assertEquals("123456", s.getDocument());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#setDocument(java.lang.String)}.
	 * @throws ParseException 
	 */
	@Test
	void testSetDocument() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("123456","","","","","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		s.setDocument("111111");
		assertEquals("111111",s.getDocument());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#getName()}.
	 * @throws ParseException 
	 */
	@Test
	void testGetName() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","João","","","","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		assertEquals("João", s.getName());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#setName(java.lang.String)}.
	 * @throws ParseException 
	 */
	@Test
	void testSetName() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","João","","","","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		s.setName("Pedro");
		assertEquals("Pedro", s.getName());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#getFatherName()}.
	 * @throws ParseException 
	 */
	@Test
	void testGetFatherName() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","Mário","","","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		assertEquals("Mário", s.getFatherName());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#setFatherName(java.lang.String)}.
	 * @throws ParseException 
	 */
	@Test
	void testSetFatherName() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","Mário","","","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		s.setFatherName("Antônio");
		assertEquals("Antônio", s.getFatherName());		
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#getMotherName()}.
	 * @throws ParseException 
	 */
	@Test
	void testGetMotherName() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","","Maria","","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		assertEquals("Maria", s.getMotherName());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#setMotherName(java.lang.String)}.
	 * @throws ParseException 
	 */
	@Test
	void testSetMotherName() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","","Maria","","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		s.setMotherName("Antônia");
		assertEquals("Antônia", s.getMotherName());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#getFatherPhone()}.
	 * @throws ParseException 
	 */
	@Test
	void testGetFatherPhone() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","","","34343434","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		assertEquals("34343434", s.getFatherPhone());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#setFatherPhone(java.lang.String)}.
	 * @throws ParseException 
	 */
	@Test
	void testSetFatherPhone() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","","34343434","","","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		s.setFatherPhone("84848484");
		assertEquals("84848484", s.getFatherPhone());
		
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#getMotherPhone()}.
	 * @throws ParseException 
	 */
	@Test
	void testGetMotherPhone() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","","","","90909090","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		assertEquals("90909090", s.getMotherPhone());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#setMotherPhone(java.lang.String)}.
	 * @throws ParseException 
	 */
	@Test
	void testSetMotherPhone() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","","","","90909090","", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		s.setMotherPhone("10101010");
		assertEquals("10101010", s.getMotherPhone());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#getParentsEmail()}.
	 * @throws ParseException 
	 */
	@Test
	void testGetParentsEmail() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","","","","","emaildospais@email.com", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		assertEquals("emaildospais@email.com", s.getParentsEmail());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#setParentsEmail(java.lang.String)}.
	 * @throws ParseException 
	 */
	@Test
	void testSetParentsEmail() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Student s = new Student("","","","","","","emaildospais@email.com", new Timestamp(dateFormat.parse("00/00/0000").getTime()));
		s.setParentsEmail("outroemail@email.com");
		assertEquals("outroemail@email.com", s.getParentsEmail());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#getBirth()}.
	 * @throws ParseException 
	 */
	@Test
	void testGetBirth() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
		Student s = new Student("","","","","","","emaildospais@email.com", new Timestamp(dateFormat.parse("01/01/2010").getTime()));
		assertEquals(new Timestamp(dateFormat.parse("01/01/2010").getTime()), s.getBirth());
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.example.myapp.model.Student#setBirth(java.sql.Timestamp)}.
	 * @throws ParseException 
	 */
	@Test
	void testSetBirth() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
		Student s = new Student("","","","","","","emaildospais@email.com", new Timestamp(dateFormat.parse("01/01/2010").getTime()));
		s.setBirth(new Timestamp(dateFormat.parse("12/12/2012").getTime()));
		assertEquals(new Timestamp(dateFormat.parse("12/12/2012").getTime()), s.getBirth());
		//fail("Not yet implemented");
	}

}

package com.brolly.diary.service.impl;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.brolly.diary.service.DiaryEntry;

public class CrudServiceImplServiceTest {

	CrudServiceImplService crudServiceImpl = null;
	CrudService crudServiceImplPort = null;

	/**
	 * Sets up the test fixture. 
	 * (Called before every test case method.)
	 */
	@Before
	public void setUp() {
		crudServiceImpl = new CrudServiceImplService();
		crudServiceImplPort = crudServiceImpl.getCrudServiceImplPort();
	}

	/**
	 * Tears down the test fixture. 
	 * (Called after every test case method.)
	 */
	@After
	public void tearDown() {
		crudServiceImpl = null;
		crudServiceImplPort = null;
	}

	@Test
	public void testHelloWSOperation() {
		String sayHelloResponse = crudServiceImplPort.sayHello("John");
    	System.out.println(sayHelloResponse);
		
		assertEquals("Hello dear: John", sayHelloResponse);
	}

	/*TODO test all CRUD operations - use */
	@Test
	public void testGetAllDiariesWSOperation() {
		List<DiaryEntry> allDiaryEntries = crudServiceImplPort.getAllDiaryEntries();
		for (DiaryEntry diaryEntry : allDiaryEntries) {
			System.out.println(diaryEntry.getText());
		}
		assertFalse(allDiaryEntries.isEmpty());
		
		
	}
}

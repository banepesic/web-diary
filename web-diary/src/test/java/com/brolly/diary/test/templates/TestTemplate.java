package com.brolly.diary.test.templates;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * make sure you are using jUnit 4 on imports 
 * 
 * JUnit 3.X: junit.framework.Assert
 * <BR>
 * 
 * JUnit 4.X: org.junit.Assert <BR>
 * You can import it this way:
	
	import static org.junit.Assert.*;
	
	...After this static import, you can use this methods without prefix.
 * 
 * <BR>
 * 
 * How to test:
 * 
 * An Object has to check internal rules that it hold only valid values.
 * 	For example
    - are null values possible?
    - are empty strings possible?
    - or negative values?
    - or a zero value?
    - or values from a list are valid?
    - or is there a maximal value?
     - or is there a maximum precision on BigDecimal values?

 * 
 * @author Bane
 *
 */
public class TestTemplate {
	
	private java.util.List emptyList;

	/**
	 * Sets up the test fixture. 
	 * (Called before every test case method.)
	 */
	@Before
	public void setUp() {
		emptyList = new java.util.ArrayList();
		
	}

	/**
	 * Tears down the test fixture. 
	 * (Called after every test case method.)
	 */
	@After
	public void tearDown() {
		emptyList = null;
	}

	@Test
	public void testSomeBehavior() {
		assertEquals("Empty list should have 0 elements", 0, emptyList.size());
	}

	@Test(expected=IndexOutOfBoundsException.class)
	public void testForException() {
		Object o = emptyList.get(0);
	}
	
	@Test
	public void testStringContains(){
		//assert("baba".contains("aba"));
		String x = "foo bar";
		assertThat (x, org.junit.matchers.JUnitMatchers.containsString("foo"));
	}
}

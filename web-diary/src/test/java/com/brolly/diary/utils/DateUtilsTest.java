package com.brolly.diary.utils;

import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.brolly.diary.domain.DiaryEntry;
import com.brolly.diary.test.templates.DiaryEntryDummy;

public class DateUtilsTest {

	private String dateFormat; 

	/**
	 * Sets up the test fixture. 
	 * (Called before every test case method.)
	 */
	@Before
	public void setUp() {
		dateFormat =  new String("dd-MM-yyyy hh:mm:ss");
	}

	/**
	 * Tears down the test fixture. 
	 * (Called after every test case method.)
	 */
	@After
	public void tearDown() {
		dateFormat = null;
	}

	@Test
	public void testDateFormat() throws ParseException, IOException {
		
		//Given
		SimpleDateFormat df = new SimpleDateFormat(dateFormat);
		String toParse = "20-12-2014 02:30:00";
	    Date date = df.parse(toParse);
	    
	    DiaryEntryDummy entry = DiaryEntryDummy.getDummyEntry();
	    entry.setDate(date);
	    
		ObjectMapper mapper = new ObjectMapper();
	    
		//when
		String result = mapper.writeValueAsString(entry);
	    
	    //then
	    assertThat(result, org.junit.matchers.JUnitMatchers.containsString(toParse));
		
	}
	
	
}

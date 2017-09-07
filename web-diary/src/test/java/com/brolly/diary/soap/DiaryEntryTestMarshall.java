package com.brolly.diary.soap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.io.ByteArrayOutputStream;
import java.text.ParseException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.namespace.QName;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.brolly.diary.domain.DiaryEntry;
import com.brolly.diary.test.templates.DiaryEntryDummy;

public class DiaryEntryTestMarshall {

	private String XML_HEADER;

	/**
	 * Sets up the test fixture. 
	 * (Called before every test case method.)
	 */
	@Before
	public void setUp() {
		XML_HEADER = new String("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>");
	}

	/**
	 * Tears down the test fixture. 
	 * (Called after every test case method.)
	 */
	@After
	public void tearDown() {
		XML_HEADER = null;
	}

	/*verifies object is being marshalled to XML properly*/
	@Test
	public void testMarshalling() throws ParseException, JAXBException {
		
		
		final DiaryEntryDummy type  = DiaryEntryDummy.getDummyEntry();
		
		
        // Can't be certain @XmlRootElement annotation has been generated, so wrap obj in JAXBElement
        final JAXBElement element = new JAXBElement(new QName("DiaryEntry"), DiaryEntry.class, type);
 
        // Marshal to output stream
        JAXBContext context = JAXBContext.newInstance(DiaryEntry.class);
        final ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        context.createMarshaller().marshal(element, outStream);
 
        System.out.println(outStream.toString());
        
        final String xmlContent = "";
        Assert.assertEquals(XML_HEADER + "\n" + xmlContent, outStream.toString());
		
	}

	
}

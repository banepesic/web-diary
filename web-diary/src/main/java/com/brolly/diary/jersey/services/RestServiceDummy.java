package com.brolly.diary.jersey.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.brolly.diary.domain.DiaryEntry;
import com.brolly.diary.utils.AppConstants;


/**
 * Test JSON and XML REST 
 * 
 * 
 * Precondition: configuring web.xml for REST, url-patters is added: 
 * 	<url-pattern>/rest/*</url-pattern>
 * 
 * Precondition: for XML 
 * 	You need to use 
 * 	@XmlRootElement on your Domain Object
 * 
 * or you will get: Caused by: com.sun.jersey.api.MessageException: A message body writer for Java class com.brolly.diary.jersey.services.Product, and Java type class com.brolly.diary.jersey.services.Product, and MIME media type application/xml was not found
 * 	
 * Note:
 * 	@Produces({"application/xml", "application/json"})
 * 
 * The doGetAsXmlOrJson method will get invoked if either of the media types application/xml and application/json is acceptable. 
 * If both are equally acceptable, the former will be chosen because it occurs first. 
 * 
 * 
 * @author Bane
 *
 */
@Path("/entry")
public class RestServiceDummy {
	
	@GET
	@Path("/all")
	@Produces({"application/xml","application/json"})
	public List<DiaryEntry> getAllDiaryEntries() throws ParseException{
		List<DiaryEntry> entries = new ArrayList<DiaryEntry>();
		
		DiaryEntry e1 = new DiaryEntry();
		
		//date
		String dateFormat = new String(AppConstants.SIMPLE_DATE_FORMAT1);
		SimpleDateFormat df = new SimpleDateFormat(dateFormat);
		String exampleDate = AppConstants.SIMPLE_DATE_FORMAT1_TEST_VAL;
	    Date date = df.parse(exampleDate);
	    e1.setDate(date);
		
	    //tags
		e1.setTags("market");
		e1.setTags("car");
		e1.setTags("job");
		
		//text
		String text = "some multiline dieay test + \\n "
				+ " and another line \\n "
				+ " and line #3";
		
		e1.setText(text);
		
		DiaryEntry e2 = new DiaryEntry(new Date(), "vacation;visa", "some tex #2 \n some text#2 some tex #2 \n some text#2");
		DiaryEntry e3 = new DiaryEntry(null, "car;insurance;bday", "some tex #3 \n some text#3 some tex #3 \n some text#3");
		
		Collections.addAll(entries, e1, e2,e3);
		
		return entries;
	}
	
	
	
	
}



package com.brolly.diary.test.templates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.brolly.diary.domain.DiaryEntry;
import com.brolly.diary.utils.AppConstants;

/**
 * dummy hardcoded DiaryEntry for testing  
 * @author Bane
 *
 */
public class DiaryEntryDummy extends DiaryEntry{

	public DiaryEntryDummy() {
		super();
	}
	
	public DiaryEntryDummy(Date date, String tags, String text) {
		super(date, tags, text);
	}

	public static DiaryEntryDummy getDummyEntry() throws ParseException {
		
		DiaryEntryDummy e1 = new DiaryEntryDummy();
		
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
		
		return e1;
	}
	
	public static void main(String[] args) throws ParseException {
		System.out.println(DiaryEntryDummy.getDummyEntry().toString());
	}
}

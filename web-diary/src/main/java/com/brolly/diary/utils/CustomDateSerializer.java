package com.brolly.diary.utils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.ser.SerializerBase;

/**
 * Custom Date formatter will format java.util.Date	from
 * 	 "date": 1504382755093, to "date": "02-09-2017 10:03:59",
 * <BR>
 * To use it :  on Pojo getter add annotation :
 *  @JsonSerialize(using = CustomDateSerializer.class)
	public Date getDate() {
 * 
 * <BR>
 * Note: If possible to use Jackson 2.0+ and not conflict with JAX-RS default usage of Jackson 1.7
 * then simply use this annotation on POJO: 
 * 
 * @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd HH:mm a z")
 * private Date date;
 * 
 * @author Bane
 *
 */
public class CustomDateSerializer extends  SerializerBase<Date> {

	private final SimpleDateFormat FORMATTER = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

	public CustomDateSerializer() {
		super(Date.class, true);
	}

	@Override
	public void serialize(Date date, JsonGenerator jasonGen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		
		if (date == null) {
			jasonGen.writeNull();
		} else {
			jasonGen.writeString(FORMATTER.format(date));
		}
			
	}

	@Override
	public JsonNode getSchema(SerializerProvider provider, Type typeHint)
			throws JsonMappingException {
		// TODO Auto-generated method stub
		return null;
	}

}
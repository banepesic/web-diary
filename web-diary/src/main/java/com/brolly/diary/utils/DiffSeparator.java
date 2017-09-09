package com.brolly.diary.utils;

/**
 * 
 * @author Bane
 * 
 * STRING SPLIT:
 * 		
 * 		SYSTEM LINE SEPARATOR:  String separator = System.getProperty("line.separator");
 * 									...this covers Windows, Linux and Mac ("\r\n", "\n","\r") 
 * 		
 * 		TO SKIP EMPTY LINES: String.split("[\\r\\n]+")  
 *
 */
public enum DiffSeparator {
	
    COMMA(","),
    SEMICOLON(";"),
    COLON(":"),
    EMPTY(" "),
    LINE(System.getProperty("line.separator"));
	
	private DiffSeparator(String s) {
		
		this.separator = s;
	}
	
	private final String separator;
	
	public String getSeparator(){
		return separator;
	}
	
	
}

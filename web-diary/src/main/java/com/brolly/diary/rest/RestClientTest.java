package com.brolly.diary.rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * tests dummy REST method RestServiceDummy.getAllDiaryEntries() 
 * using java.net.HttpURLConnection with  GET method and 
 * Accept header ("application/json" or "application/xml")

 * @author Bane
 *
 */
public class RestClientTest {
	
	private final static String DUMMY_TEST_URL = "http://localhost:8080/web-diary/rest/entry/all";
	private final static String TEST_URL = "http://localhost:8080/web-diary/rest/entries/list";
	
	public static void main(String[] args) {
	
		HttpURLConnection conn = null;
		
		try {

			//URL url = new URL(DUMMY_TEST_URL);
			URL url = new URL(TEST_URL);

			conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			
			/*set JSON or XML */
			//conn.setRequestProperty("Accept", "application/json");
			conn.setRequestProperty("Accept", "application/xml");
			

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader(
					(conn.getInputStream())));

			StringBuilder sb = new StringBuilder();
			String output;
			System.out.println("Output from Server .... \n");
			while ((output = br.readLine()) != null) {
				sb.append(output);
			}

			System.out.println("Result: \n" + sb.toString());
			conn.disconnect();

		} catch (MalformedURLException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(conn!= null){
				conn.disconnect();
			}
		}

	}
}

package com.brolly.diary.service.impl;

import javax.xml.ws.Endpoint;

/**
 *  
 * @author Bane
 *
 */
public class CrudWSPublisher {

	/*pick port like 8888 - not to be used by Tomcat */
	private static final String PUBLISH_URL = "http://localhost:8888/web-diary/ws/entries";
	private static final String PUBLISH_URL_WSDL = "http://localhost:8888/web-diary/ws/entries?wsdl";
	
	public static void main(String[] args) {

		/*Creates and publishes an endpoint for the specified implementor object at the given address. */
		Endpoint.publish(PUBLISH_URL, new CrudServiceImpl());

		System.out.println("Service is published!");
		System.out.println("Visit: " + PUBLISH_URL_WSDL);
	}

}

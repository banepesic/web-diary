README: 
	
- Eclipse: 
	...import sa MAVEN project...solve Maven issues. Right click on project in workspace, Maven => Update projects 

	1. application is now set to use in-memory DB: hsqldb
	
	===============================================================
	- To switch to MySQL DB : 
		
		a)Install MySQL DB and from client tool execute DDL + data script:
		   \web-diary\src\site\DB_Dump2017_09_03.sql
		
		b) replace content of hibernate.cfg.xml with content from  
		 	web-diary2\web-diary\src\site\Copy of hibernate.cfg.xml
		 	
		c) then in hibernate.cfg.xml change credentials to connect to your DB server:  
		
			<property name="hibernate.connection.username">root</property>
        	<property name="hibernate.connection.password">bane</property>
        	<property name="hibernate.connection.url">jdbc:mysql://localhost:3306/diary</property>
        
		d) run standalone Java Hibernate test on CRUD operations to MySQL DB named 'diary', table 'diary_entry' :
		
			web-diary\src\main\java\com\brolly\diary\dao\hibernate\HibernateCRUDTest.java
		 	
-------------------------------------------	
	--------
		
- Tomcat 
	
	Eclipse => servers => Tomcat is set up and used to deploy and test app 
		
		Right click 'web-diary' project => Run on server 
			Publish and startup
		
		You should see 	
			http://localhost:8080/web-diary/
			
			Welcome to Diary webapp!
			
		...in your browser 	
------------------------------------------	
- REST
		web-diary\src\main\webapp\WEB-INF\web.xml
			...contains jersey-servlet exposed on :		
			
			<url-pattern>/rest/*</url-pattern>

	REST TEST DUMMY:
		http://localhost:8080/web-diary/rest/entry/all
		
	Resource: web-diary\src\main\java\com\brolly\diary\jersey\services\RestServiceDummy.java	
	
	REST TEST APP:
		
		Resource: web-diary\src\main\java\com\brolly\diary\rest\DiaryEntryResource.java
	
		a) http://localhost:8080/web-diary/rest/entries/test
			
			Output: Hello from DiaryEntryResource, REST test success!
		
						
		b) Use Chrome POSTMAN plugin and IMPORT this file 
			
				web-diary\src\site\web-diary.postman_collection.json		
				
			For test URLS with {params}, make sure {id} exist in 
			
	REST from soapUI test:
		WADL
		http://localhost:8080/web-diary/rest/application.wadl
			then in SoapUI click New Rest Project => Import WADL...
			
-------------

	Junit tests:

	C:\Users\bane\workspace\web-diary\src\test\java	
	
	Troubleshoot:
		PROBLEM: test fail : web-diary\src\test\java\com\brolly\diary\service\impl\CrudServiceImplServiceTest.java
		Comment : on another machine this was not an issue at all 

		Issue: 	com.sun.xml.internal.ws.spi.db.DatabindingException: Unknown JAXBContext implementation: class com.sun.xml.bind.v2.runtime.JAXBContextImpl
		Fix : ? Looks like "Error was because of classes with different version in JDK"??? //TODO

			com.sun.xml.internal.bind.v2.runtime;
			public final class JAXBContextImpl
			
-----------------

SOAP TEST
	
	PRECONDITION: ws published 

	Run standalone java : 	
		web-diary\src\main\java\com\brolly\diary\service\impl\CrudWSPublisher.java
	
		http://localhost:8888/web-diary/ws/entries?wsdl 
	
	NOTE: Another part of application runs on http://localhost:8080 (deployed on tomcat)
	//TODO - integrate standalone WS into app so it can be part of same webapp
		
	Use SoapUI tool => File import project =>  
			web-diary\src\site\Diary-soapUI-soapui-project.xml
		
	 

==============

 Diff tool test
 
 	a) to test diff on 2 inpout Strings
 	
 	b) after populating in memory DB you can use  DiffUtil.java to test diff on
 		  	  DiaryEntry.Text or DiaryEntry.tags
 		  	  
 	Implemented logic documented in comments in
 	LongestCommonSubsequenceUtil.java  	and DiffUtil.java	  	  	
README: 
	
- Eclipse: 
	...import project from ZIP
	
	- solve Maven issues. Right click on project in workspace, Maven => Update projects 

	TROUBLESHOOT:
	You would probably need to replace project's System lib with the one used by your VM :
		 Right click on project in workspace, Properties => Java Build Path => tab Libraries 
			remove exisitng JRE System LIb and add yours
	
	pom.xml issues: 

		Problem:  "maven-surefire-plugin" version problem
		Fix:   delete in your local repository .m2 where component is:  
		C:\Users\Bane\maven_repos\org\apache\maven\plugins\maven-surefire-plugin  (delete all fodlers )
		...then refresh maven to pick up needed version


		1. DB restore script: 
	\web-diary\src\site\DB_Dump2017_09_03.sql
-------------------------------------------	
	
	DB TEST:
	
	a) update 
		
		<property name="hibernate.connection.username">root</property>
        <property name="hibernate.connection.password">bane</property>
        <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/diary</property>
        
	...in file:
		web-diary\src\main\resources\hibernate.cfg.xml

	b) run standalone Java Hibernate test on CRUD operations to MySQL DB named 'diary', table 'diary_entry' :
		
		web-diary\src\main\java\com\brolly\diary\dao\hibernate\HibernateCRUDTest.java
-----------------------------------------------------------------------
		
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
			...contains jersey-servlet exposed on :		<url-pattern>/rest/*</url-pattern>

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
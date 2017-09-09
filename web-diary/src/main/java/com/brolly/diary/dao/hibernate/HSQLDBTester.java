package com.brolly.diary.dao.hibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class HSQLDBTester {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.hsqldb.jdbc.JDBCDriver");
			//org.hsqldb.jdbc.JDBCDriver;
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:mem:howtodoinjava", "sa", "");
			
			Statement st = conn.createStatement();
			//ResultSet res = st.executeQuery("SELECT * FROM  USERS");
			ResultSet res = st.executeQuery("SELECT * from diary_entry");
			
			while (res.next()) {
				
				
				System.out.println("table name: "  + res.getInt(0));
			}			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

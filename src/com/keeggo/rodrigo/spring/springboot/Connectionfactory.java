package com.keeggo.rodrigo.spring.springboot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Connectionfactory {

	public Connection getConnection () {
		
		Connection conn = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			String url = "";
			Properties props = new Properties();
			props.setProperty("user","");
			props.setProperty("password","");
			props.setProperty("ssl","false");
			conn = DriverManager.getConnection(url, props);
			System.out.println("Conectado!");
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return conn;
		
		}

	}

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
			String url = "jdbc:postgresql://data-vault-dev.ct4gbdobfiha.us-east-1.rds.amazonaws.com:5432/postgres";
			Properties props = new Properties();
			props.setProperty("user","u404");
			props.setProperty("password","cat+fG3fZQ?evx=K");
			props.setProperty("ssl","false");
			conn = DriverManager.getConnection(url, props);
			System.out.println("Conectado!");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
		}

	}

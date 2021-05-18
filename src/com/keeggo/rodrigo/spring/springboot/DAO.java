package com.keeggo.rodrigo.spring.springboot;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	public List<String> select() {
		
		ResultSet rs = null;
		Connection conn = new Connectionfactory().getConnection();
		List<String> column = new ArrayList<String>();
		//String columnName[] = null;
		String query = "SELECT * FROM kapacitor.application LIMIT 100";
		try (Statement stmt = conn.createStatement()){
			
			rs = stmt.executeQuery(query);
			ResultSetMetaData metaData = rs.getMetaData();
			int count = metaData.getColumnCount(); //number of column
			//columnName = new String[count];

			for (int i = 1; i <= count; i++)
			{
			   column.add(metaData.getColumnLabel(i));
			   //column.add(columnName[i-1]);
			   System.out.println(metaData.getColumnLabel(i));
			}
			
		}catch (SQLException e) {
			
			System.out.println(e);
			
		}
		
		return column;
		
	}

}

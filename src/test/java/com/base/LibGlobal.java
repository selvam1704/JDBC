package com.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LibGlobal {
	public static String getData(String colName) throws SQLException {
		Connection con=null;
		String text = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","123456789");
			String sql="Select *from customer ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next())
			{
				 text = rs.getString(colName);
				
			}
			
		}
		catch(ClassNotFoundException | SQLException  e){
			e.printStackTrace();
			
		}
		finally {
			con.close();
			
		}
		return text;
		

	}

}

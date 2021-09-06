package com.ultramain.um21.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Arun Bharathi
 *
 * This class will connect the Database  
 */
public class ConnectionClass {
	
	public static Connection getDbConnection() throws SQLException {
		//Loding the driver 
				try 
				{
					Class.forName("oracle.jdbc.driver.OracleDriver");
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
				}
				String url = "jdbc:oracle:thin:@localhost:1521:XE";
				String userName = "system";
				String password = "password-1";
				Connection con = DriverManager.getConnection(url,userName,password);
				return con;
	}

	public static void main(String args[])
	{
		try 
		{
			Connection connection = getDbConnection();
			System.out.println(connection);
		}catch(SQLException e)
		{
			System.out.println("Caught Exception : " + e.getMessage());
		}
		
	}
	
}

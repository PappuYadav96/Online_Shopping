package org.sdet40.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Driver;

public class DatabaseUtility 
{
	 static Connection con;
	
	public void openDataBase(String dburl, String dbusername, String dbpassword) throws SQLException
	{
		Driver dbdriver= new Driver();
		DriverManager.registerDriver(dbdriver);
		con = DriverManager.getConnection(dburl, dbusername, dbpassword);

	}
	
	public static List<String> getDataFromDataBase(String query,String col_name) throws SQLException  
	{

		Statement statement = con.createStatement();
		ResultSet result = statement.executeQuery(query);
		
		List<String> list= new ArrayList<>();
		
		while(result.next())
		{
		list.add(result.getString(col_name));
		}
		return list;

	}
	
	public void closeDataBase() throws SQLException
	{

		con.close();
	}
}

































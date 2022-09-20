package org.sdet40.practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;
public class FetchDataFromDataBase 
{
	public static void main(String[] args) throws SQLException 
	{
		// TODO Auto-generated method stub
		//step 1---------> create the object for Driver
		Driver dbdriver=new Driver();	
		//step 2---> register the driver instance to the jdbc
		DriverManager.registerDriver(dbdriver);
		//step 3-------> get/established the database connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/tyss","root","root");
		try
		{
			//step 4-------> create the statement
			Statement statement = connection.createStatement();
			//step 5------>Execute the query
			ResultSet result = statement.executeQuery("select * from sdet40;");
			//step 6-------> Verify or itterate or fetch the data
			while(result.next())
			{
				System.out.println(result.getString("emp_name"));
			}}
		finally
		{
		//step 7----->close the db connection
		connection.close();//mandatory
		System.out.println("Connection closed successfully");
	}
	}
}

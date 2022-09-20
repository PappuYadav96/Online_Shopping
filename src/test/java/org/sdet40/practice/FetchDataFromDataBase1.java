package org.sdet40.practice;

import java.sql.SQLException;
import java.util.List;

public class FetchDataFromDataBase1 {
	//for DQL statement
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

	DatabaseUtility databaseUtility = new DatabaseUtility();
	databaseUtility.openDataBase(IConstantPath.DB_URL, "root", "root");
		
		List<String> data = databaseUtility.getDataFromDataBase("select * from sdet40;","emp_name");
	     List<String> data1 = databaseUtility.getDataFromDataBase("select * from sdet40;", "emp_name");
		 List<String> data2 = databaseUtility.getDataFromDataBase("select * from sdet40;","emp_name");
		System.out.println(data);        
		System.out.println(data1); 
		System.out.println(data2); 
		databaseUtility.closeDataBase();	
	}

}

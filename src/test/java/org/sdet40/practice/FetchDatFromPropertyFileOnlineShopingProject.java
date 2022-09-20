package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDatFromPropertyFileOnlineShopingProject 
{
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		//Step1-------->convert the physical file into Java readable object
		FileInputStream fis= new FileInputStream("./src/test/resources/commanData1.properties");
		//Step2----->create the object for properties
		Properties property= new Properties();
		//Step3----->Load all the keys
		property.load(fis);
		//Step4----->fetch the data
		String url = property.getProperty("url").trim();
		String browser = property.getProperty("browser").trim();
		String password = property.getProperty("password").trim();
		System.out.println(url);
		System.out.println(browser);	
		System.out.println(password);
	}

}

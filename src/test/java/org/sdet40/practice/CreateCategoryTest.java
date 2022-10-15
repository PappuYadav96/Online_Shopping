package org.sdet40.practice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sdet40.genericUtility.ExcelUtility;

public class CreateCategory {
	ExcelUtility excelUtility = new ExcelUtility();

	public static void main(String[] args) throws IOException 
	{
//create instance for the Generic Utility
		
//		FileUtility fileUtility = new FileUtility();
//		JavaUtility javaUtility = new JavaUtility();
	//	WebDriverUtility webDriverUtility = new WebDriverUtility();
//Fetch the data from Excel File
		excelUtility= new ExcelUtility();
		String ur1= excelUtility.getDataFromExcelInKey("AppleIphoneUser","url");
//		String browser = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH);
//		String username = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH);
//		String password = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH);
//		String url = fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH);
//		String timeouts= fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH);
//Fetch the data from Excel File		
//String expectedContactLastName = excelUtility.getDataFromExcel("Online Shopping",3,1)+ javaUtility.getRandomNumber(1000);	
// convert string to long
//	Long longTimeouts = null;
//	try {
//		longTimeouts = (long) JavaUtility.convertStringIntoAnyDatatype(timeouts,DataType.LONG);
//	} catch (Exception e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}
//	
//	// launching the browser in run time based on browser key
//	//WebDriver driver = WebDriverUtility.launchBrowser(browser);
//  //pre-setting for browser
//	//webDriverUtility.maximizeBrowser(driver);
//	//webDriverUtility.waitTillPageLoad(driver,longTimeouts);
//	//navigating the application
//	//webDriverUtility.navigateApplication(driver, url);
//	WebDriver driver = webDriverUtility.openBrowserWithApplications(browser, longTimeouts, url);
//	
//	//login to the app
//	driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("admin");
//	driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("Test@123");
//	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//	// create the contact
//	driver.findElement(By.xpath("//a[text()=' Create Category ']")).click();
//	driver.findElement(By.xpath("//input[@name='category']")).click();
//	driver.findElement(By.xpath("//button[text()='Create']")).sendKeys(expectedContactLastName);
//	driver.findElement(By.xpath("//a[text()='Sub Category ']")).click();
//	//fetch the actual contact last name
//	driver.findElement(By.xpath("//div[@class='control-group']")).getText();
//	
//Object actualLastName = null;
//	//validating contact last name
//	if(actualLastName.equals(expectedContactLastName))
//	{
//	System.out.println("Create Category successfully-----> TC is Pass");
//	}
//	else {
//		System.out.println("Create Category is not created------->TC is Fail");
//	}	
//	WebElement adminstratorIcon=driver.findElement(By.xpath("//input[@placeholder='Enter SubCategory Name']"));
//	webDriverUtility.mouseHoverAction(driver, adminstratorIcon);
//	driver.findElement(By.xpath("//button[@name='submit']")).click();
//	//close the browser
//	webDriverUtility.closeBrowser(driver);		
//	}}	
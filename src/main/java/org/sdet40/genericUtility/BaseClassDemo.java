//package org.sdet40.genericUtility;
//
//import java.io.IOException;
//
//import org.Zolanda_ObjectRepository.CommanPage;
//import org.Zolanda_ObjectRepository.LoginPage;
//import org.openqa.selenium.WebDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//
//public class BaseClassDemo 
//{
//	private LoginPage loginPage;
//	protected String userName;
//	protected String password;
//	protected CommanPage commonPage;
//	protected WebDriver driver;
//	private WebDriverUtility webDriverUtility;
//	protected ExcelUtility excelUtility;
//	protected int randomNumber;
//	private String url;
//	private String browser;
//
//	intialize the all utility class
//	  open the excel, property file
//	  read the common data
//	 create the instance for browser (launch browser)
//	  maximize , implicit wait
//	  open the application
//	  intiallize jsexecutor , actions, webdriverwait
//	  create the instance for common object repository
//	  @throws IOException
//	 
//	@BeforeClass
//	public void classSetUp() throws IOException
//	{
//		//create instance for the Generic Utility
//		excelUtility = new ExcelUtility();
//		FileUtility fileUtility = new FileUtility();
//		JavaUtility javaUtility = new JavaUtility();
//	 webDriverUtility= new WebDriverUtility();
//
//		
//		//intiallize the property file and excel file
//		fileUtility.intiallizePropertyFile(IConstantPath.PROPERTY_FILE_PATH);
//		excelUtility.openExcel(IConstantPath.EXCEL_PATH);
//
//		//fetch the data from property file
//		 browser = fileUtility.getDataFromPropertyFile("browser");
//		userName = fileUtility.getDataFromPropertyFile("userName");
//		password = fileUtility.getDataFromPropertyFile("password");
//		 url = fileUtility.getDataFromPropertyFile("url");
//		String Timeout = fileUtility.getDataFromPropertyFile("timeout");
//		long longTimeout = (long) javaUtility.convertStringIntoAnyDatatype(Timeout,DataType.LONG);
//		randomNumber = javaUtility.getRandomNumber(100);
//
//		//launching the browser and doing some browser setting
//		
//		driver = webDriverUtility.openBrowserWithApplications(browser, longTimeout, url);
//		
//
//
//		//create object for common pom repository
//		loginPage=  new LoginPage(driver);
//		commonPage = new CommanPage(driver);
//	}
//
//	//login to the application
//	/**
//	 * whenever we create the testscript class for module and test annotation method for testcase
//	 * create the instance for browser(launch browser)
//	 * intiallize jsexecutor,action,webdriverwait
//	 * create the instance for common object repository(driver)
//	 * login to the application
//	 */
//	
//	@BeforeMethod 
//	public void methodSetUp1()
//	{
//		loginPage.loginAction(userName, password);
//	}
//	
//	@AfterMethod
//	public void methodTearDown() throws IOException
//	{
//		CommanPage commanPage = new CommanPage(null);
//		//logout from the application
//		commanPage.LogoutAction(webDriverUtility, driver);
//
//		//save the excel data
//		excelUtility.saveDataIntoExcel(IConstantPath.EXCEL_PATH);
//	}
//	
//	
//	@AfterClass
//	public void classTearDown() throws IOException
//	{
//		webDriverUtility.closeBrowser(driver);
//		excelUtility.closeExcelWorkBook();
//	}
//}
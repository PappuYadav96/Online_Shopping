package org.sdet40.genericUtility;

import java.io.IOException;

import org.Zolanda_ObjectRepository.AdminCommonPage;
import org.Zolanda_ObjectRepository.LoginPage;
import org.Zolanda_ObjectRepository.SubCategoryPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import UserModuleZolandoPOM.UserAccountCreate;
import UserModuleZolandoPOM.UserCommonPage;
import UserModuleZolandoPOM.UserSignup;
/**
 * Base class updated
 * @author PAPPU YADAV
 *
 */
public class BaseClass {
	private WebDriverUtility webDriverUtility;
	private FileUtility propertyfileutility;
	protected LoginPage loginPage;
	protected String username;
	protected String password;
	protected WebDriver driver;
	protected AdminCommonPage adminCommonPage;
	private String url;
	protected SubCategoryPage subCategoryPage;
	protected UserCommonPage userCommonPage;
	protected UserAccountCreate userAccountCreate;
	protected FileUtility fileUtility;
	protected WebDriverUtility WebDriverUtility;
	protected JavaUtility javaUtility;
	protected SoftAssert soft;
	protected static JavaUtility sjava;
	public static WebDriver sdriver;
	protected JavaUtility j;
	public static JavaUtility sjavaUtility;
	protected UserSignup userSignup;
	public ExcelUtility excelUtility;

	/**
	 * intialize the all utility class open the excel, property file read the common
	 * data create the instance for browser (launch browser) maximize , implicit
	 * wait open the application intiallize jsexecutor , actions, webdriverwait
	 * create the instance for common object repository
	 */
	@BeforeSuite
	public void method1() {
		System.out.println("BeforeSuite");
	}

	@BeforeTest
	public void method2() {
		System.out.println("BeforeTest");
	}

	@BeforeClass
	public void method3() throws IOException {
		// create instance for the Generic Utility
		propertyfileutility = new FileUtility();
		url = propertyfileutility.getDataFromPropertyFile("url");
		username = propertyfileutility.getDataFromPropertyFile("username");
		password = propertyfileutility.getDataFromPropertyFile("password");

		// intiallize the property file and excel file

		excelUtility = new ExcelUtility();
		webDriverUtility = new WebDriverUtility();

		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void method4() {
		driver = webDriverUtility.launchBrowser("chrome");
		webDriverUtility.maximizeBrowser(driver);
		webDriverUtility.navigateApplication(driver, url);

		loginPage = new LoginPage(driver);
		adminCommonPage = new AdminCommonPage(driver);
		subCategoryPage = new SubCategoryPage(driver);
		userCommonPage = new UserCommonPage(driver);
		userAccountCreate = new UserAccountCreate(driver);
		userSignup = new UserSignup(driver);
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void method5() {
		webDriverUtility.closeBrowser(driver);
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void method6() {
		System.out.println("AfterClass");
	}

	@AfterTest
	public void method7() {
		System.out.println("AfterTest");
	}

	@AfterSuite
	public void method8() {
		System.out.println("AfterSuit");
	}
}

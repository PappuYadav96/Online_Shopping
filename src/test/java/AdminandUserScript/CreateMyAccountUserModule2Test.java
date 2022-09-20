package AdminandUserScript;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.ExcelUtility;
import org.sdet40.genericUtility.IConstantPath;

import UserModuleZolandoPOM.UserAccountCreate;
import UserModuleZolandoPOM.UserSignup;

public class CreateMyAccountUserModule2Test extends BaseClass {

	ExcelUtility excelUtility;
	public void addModule() throws InterruptedException {

		excelUtility= new ExcelUtility();
		String fn=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, 0, 1);
		String ei= excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, 1, 1);
		String cn=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, 2, 1);
		String pd=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, 3, 1);
		String cp=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, 4, 1);
		String ie=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, 5, 1);
		String ip=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH, 6, 1);


//		String key="webdriver.chrome.driver";
//		String value="./driver/chromedriver.exe";
//		System.setProperty(key,value); 
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application");
//		driver.manage().window().maximize();

		UserAccountCreate ua = new UserAccountCreate(driver);
		ua.UserSignup(fn, ei, cn, pd, cp);

		//		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		//		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys(fn);	
		//		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys(ei);
		//		driver.findElement(By.xpath("//input[@id='contactno']")).sendKeys(cn);
		//		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pd);
		//		driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys(cp);	
		//		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		//		
		driver.switchTo().alert().accept();

		UserSignup us = new UserSignup(driver);
		us.signIn(username, password);

		//driver.findElement(By.xpath("//h4[text()='sign in']")).click();
		//driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys(ie);
		//driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys(ip);
		//driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}

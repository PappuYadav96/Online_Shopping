package AdminandUserScript;

import java.util.concurrent.TimeUnit;

import org.Zolanda_ObjectRepository.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.ExcelUtility;
import org.testng.annotations.Test;

import UserModuleZolandoPOM.AppleIphone6User;
import UserModuleZolandoPOM.UserSignup;

public  class AppleIphone6UserModuleTest extends BaseClass
{

	ExcelUtility excelUtility;
	@Test
	public void appleIphone6UserModule()
	{

		excelUtility= new ExcelUtility();
		String ur1= excelUtility.getDataFromExcel("AppleIphoneUser","url");
		String un=excelUtility.getDataFromExcel("AppleIphoneUser", "ram11@123gmail.com");
		String pd=excelUtility.getDataFromExcel("AppleIphoneUser", "ram123");
		String ip=excelUtility.getDataFromExcel("AppleIphoneUser", "Iphone6");
		String pt=excelUtility.getDataFromExcel("AppleIphoneUser", "Patna");
		String bh=excelUtility.getDataFromExcel("AppleIphoneUser", "Bihar");
		String ad= excelUtility.getDataFromExcel("AppleIphoneUser","Patna");
		String pc=excelUtility.getDataFromExcel("AppleIphoneUser", "824101");
		String ca=excelUtility.getDataFromExcel("AppleIphoneUser", "Bangalore");
		String cc=excelUtility.getDataFromExcel("AppleIphoneUser", "Karnataka");
		String dc=excelUtility.getDataFromExcel("AppleIphoneUser", "Bangalore");
		String sc=excelUtility.getDataFromExcel("AppleIphoneUser", "560016");		

//		String key="webdriver.chrome.driver";
//		String value="./driver/chromedriver.exe";
//		System.setProperty(key,value); 
//		WebDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application");
//		driver.manage().window().maximize();

		//login
		//driver.findElement(By.xpath("//h4[text()='sign in']")).click();
		//		driver.findElement(By.xpath("//a[text()='Login']")).click();
		//		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("ram11@123gmail.com");
		//		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("ram123");
		//		driver.findElement(By.xpath("//button[@name='login']")).click();
		UserSignup us = new UserSignup(driver);
		us.signIn(un, pd);


		//		driver.findElement(By.xpath("//div[@class='control-group']")).click();

		//		driver.findElement(By.xpath("//input[@name='product']")).sendKeys("Iphone6");
		//		driver.findElement(By.xpath("//button[@name='search']")).click();
		//		driver.findElement(By.xpath("//a[@title='Wishlist']")).click();
		//		driver.findElement(By.xpath("//a[.='Add to cart']")).click();
		//		driver.findElement(By.xpath("//i[@class='icon fa fa-shopping-cart']")).click();

		AppleIphone6User ap = new AppleIphone6User(driver);
		ap.UserSignup(ip, pt, bh, ad, pc, ca, cc, dc, sc, ur1);

		//Shipping Address
		//		driver.findElement(By.xpath("//span[text()='Shipping Address']")).click();
		//		driver.findElement(By.xpath("//textarea[@name='billingaddress']")).sendKeys("Patna");		
		//		driver.findElement(By.xpath("//input[@name='bilingstate']")).sendKeys("Bihar");
		//		driver.findElement(By.xpath("//input[@id='billingcity']")).sendKeys("Patna");
		//		driver.findElement(By.xpath("//input[@id='billingpincode']")).sendKeys("824101");
		//		driver.findElement(By.xpath("//button[@name='update']")).click();	
		//
		//		//Billing Address
		//		driver.findElement(By.xpath("//span[text()='Billing Address']")).click();
		//		driver.findElement(By.xpath("//textarea[@name='shippingaddress']")).sendKeys("Bangalore");		
		//		driver.findElement(By.xpath("//input[@id='shippingstate']")).sendKeys("Karnataka");
		//		driver.findElement(By.xpath("//input[@id='shippingcity']")).sendKeys("Bangalore");
		//		driver.findElement(By.xpath("//input[@id='shippingpincode']")).sendKeys("560016");
		//		driver.findElement(By.xpath("//button[@name='shipupdate']")).click();	
		//		Thread.sleep(3000);
		//		driver.switchTo().alert().accept();
		//		driver.findElement(By.xpath("//button[text()='PROCCED TO CHEKOUT']")).click();
		//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}

}

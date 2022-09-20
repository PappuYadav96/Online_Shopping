package AdminandUserScript;

import java.util.concurrent.TimeUnit;

import org.Zolanda_ObjectRepository.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.ExcelUtility;
import org.sdet40.genericUtility.IConstantPath;
import org.testng.annotations.Test;

public class AppleIphone6AdminTest extends BaseClass
{
	@Test
	public void  appleIphone6AdminTest()
	{
		// TODO Auto-generated method stub
		//		String key="webdriver.chrome.driver";
		//		String value="./driver/chromedriver.exe";
		//		System.setProperty(key,value); 
		//		WebDriver driver=new ChromeDriver();
		//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/admin");
		//		driver.manage().window().maximize();


		excelUtility.getDataFromExcel(username, password);
		String aa = excelUtility.getDataFromExcel("AdminLogin", "aa");
		String ap=excelUtility.getDataFromExcel("AdminLogin", "ap");
		LoginPage Lp = new LoginPage(driver);
		Lp.loginAction(aa, ap);


		//		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("admin");
		//		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("Test@123");
		//		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();	
		//		driver.findElement(By.xpath("//a[contains(.,'Order Management')]")).click();
		//		driver.findElement(By.xpath("//a[@href='todays-orders.php']")).click();		
	}

}

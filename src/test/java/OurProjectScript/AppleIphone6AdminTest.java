package OurProjectScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.sdet40.genericUtility.BaseClass;
//import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppleIphone6AdminTest {
	@Test
	public void appleIphone6AdminTest()
	{
	

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/admin");
		driver.manage().window().maximize();



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
		//		driver.close();
	}

}

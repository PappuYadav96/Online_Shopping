package OurProject;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import UserModuleZolandoPOM.UserAccountCreate;
public class CreateMyAccountUserModule
{
	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key,value); 
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='My Account']")).click();
		driver.findElement(By.xpath("//input[@name='fullname']")).sendKeys("Ram");	
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("rama@123gmail.com");
		driver.findElement(By.xpath("//input[@id='contactno']")).sendKeys("7389379150");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ram123");
		driver.findElement(By.xpath("//input[@id='confirmpassword']")).sendKeys("ram123");	
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//h4[text()='sign in']")).click();
		driver.findElement(By.xpath("//input[@id='exampleInputEmail1']")).sendKeys("rama@123gmail.com");
		driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("ram123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}

package AdminandUserScript;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.Zolanda_ObjectRepository.AdminInsertProduct;
import org.Zolanda_ObjectRepository.CreateCategory;
import org.Zolanda_ObjectRepository.LoginPage;
import org.Zolanda_ObjectRepository.SubCategoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.sdet40.genericUtility.BaseClass;
import org.sdet40.genericUtility.ExcelUtility;
import org.sdet40.genericUtility.IConstantPath;
import org.testng.annotations.Test;
public class CreateCategoyAdminModuleeTest extends BaseClass
{
	@Test
	public void  createCategoyadmin() throws InterruptedException{
		ExcelUtility excelUtility;
		excelUtility= new ExcelUtility();
		String ur= excelUtility.getDataFromExcel("CreateCategoryAdmin","url");
		String ie2=excelUtility.getDataFromExcel("CreateCategoryAdmin", "admin");
		String ip2=excelUtility.getDataFromExcel("CreateCategoryAdmin", "Test@123");
		String cc2=excelUtility.getDataFromExcel("CreateCategoryAdmin", "Clothing");
		String dc=excelUtility.getDataFromExcel("CreateCategoryAdmin", "White Shirt");
		String sc=excelUtility.getDataFromExcel("CreateCategoryAdmin", "Clothing");
		String sd=excelUtility.getDataFromExcel("CreateCategoryAdmin", "Mens clothes");
		String pn=excelUtility.getDataFromExcel("CreateCategoryAdmin", "Allen Sony");
		String pp=excelUtility.getDataFromExcel("CreateCategoryAdmin", "500");
		String pb=excelUtility.getDataFromExcel("CreateCategoryAdmin", "450");
		String pd=excelUtility.getDataFromExcel("CreateCategoryAdmin", "it is good product");
		String ps=excelUtility.getDataFromExcel("CreateCategoryAdmin", "free");
		String pa=excelUtility.getDataFromExcel("CreateCategoryAdmin", "In Stock");

		//		String key="webdriver.chrome.driver";
		//		String value="./driver/chromedriver.exe";
		//		System.setProperty(key,value); 
		//		WebDriver driver=new ChromeDriver();
		//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//		driver.get("http://rmgtestingserver/domain/Online_Shopping_Application/admin");
		//		driver.manage().window().maximize();

		LoginPage lp = new LoginPage(driver);
		lp.loginAction("userName","password");

		//driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys("Test@123");
		//driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

		CreateCategory mn = new CreateCategory(driver);
		mn.createCategoryButton();

		//driver.findElement(By.xpath("//a[text()=' Create Category ']")).click();
		//driver.findElement(By.xpath("//input[@name='category']")).sendKeys("Clothing");
		//driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("White Shirt");
		//driver.findElement(By.xpath("//button[text()='Create']")).click();

		SubCategoryPage sp= new SubCategoryPage(driver);
		sp.subCategoryButton("CreateCategoryAdmin");


		//driver.findElement(By.xpath("//a[text()='Sub Category ']")).click();	
		//driver.findElement(By.xpath("//div[@class='control-group']")).click();	
		//driver.findElement(By.xpath("//h3[text()='Sub Category']")).click();
		//driver.findElement(By.xpath("//select[@name='category']")).sendKeys("Clothing");
		//driver.findElement(By.xpath("//input[@placeholder='Enter SubCategory Name']")).sendKeys("White Shirt1");
		//driver.findElement(By.xpath("//button[@name='submit']")).click();

		SubCategoryPage sk = new SubCategoryPage(driver);
		sk.Dropdown();

		//		WebElement dropdown = driver.findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
		//		Select s = new Select(dropdown);
		//		s.selectByVisibleText("50");
		//		
		//		driver.findElement(By.xpath("//a[text()='Insert Product ']")).click();	
		//		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='category']"));   //for dropdown
		//		Select s1 = new Select(dropdown2);
		//		s1.selectByVisibleText("Clothing"); 
		//		//for dropdown
		//		
		//		WebElement dropdown3=driver.findElement(By.xpath("//select[@id='subcategory']"));
		//		Select s2=new Select(dropdown3);
		//		s2.selectByVisibleText("White Shirt1");	  	

		AdminInsertProduct ai = new  AdminInsertProduct(driver);
		ai.AdminInsertProduct("sd", "pn", "pp", "pb", "pd", "ps");


		//		driver.findElement(By.xpath("//input[@placeholder='Enter Product Name']")).sendKeys("Mens clothes");
		//		driver.findElement(By.xpath("//input[@name='productCompany']")).sendKeys("Allen solly");
		//		driver.findElement(By.xpath("//input[@name='productpricebd']")).sendKeys("500");
		//		driver.findElement(By.xpath("//input[@name='productprice']")).sendKeys("450");
		//		driver.findElement(By.xpath("//textarea[@name='productDescription']")).sendKeys("It is good product");
		//		driver.findElement(By.xpath("//input[@name='productShippingcharge']")).sendKeys("free");
		//		WebElement dropdown4=driver.findElement(By.xpath("//select[@id='productAvailability']")); //For In Stock Dropdown
		//		Select s3=new Select(dropdown4);
		//		s3.selectByVisibleText("In Stock");	

		AdminInsertProduct ai1 = new AdminInsertProduct(driver);
		ai1.Dropdown();

		// for image upload use file upload pop up(in sendkeys we used path of the image)
		//		driver.findElement(By.xpath("//input[@name='productimage1']")).sendKeys("C://Users//PAPPU YADAV/Pictures/img.PNG");
		//		driver.findElement(By.xpath("//input[@name='productimage2']")).sendKeys("C://Users//PAPPU YADAV/Pictures/user my login.PNG");
		//		driver.findElement(By.xpath("//input[@name='productimage3']")).sendKeys("C://Users//PAPPU YADAV/Pictures/User1.PNG");	
		//		driver.findElement(By.xpath("//button[@name='submit']")).click();
		//		driver.findElement(By.xpath("//li[@class='nav-user dropdown']")).click();
		//driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}
}






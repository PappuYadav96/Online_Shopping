package org.sdet40.practice;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.Zolanda_ObjectRepository.CreateCategory;
import org.Zolanda_ObjectRepository.LoginPage;
import org.Zolanda_ObjectRepository.SubCategoryPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sdet40.genericUtility.FileUtility;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateCategoryAdminModule {


	public static void main(String[] args) throws IOException, InterruptedException 
	{


	


		//Fetching data from property File
		FileUtility propertyfileutility = new FileUtility();

		String url = propertyfileutility.getDataFromPropertyFile("url");
		String username = propertyfileutility.getDataFromPropertyFile("username");
		String password = propertyfileutility.getDataFromPropertyFile("password");
		String browser = propertyfileutility.getDataFromPropertyFile("browser");

		//		System.out.println(url);
		//		System.out.println(username);
		//		System.out.println(password);
		//		System.out.println(browser);

		//Fetch data from Excel Sheet
		FetchDataFromExcelSheet fetchDataFromExcelSheet=new FetchDataFromExcelSheet();


		String categoryname = fetchDataFromExcelSheet.getDataFromExcel("OnlineShopping", 1, 0);
		String description = fetchDataFromExcelSheet.getDataFromExcel("OnlineShopping", 1, 1);
		String Category = fetchDataFromExcelSheet.getDataFromExcel("OnlineShopping", 2, 1);	
		String SubCategoryName= fetchDataFromExcelSheet.getDataFromExcel("OnlineShopping", 3, 1);

		//		System.out.println(categoryname);
		//		System.out.println(description);



		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


		driver.get(url);

		// fetching from POM
		LoginPage loginPage=  new LoginPage(driver);
		loginPage.loginAction(username, password);
		
       
	   CreateCategory createCategory = new CreateCategory(driver);
	   createCategory.createCategoryButton();
		
	   SubCategoryPage subcategory = new SubCategoryPage(driver);
	   subcategory.subCategoryButton(SubCategoryName);
 
	    String SubCategoryName1 = "clothing";
        
	
	
		
		

		

		/*
//		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(username);
//		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(password);
//		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		driver.findElement(By.xpath("//a[text()=' Create Category ']")).click();
		driver.findElement(By.xpath("//input[@name='category']")).sendKeys(categoryname);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(description);
		driver.findElement(By.xpath("//button[text()='Create']")).click();

		driver.findElement(By.xpath("//a[text()='Sub Category ']")).click();	
		driver.findElement(By.xpath("//div[@class='control-group']")).click();	
		driver.findElement(By.xpath("//h3[text()='Sub Category']")).click();
		driver.findElement(By.xpath("//select[@name='category']")).sendKeys(Category );
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='category']"));   //for dropdown
		Select s1 = new Select(dropdown2);
		s1.selectByVisibleText("Clothing");
		driver.findElement(By.xpath("//input[@placeholder='Enter SubCategory Name']")).sendKeys(SubCategoryName);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		/*
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
		Select s = new Select(dropdown);
		s.selectByVisibleText("50");

		driver.findElement(By.xpath("//a[text()='Insert Product ']")).click();	

		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='category']"));   //for dropdown
		Select s1 = new Select(dropdown2);
		s1.selectByVisibleText("Clothing"); 
		//for dropdown

		WebElement dropdown3=driver.findElement(By.xpath("//select[@id='subcategory']"));
		Select s2=new Select(dropdown3);
		s2.selectByVisibleText("White Shirt1");	  

		driver.findElement(By.xpath("//input[@placeholder='Enter Product Name']")).sendKeys("Mens clothes");
		driver.findElement(By.xpath("//input[@name='productCompany']")).sendKeys("Allen solly");
		driver.findElement(By.xpath("//input[@name='productpricebd']")).sendKeys("500");
		driver.findElement(By.xpath("//input[@name='productprice']")).sendKeys("450");
		driver.findElement(By.xpath("//textarea[@name='productDescription']")).sendKeys("It is good product");
		driver.findElement(By.xpath("//input[@name='productShippingcharge']")).sendKeys("free");

		WebElement dropdown4=driver.findElement(By.xpath("//select[@id='productAvailability']")); //For In Stock Dropdown
		Select s3=new Select(dropdown4);
		s3.selectByVisibleText("In Stock");	
		// for image upload use file upload pop up(in sendkeys we used path of the image)

		driver.findElement(By.xpath("//input[@name='productimage1']")).sendKeys("C://Users//PAPPU YADAV/Pictures/img.PNG");
		driver.findElement(By.xpath("//input[@name='productimage2']")).sendKeys("C://Users//PAPPU YADAV/Pictures/user my login.PNG/");
		driver.findElement(By.xpath("//input[@name='productimage3']")).sendKeys("C://Users//PAPPU YADAV/Pictures/User1.PNG/");	
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		driver.findElement(By.xpath("//li[@class='nav-user dropdown']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		 */
	}

}

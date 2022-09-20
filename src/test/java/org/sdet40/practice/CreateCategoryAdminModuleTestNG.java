//package org.sdet40.practice;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.Zolanda_ObjectRepository.CreateCategory;
//import org.Zolanda_ObjectRepository.LoginPage;
//import org.Zolanda_ObjectRepository.SubCategoryPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.sdet40.genericUtility.BaseClassDemo;
//import org.testng.annotations.Test;
//
//
//public class CreateCategoryAdminModuleTestNG {
//	@Test
//	public void main() throws IOException, InterruptedException 
//	{
//
////		driver.findElement(By.xpath("//input[@id='inputEmail']")).sendKeys(userName);
////		driver.findElement(By.xpath("//input[@id='inputPassword']")).sendKeys(password);
////		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
//SubCategoryPage subcategory=new SubCategoryPage(driver);
//
//subcategory.subCategoryButton(userName);
//
//		/*
//		 * driver.findElement(By.xpath("//a[text()=' Create Category ']")).click();
//		 * driver.findElement(By.xpath("//input[@name='category']")).sendKeys(
//		 * "Categoryname");
//		 * driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(
//		 * "Description");
//		 * driver.findElement(By.xpath("//button[text()='Create']")).click();
//		 */
//
//		driver.findElement(By.xpath("//a[text()='Sub Category ']")).click();	
//		driver.findElement(By.xpath("//div[@class='control-group']")).click();	
//		driver.findElement(By.xpath("//h3[text()='Sub Category']")).click();
//		driver.findElement(By.xpath("//select[@name='category']")).sendKeys("Category" );
//		WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='category']"));   //for dropdown
//		Select s1 = new Select(dropdown2);
//		s1.selectByVisibleText("Clothing");
//		driver.findElement(By.xpath("//input[@placeholder='Enter SubCategory Name']")).sendKeys("SubCategoryName");
//		driver.findElement(By.xpath("//button[@name='submit']")).click();
//		
//		WebElement dropdown = driver.findElement(By.xpath("//select[@name='DataTables_Table_0_length']"));
//		Select s = new Select(dropdown);
//		s.selectByVisibleText("50");
//
//		driver.findElement(By.xpath("//a[text()='Insert Product ']")).click();	
//
//		WebElement dropdown21 = driver.findElement(By.xpath("//select[@name='category']"));   //for dropdown
//		Select s21 = new Select(dropdown21);
//		s1.selectByVisibleText("Clothing"); 
//		//for dropdown
//
//		WebElement dropdown3=driver.findElement(By.xpath("//select[@id='subcategory']"));
//		Select s2=new Select(dropdown3);
//		s2.selectByVisibleText("White Shirt1");	  
//
//		driver.findElement(By.xpath("//input[@placeholder='Enter Product Name']")).sendKeys("Mens clothes");
//		driver.findElement(By.xpath("//input[@name='productCompany']")).sendKeys("Allen solly");
//		driver.findElement(By.xpath("//input[@name='productpricebd']")).sendKeys("500");
//		driver.findElement(By.xpath("//input[@name='productprice']")).sendKeys("450");
//		driver.findElement(By.xpath("//textarea[@name='productDescription']")).sendKeys("It is good product");
//		driver.findElement(By.xpath("//input[@name='productShippingcharge']")).sendKeys("free");
//
//		WebElement dropdown4=driver.findElement(By.xpath("//select[@id='productAvailability']")); //For In Stock Dropdown
//		Select s3=new Select(dropdown4);
//		s3.selectByVisibleText("In Stock");	
//		// for image upload use file upload pop up(in sendkeys we used path of the image)
//
//		driver.findElement(By.xpath("//input[@name='productimage1']")).sendKeys("C://Users//PAPPU YADAV/Pictures/img.PNG");
//		driver.findElement(By.xpath("//input[@name='productimage2']")).sendKeys("C://Users//PAPPU YADAV/Pictures/user my login.PNG/");
//		driver.findElement(By.xpath("//input[@name='productimage3']")).sendKeys("C://Users//PAPPU YADAV/Pictures/User1.PNG/");	
//		driver.findElement(By.xpath("//button[@name='submit']")).click();
//		driver.findElement(By.xpath("//li[@class='nav-user dropdown']")).click();
//		
//			}
//
//}

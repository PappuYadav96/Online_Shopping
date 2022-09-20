package org.sdet40.practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Makemytripz {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("./src/test/resources/FetchFromExcel.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("MakeMyTrip");
		//String fromCityCode=sheet.getRow(2).getCell(0).getStringCellValue();
		//String toCityCode=sheet.getRow(2).getCell(1).getStringCellValue();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		String fromCityCode="DEL";
		String toCityCode="HYD";
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click(); //popup
		driver.findElement(By.xpath("//span[text()='From']")).click(); 
	    driver.findElement(By.xpath("//input[@placeholder ='From']")).sendKeys("DEL"); 
	    driver.findElement(By.xpath("//div[text()='DEL']")).click();
	    driver.findElement(By.xpath("//span[text()='To']")).click();
	    driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("HYD");
	    driver.findElement(By.xpath("//div[text()='HYD']")).click();
	    driver.findElement(By.xpath("//a[text()='Search']")).click();		
	}

}

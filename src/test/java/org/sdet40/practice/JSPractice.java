//package org.sdet40.practice;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.sdet40.genericUtility.WebDriverUtility;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class JSPractice {
//	public static void main(String[] args) {
// WebDriverManager.chromedriver().setup();
// WebDriver driver = new ChromeDriver();
// WebDriverUtility webDriverUtility = new WebDriverUtility();
//driver.manage().window().maximize();
//webDriverUtility.jsIntiallization(driver);
//webDriverUtility.openApplicationUsingJS("http://localhost:8888");
//webDriverUtility.sendKeysUsingJS(driver.findElement(By.name("user_name")), "admin");
//webDriverUtility.sendKeysUsingJS(driver.findElement(By.name("user_password")), "admin");
//webDriverUtility.ClickUsingJS(driver.findElement(By.id("submitButton")));
//WebDriverUtility.scrollTillElementUsingJS(driver.findElement(By.xpath("//b[contains(text)]"));
//	}
//}

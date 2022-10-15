package org.Zolanda_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserSignup {
	//declaration
		@FindBy(xpath = "//input[@id='exampleInputEmail1']")
		private WebElement EmailidTextField;
		
		@FindBy(xpath = "//input[@id='exampleInputPassword1']")
		private WebElement passwordTextField;
		
		@FindBy(xpath ="//button[@name='login']")
		private WebElement signInButton;	


		//Initialization all element variable
		public UserSignup(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		//bussiness Library
		public void signIn(String un, String pd) 
		{
			EmailidTextField.sendKeys(un);
			passwordTextField.sendKeys(pd);
			signInButton.click();
		}
	
	
	
	
}

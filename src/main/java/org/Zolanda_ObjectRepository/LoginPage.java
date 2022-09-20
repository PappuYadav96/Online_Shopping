package org.Zolanda_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//declaration
	@FindBy(xpath = "//input[@id='inputEmail']")
	private WebElement userNameTextField;
	@FindBy(xpath = "//input[@id='inputPassword']")
	private WebElement passwordTextField;
	@FindBy(xpath ="//button[contains(text(),'Login')]")
	private WebElement loginButton;	
	
	//Initialization all element variable
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//bussiness Library
	public void loginAction(String aa,String ap) {
		userNameTextField.sendKeys(aa);
		passwordTextField.sendKeys(ap);
		loginButton.click();
	}	
}
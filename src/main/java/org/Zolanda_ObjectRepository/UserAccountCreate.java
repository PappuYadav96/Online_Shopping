package org.Zolanda_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sdet40.genericUtility.WebDriverUtility;

public class UserAccountCreate 
{
	
	

	@FindBy(xpath = "//input[@name='fullname']")
	private WebElement FullNameTextField;

	@FindBy(xpath = "//input[@name='emailid']")
	private WebElement EmailIdTextField;

	@FindBy(xpath ="//input[@id='contactno']")
	private WebElement ContactNoTextField;

	@FindBy(xpath ="//input[@id='password']")
	private WebElement PasswordTextField;

	@FindBy(xpath ="//input[@id='confirmpassword']")
	private WebElement ConfirmPasswordTextField;

	@FindBy(xpath = "//button[text()='Sign Up']")
	private WebElement SignupButton;


	public UserAccountCreate (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void UserSignup(String fn,String ei, String cn, String pd, String cp ) throws InterruptedException 
	{
		
		FullNameTextField.sendKeys(fn);
		EmailIdTextField.sendKeys(ei);
		ContactNoTextField.sendKeys(cn);
		Thread.sleep(5000);
		PasswordTextField.sendKeys(pd);
		Thread.sleep(5000);
		ConfirmPasswordTextField.sendKeys(cp);
		Thread.sleep(5000);
		SignupButton.click();
		Thread.sleep(15000);
		
	}
}

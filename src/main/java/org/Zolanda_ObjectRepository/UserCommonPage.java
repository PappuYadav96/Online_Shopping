package org.Zolanda_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserCommonPage {



	@FindBy(xpath= "//a[.='Login']")
	private WebElement UserLoginLogButton;



	public UserCommonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void userLoginLogButton()
	{
		UserLoginLogButton.click();
	}
}

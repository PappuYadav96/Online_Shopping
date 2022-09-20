package org.Zolanda_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminLogout 
{
	@FindBy(xpath ="//a[contains(.,'Logout')]/ancestor::ul[@class='dropdown-menu']//a[.='Logout']")
	private WebElement Logout;

	public AdminLogout  (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
}
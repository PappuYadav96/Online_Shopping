package org.Zolanda_ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.sdet40.genericUtility.WebDriverUtility;

public class SubCategoryPage
{
	@FindBy(xpath="//input[@name='subcategory']")
	private WebElement SubCategoryTextField;

	@FindBy(xpath = "//select[@name='category']")
	private WebElement Dropdown;
	
	@FindBy(xpath = "//button[@name='submit']")
	private WebElement CreateButton;
	
	
	
	public SubCategoryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//business library
	
	public void Dropdown() throws InterruptedException 
	{
		WebDriverUtility webDriverUtility= new WebDriverUtility();
		Thread.sleep(2000);
		webDriverUtility.selectByVisibleText(Dropdown, "Clothing88");
	}
	public void subCategoryButton(String sc) throws InterruptedException
	{
		SubCategoryTextField.sendKeys(sc);
		Thread.sleep(2000);
		CreateButton.click();
		Thread.sleep(2000);
	}
	}





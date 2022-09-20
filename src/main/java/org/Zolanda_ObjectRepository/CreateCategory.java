package org.Zolanda_ObjectRepository;

import java.util.Locale.Category;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCategory
{
	//Declaration

	@FindBy(xpath = "//a[text()=' Create Category ']") 
	private WebElement CreateCategoryButton;

	@FindBy(xpath = "//input[@name='category']") 
	private WebElement CategoryTextField;

	@FindBy(xpath = "//textarea[@name='description']")
	private WebElement DescriptionTextField;

	@FindBy(xpath = "//button[text()='Create']")
	private WebElement CreateButtonClick;

	//Initialization

	public  CreateCategory(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	//business library
	public void createCategoryButton() 
	{
		CreateCategoryButton.click();
	}
	public void categoryTextField(String cc2, String dc)
	{
		CategoryTextField.sendKeys(cc2);
		DescriptionTextField.sendKeys(dc);
		
	}

	public void CreateCategoryButton() 
	{
		CreateButtonClick.click();
	}


}	


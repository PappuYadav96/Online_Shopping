package org.Zolanda_ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.sdet40.genericUtility.WebDriverUtility;

public class AdminInsertProduct
{
	@FindBy(xpath="//a[text()='Insert Product ']")
	private WebElement InsertButtonClick;

	@FindBy(xpath="//select[@name='category']")
	private WebElement CategoryDropdown;

	@FindBy(xpath="//select[@id='subcategory']")
	private WebElement SubCategoryDropdown;

	@FindBy(xpath ="//input[@placeholder='Enter Product Name']")
	private WebElement ProductTextField;

	@FindBy(xpath="//input[@name='productCompany']")
	private WebElement ProductCompanyTextField;

	@FindBy(xpath = "//input[@name='productpricebd']")
	private WebElement ProductPriceBeforeDiscountTextField;

	@FindBy(xpath="//input[@name='productprice']")
	private WebElement ProductPriceAfterDiscountTextField;


	@FindBy(xpath = "//textarea[@name='productDescription']")
	private WebElement ProductDescriptionTextField;


	@FindBy(xpath ="//input[@name='productShippingcharge']")
	private WebElement ProductShippingChargeTextField;

	@FindBy(xpath="//select[@id='productAvailability']")
	private WebElement ProductAvailabilityDropdown;

	@FindBy(xpath ="//input[@name='productimage1']")
	private WebElement Productimage1;

	@FindBy(xpath ="//input[@name='productimage2']")
	private WebElement Productimage2;

	@FindBy(xpath ="//input[@name='productimage3']")
	private WebElement Productimage3;

	@FindBy(xpath ="//button[@name='submit']")
	private WebElement ClickInsertButton;


	public AdminInsertProduct (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void click() {
		InsertButtonClick.click();	
		CategoryDropdown.click();
		SubCategoryDropdown.click();	
		ProductAvailabilityDropdown.click();
		Productimage1.click();
		Productimage2.click();
		Productimage3.click();
		ClickInsertButton.click();	
	}
	
	public void Dropdown() throws InterruptedException 
	{
		WebDriverUtility webDriverUtility= new WebDriverUtility();
		Thread.sleep(2000);
		webDriverUtility.selectByVisibleText(CategoryDropdown, "cc");
		webDriverUtility.selectByVisibleText(SubCategoryDropdown, "dc");	
		webDriverUtility.selectByVisibleText(ProductAvailabilityDropdown, "pa");
	}
	public void AdminInsertProduct(String sd,String pn, String pp , String pb, String pd ,String ps)
	{
	
		ProductTextField.sendKeys("sd");
		ProductCompanyTextField.sendKeys("pn");
		ProductPriceBeforeDiscountTextField.sendKeys("pp");
		ProductPriceAfterDiscountTextField.sendKeys("pb");
		ProductDescriptionTextField.sendKeys("pd");
		ProductShippingChargeTextField.sendKeys("ps");
	
	}}

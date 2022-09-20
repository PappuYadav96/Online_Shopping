package org.Zolanda_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminCommonPage {
	   

	@FindBy(xpath="//a[contains(.,'Order Management')]")
	private WebElement OrderManagementButton;

	@FindBy(xpath ="//a[contains(.,'Manage user')]")
	private WebElement ManageruserButton;

	@FindBy(xpath="//a[contains(.,' Create Category ')]")
	private WebElement CreateCategoryButton;

	@FindBy(xpath="//a[contains(.,'Sub Category ')]")
	private WebElement SubCategoryButton;

	@FindBy(xpath="//a[contains(.,'Insert Product ')]")
	private WebElement InsertProductButton;

	@FindBy(xpath="//a[contains(.,'Manage Products ')]")
	private WebElement ManageProductsButton;

	@FindBy(xpath= "//a[contains(.,'User Login Log ')]")
	private WebElement UserLoginLogButton;

	@FindBy(xpath ="//a[contains(.,'Logout')]/ancestor::ul[@class='dropdown-menu']//a[.='Logout']")
	private WebElement Logout;

	public AdminCommonPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void orderManagementButton()
	{
		OrderManagementButton.click();
	}
	public void manageruserButton()
	{
		ManageruserButton.click();
	}
	public void createCategoryButton()
	{
		CreateCategoryButton.click();
	}
	public void subCategoryButton()
	{
		SubCategoryButton.click();
	}
	public void insertProductButton()
	{
		InsertProductButton.click();
	}
	public void manageProductsButton() 
	{
		ManageProductsButton.click();
	}
	public void userLoginLogButton()
	{
		UserLoginLogButton.click();
	}
	}







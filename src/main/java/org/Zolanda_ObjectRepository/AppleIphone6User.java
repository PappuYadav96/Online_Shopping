package org.Zolanda_ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppleIphone6User {


	@FindBy(xpath ="//a[text()='Login']")
	private WebElement ClickLoginButton;

	@FindBy(xpath ="//input[@id='exampleInputEmail1']")
	private WebElement UserNameTextField;

	@FindBy(xpath = "//input[@id='exampleInputPassword1']")
	private WebElement PasswordTextField;

	@FindBy(xpath ="//button[@name='login']")
	private WebElement ClickLoginButtonclick;

	@FindBy(xpath ="//div[@class='control-group']")
	private WebElement ClickSearchButton;

	@FindBy(xpath="//input[@name='product']")
	private WebElement EnterIphoneTextField;

	@FindBy(xpath ="//button[@name='search']")
	private WebElement ClickSearchbutton;

	@FindBy(xpath ="//a[@title='Wishlist']")
	private WebElement ClickWishilistButton;

	@FindBy(xpath ="//a[.='Add to cart']")
	private WebElement ClicKMyCartButton;

	@FindBy(xpath ="//i[@class='icon fa fa-shopping-cart']")
	private WebElement ClickCartbutton;

	@FindBy(xpath = "//span[text()='Shipping Address']")
	private WebElement ShippingAddressClick;

	@FindBy(xpath = "//textarea[@name='billingaddress']")
	private WebElement BillingAddressTextField;

	@FindBy(xpath = "//input[@name='bilingstate']")
	private WebElement ShippingStateTextField;

	@FindBy(xpath = "//input[@id='billingcity']")
	private WebElement ShippingCityTextField;

	@FindBy(xpath = "//input[@id='billingpincode']")
	private WebElement ShippingPinCodeTextField;

	@FindBy(xpath = "//button[@name='update']")
	private WebElement UpdateButtonClick;


	@FindBy(xpath = "//span[text()='Billing Address']")
	private WebElement billingaddressClick;

	@FindBy(xpath = "//textarea[@name='shippingaddress']")
	private WebElement shippingStateTextField;

	@FindBy(xpath = "//input[@id='shippingcity']")
	private WebElement shippingCityTextField;

	@FindBy(xpath = "//input[@id='shippingpincode']")
	private WebElement shippingPinCodeTextField;

	@FindBy(xpath = "//button[@name='shipupdate']")
	private WebElement ShipUpdateClick;

	@FindBy(xpath = "//button[text()='PROCCED TO CHEKOUT']")
	private WebElement ProcedtoCheckoutClick;


	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutClick;

	public  AppleIphone6User (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void UserSignup(String un, String pd, String ip, String pt, String bh, String ad,
			String pc, String ca, String cc, String dc)

	{
		 ClickLoginButton.click();
		 UserNameTextField.sendKeys(un);
		 PasswordTextField.sendKeys(pd);
		 ClickLoginButtonclick.click();
		 ClickLoginButtonclick.click();
		 ClickSearchButton.click();
		 EnterIphoneTextField.sendKeys(ip);
		 ClickSearchbutton.click();
		 ClickWishilistButton.click();
		 ClicKMyCartButton.click();
		 ClickCartbutton.click();
		 ShippingAddressClick.click();
		 BillingAddressTextField.sendKeys(pt);
		 ShippingStateTextField.sendKeys(bh);
		 ShippingCityTextField.sendKeys(ad);
		 ShippingPinCodeTextField.sendKeys(pc);
		 UpdateButtonClick.click();
		 billingaddressClick.click();
		 shippingStateTextField.sendKeys(ca);
		 shippingCityTextField.sendKeys(cc);
		 shippingPinCodeTextField.sendKeys(dc);
		 ShipUpdateClick.click();
		 ProcedtoCheckoutClick.click();
		 logoutClick.click();
	}
}
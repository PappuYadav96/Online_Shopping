package UserModuleZolandoPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sdet40.genericUtility.WebDriverUtility;

public class UserSignupPage 

{
	WebDriver driver;
	@FindBy(xpath="//a[text()='My Account']") 
	private WebElement AccountClick;

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
	private WebElement SignupClick;

	@FindBy(xpath ="//h4[text()='sign in']")
	private WebElement SigninClick;

	@FindBy(xpath = "//input[@id='exampleInputEmail1']")
	private WebElement EnterEmailId;

	@FindBy(xpath ="//input[@id='exampleInputPassword1']")
	private WebElement EnterPasswordTextField;

	@FindBy(xpath ="//button[@name='login']")
	private WebElement ClickloginButton;



	//Initialization all element variable
	public UserSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
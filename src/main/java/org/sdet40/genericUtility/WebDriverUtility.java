package org.sdet40.genericUtility;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import org.Zolanda_ObjectRepository.TabNames;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {

	/**
	 * This method is used to launch the browser
	 * 
	 * @param browser
	 * @return
	 */
	public WebDriver launchBrowser(String browser) {
		WebDriver driver = null;
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();// method chaining
			driver = new ChromeDriver(); // abstraction
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();// method chaining
			driver = new FirefoxDriver(); // abstraction
			break;
		case "ie":
			WebDriverManager.iedriver().setup(); // method chaining
			driver = new InternetExplorerDriver();// abstraction
			break;
		default:
			System.out.println("You entered wrong Browser key in the Property file");
			break;
		}
		return driver;
	}

	/**
	 * This method is used to maximize the browser
	 * 
	 * @param driver
	 */
	public void maximizeBrowser(WebDriver driver) {
		driver.manage().window().maximize();
	}

	/**
	 * This method is used to wait the controller implicitly Till load
	 * 
	 * @param driver
	 * @param longTimeout
	 */
	public void waitTillPageLoad(WebDriver driver, Long longTimeout) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(longTimeout));
	}

	/**
	 * This method is used to open the application
	 * 
	 * @param driver
	 * @param url
	 */
	public void navigateApplication(WebDriver driver, String url) {
		driver.get(url);
	}

	/**
	 * This method is used to Launch browser, Maximize Browser, Wait page implicitly
	 * and navigate
	 * 
	 * @param browser
	 * @param longTimeout
	 * @param url
	 * @return
	 */
	public WebDriver openBrowserWithApplications(String browser, long longTimeout, String url) {
		WebDriver driver = launchBrowser(browser);
		maximizeBrowser(driver);
		waitTillPageLoad(driver, longTimeout);
		navigateApplication(driver, url);
		return driver;
	}

	/**
	 * This method is used to mouse hover action
	 * 
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element) {
		new Actions(driver).moveToElement(element).perform();
	}

	/**
	 * This method is used to double click on webelement
	 * 
	 * @param driver
	 * @param element
	 */
	public void doubleClick(WebDriver driver, WebElement element) {
		new Actions(driver).doubleClick(element).perform();
	}

	/**
	 * This method is used to double click on webpage
	 * 
	 * @param driver
	 */
	public void doubleClick(WebDriver driver) {
		new Actions(driver).doubleClick().perform();
	}

	/**
	 * This method is used to handle the dropdown of the application
	 * 
	 * @param element
	 * @param index
	 * 
	 */
	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);

	}

	public void selectByVisibleText(WebElement element, String Text) {
		Select select = new Select(element);
		select.selectByVisibleText(Text);
	}

	public void selectByIndex(WebElement element, int Index) {
		Select select = new Select(element);
		select.selectByIndex(Index);
	}

	/**
	 * This method is used to close the Browser instance
	 * 
	 * @param driver
	 */
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}

	/**
	 * This method is used to wait till the element visible
	 * 
	 * @param driver
	 * @param timeOuts
	 * @param element
	 */
	public void switchToWindow(WebDriver driver, long timeOuts, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOuts));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is used to switch the window based on partialtext of url
	 * 
	 * @param driver
	 * @param partialtext
	 */
	public void switchToWindow(WebDriver driver, String partialText) {
		Set<String> winds = driver.getWindowHandles();
		for (String id : winds) {
			driver.switchTo().window(id);
			if (driver.getCurrentUrl().contains(partialText)) {
				break;
			}
		}
	}

	public WebElement convertDynamicXpathIntoByWebElement(String dynamicXpath, TabNames logout, WebDriver driver) {
		String requiredXpath = String.format(dynamicXpath, logout);
		WebElement element = driver.findElement(By.xpath(requiredXpath));
		return element;
	}

	/**
	 * This method is used to used to convert the dynamic Xpath into By locator
	 * 
	 * @param dynamicXpath
	 * @param replaceData
	 * @param driver
	 * @return
	 */
	public By convertDynamicXpathIntoByClass(String dynamicXpath, String replaceData, WebDriver driver) {
		String requiredXpath = String.format(dynamicXpath, replaceData);
		By element = By.xpath(requiredXpath);
		return element;
	}

	/**
	 * This method is used for getting screenshot
	 * 
	 * @param driver
	 * @param Screenshotname
	 * @return
	 * @throws IOException
	 *
	 */
	public String takeScreenshot(WebDriver driver, JavaUtility javaUtility, String className) {
		String currentTime = javaUtility.CurrentTime();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File desc = new File("./screenshot/" + className + "_" + currentTime + ".PNG");
		try {
			Files.copy(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return desc.getAbsolutePath();
	}

	public String takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		String tempPath = ts.getScreenshotAs(OutputType.BASE64);
		return tempPath;
	}

	// public void jsIntiallization(WebDriver driver) {
	// jsExecutor = (JavascriptExecutor) driver;

	// }
	// public void openApplicationUsingJS(String url) {
	// jsExecutor.executeScript("window.location = arguments[0]",url);

	// }
	// public void sendKeysUsingJS(WebElement element, String data) {
	// jsExecutor.executeScript("arguments[0].value = arguments[1]", element, data);

	// }
	// public void clickUsingJS(WebElement element) {
	// jsExecutor.executeScript("arguments[0].click()", element);

	// }
	// public void scrollTillElementUsingJS(WebElement element) {
	// jsExecutor.executeScript("arguments[0].scrollIntoView()",element);

}

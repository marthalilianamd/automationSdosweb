package automation.sdosweb.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base {
	
	private WebDriver driver;
	
	public Base(WebDriver driver) {
		this.driver = driver;
	}
	
	/*
	 * Call FirefoxDriver: execute the navigator 
	 */
	public WebDriver firefoxConnection() {
		System.setProperty("webdriver.gecko.driver", "C:/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	/* 
	 * Wrapper
	 */
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	/*
	 * Elements list
	 */
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	
	/*
	 * Element text
	 */
	public String getText(WebElement element) {
		return element.getText();
	}
	
	/*
	 * Locator text
	 */
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	/*
	 * Type on an element
	 */
	public void type(String inpuText, By locator) {
		driver.findElement(locator).sendKeys(inpuText);
	}
	
	/*
	 * Click on an element
	 */
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	/*
	 * Element Visibility
	 */
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	/*
	 * Open the page web with URL
	 */
	public void visit(String url) {
		driver.get(url);
	}
	
	/*
	 * Go or move to an element
	 */	
	public void goToElement(By locator) {
		Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(locator)).build().perform();
	}
	
	public void scrollDown() {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250)");
	}
	
	/*
	 * Click on an popup element
	 */
	
	public void clickPopupElement(By locator) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", locator);
	}

}

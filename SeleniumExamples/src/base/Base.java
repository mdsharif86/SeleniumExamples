package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static void setupWebDriver() {

		
	System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	}// setUpWebDriver()
	
	public static void navigateURL(String url) {
		driver.get(url);
		
	}//navigateURL()
	
	public static void click(By by) {
		driver.findElement(by).click();
		
	}
	
	public static void sendKeys(By by, String keyvalue) {
		driver.findElement(by).sendKeys(keyvalue);
		
	}
	
	public static String getText(By by) {
		
		
		return driver.findElement(by).getText();
	}
	
	public static void closeMethod() {
		
		driver.close();
	}

}//class Base

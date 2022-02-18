import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base;



public class BestBuy extends Base {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.bestbuy.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='c-close-icon c-modal-close-icon']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='gh-search-input']")).sendKeys("Laptop" + Keys.ENTER);
		driver.findElement(By.xpath("//button[@title='submit search']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='sku-title']")); 
		
	}

}

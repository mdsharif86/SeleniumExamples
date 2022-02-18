package SeleniumFrameExample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;

public class BestBuyLapPrice extends Base {

	public static void main(String[] args) throws InterruptedException {
		
		setupWebDriver();
		
		navigateURL("https://www.bestbuy.com");
		
		click(By.xpath("//button[@class='c-close-icon c-modal-close-icon'] "));
		Thread.sleep(2000);
		sendKeys(By.xpath("//input[@id='gh-search-input']"), "Laptop");
		click(By.xpath("//button[@title='submit search']"));
		//click(By.xpath("//div[@class='sku-title']"));
		List<WebElement>elements = driver.findElements(By.xpath("//div[@class='sku-title']"));
		
		//div[@class='priceView-hero-price priceView-customer-price']
		List<WebElement>price = driver.findElements(By.xpath("//div[@class='priceView-hero-price priceView-customer-price']"));
		for (int i = 0; i<elements.size(); i++) {
			System.out.println("name of laptop: " + elements.get(i).getText() + " " + price.get(i).getText());
		}
			
	}//main

}//class

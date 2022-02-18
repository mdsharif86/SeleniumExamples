import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		WebDriver website;
		website = new ChromeDriver();
		website.get("https://www.craigslist.org/");
		website.manage().window().maximize();
		website.findElement(By.xpath("//input[@id='query']")).sendKeys("Cow" + Keys.ENTER);
		website.findElement(By.xpath("//a[@id='owner-purveyor']")).click();
		website.findElement(By.xpath("//label[@class='hasPic']")).click();
		website.findElement(By.xpath("//input[@size='5']")).sendKeys("50");
		website.findElement(By.xpath("//input[@placeholder='from zip']")).sendKeys("73170");
		
		website.findElement(By.xpath("//input[@name='min_price']")).sendKeys("1000");
		website.findElement(By.xpath("//input[@name='max_price']")).sendKeys("1500");
		
		website.findElement(By.xpath("//span[@class='icon icon-search']")).click();
		
		String totoalCount = website.findElement(By.xpath("//div[3]/div[3]/span[2]/span/span[@class='totalcount']")).getText();
		System.out.println("Total result: " + totoalCount);
		//website.findElement(By.xpath("//button[@type='submit']")).click();
	}

}

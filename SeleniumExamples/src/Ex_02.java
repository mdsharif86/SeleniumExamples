import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_02 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Java\\Chromedrive\\chromedriver_win32\\chromedriver.exe");
		WebDriver website;
		website = new ChromeDriver();
		//go to craiglist site
		website.get("http://craiglist.org");
		website.manage().window().maximize();
		website.findElement(By.xpath("//input[@id='query']")).sendKeys("car" + Keys.ENTER);
		website.findElement(By.xpath("//a[@id='owner-purveyor']")).click();
		website.findElement(By.xpath("//input[@class='flatinput searchInput search_distance']")).sendKeys("100");
		website.findElement(By.xpath("//input[@class=\"flatinput searchInput postal\"]")).sendKeys("73170");
		
		website.close();  // to close the TAB
		website.quit(); // to close the browser
		
		
		
		
	}

}

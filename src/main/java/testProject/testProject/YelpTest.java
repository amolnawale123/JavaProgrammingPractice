package testProject.testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class YelpTest {
	
	WebDriver driver;
	@Test
	public void testYelp() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		//driver = new FirefoxDriver();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yelp.com/");
		
		driver.findElement(By.xpath("//input[@id='find_desc']")).click();
		driver.findElement(By.xpath("//ul[@class='suggestions-list']/li[1]/div/strong")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[@class='suggested-filters']/ul/li[7]/label/span/span[1]")).click();
		driver.findElement(By.xpath("//div[@class='filter-panel_filters']/div[5]/ul/li[4]/label/span/span[1]")).click();
	}

}

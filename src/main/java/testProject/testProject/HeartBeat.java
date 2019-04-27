package testProject.testProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HeartBeat {
	WebDriver driver;
	String url="https://api.sapconsumerinsight365.com/status";

	@Test
	public void testHeartBeat() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
		// driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		String result=driver.findElement(By.xpath("xhtml:html/xhtml:body/xhtml:pre")).getText();
		System.out.println("The result is "+ result);
		String successMsg = result.substring(1, 15);
		System.out.println("The Success Message is: " + successMsg);
		Assert.assertTrue(successMsg.contains("true"), "Failed - Application is down and not running");
	}
}
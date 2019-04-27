package testProject.testProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Dropdown {
	public WebDriver driver;

	@BeforeClass
	public void Launch() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		Thread.sleep(5000);
	}

	@Test
	public void Droptest() throws InterruptedException {
		WebElement Droptest = driver.findElement(By.id("dropdown"));
		Select dropdown = new Select(Droptest);
		dropdown.selectByIndex(1);
		Thread.sleep(1000);
		dropdown.selectByValue("2");
		Thread.sleep(1000);
		dropdown.selectByVisibleText("Option 1");
		Thread.sleep(1000);
		List<WebElement> dp = dropdown.getOptions();
		System.out.println("Number of items: " + dp.size());
		Thread.sleep(2000);
		String test = dropdown.getFirstSelectedOption().getText();
		System.out.println(test);
		Thread.sleep(1000);
		dropdown.getAllSelectedOptions();
	}

	@AfterClass
	public void End() {
		driver.quit();
	}
}
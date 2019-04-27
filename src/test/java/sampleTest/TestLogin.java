package sampleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestLogin {

	ExtentReports report;
	ExtentTest logger;
	WebDriver driver;
	@Test
	public void testLogin() throws InterruptedException{
		report = new ExtentReports("C:\\Workspace\\testProject\\testReport.html");
		logger=report.startTest("Start Login Test");
		System.setProperty("webdriver.chrome.driver", "C:\\Workspace\\testProject\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		logger.log(LogStatus.INFO, "Browser started");
		driver.get("http://newtours.demoaut.com/");
		logger.log(LogStatus.INFO, "Login Page displayed");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury664787");
		logger.log(LogStatus.INFO, "User Credentials entered");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		Assert.assertTrue(title.contains("Find"));
		logger.log(LogStatus.PASS, "Title Verified - Pass");
	}
	
	@AfterMethod
	public void tearDown(ITestResult result){
		if(result.getStatus()==ITestResult.FAILURE){
			String scrnshotPath = Utility.captureScreenshot(driver, result.getName());
			String image = logger.addScreenCapture(scrnshotPath);
			logger.log(LogStatus.FAIL,"Title Verification Failed",image);
		}
		report.endTest(logger);
		report.flush();
	}
}

package com.sap.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Workspace\\testProject\\src\\main\\resources\\chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/test/yahoo.html";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		driver.manage().window().maximize();

		WebElement ele = driver.findElement(By.id("messenger-download"));

		String sourceLocation = ele.getAttribute("href");

		String wget_command = "cmd /c C:\\Softwares\\wget-1.19.4-win64\\wget.exe -P C:\\Softwares --no-check-certificate "
				+ sourceLocation;

		try {
			Process exec = Runtime.getRuntime().exec(wget_command);
			int exitval = exec.waitFor();
			System.out.println("Exit Value : " + exitval);
		} catch (InterruptedException | IOException ex) {
			System.out.println(ex.toString());
		}
		driver.quit();
	}

}

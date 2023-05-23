package com.the.internet.saucedemo.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	//WebDriver driver = null;
	WebDriver driver;
	public static String browserName = null;
	
	//Page URL
	private static String PAGE_URL="http://the-internet.herokuapp.com/";
	
	@BeforeTest
		public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
		// System.setProperty("webdriver.gecko.driver", projectPath +
		// "/drivers/geckodriver/geckodriver.exe");
		//driver = new FirefoxDriver();
		driver = new ChromeDriver();

	}

	@Test
	public void startTheMainWebsite() throws InterruptedException {

		// Navigate to wanted page
		driver.get(PAGE_URL);
		
		
		// Find text to ensure, that page works fine
		driver.findElement(By.xpath("//*[text()='Welcome to the-internet']"));
		

	}

	@AfterTest
	public void tearDownTest() {
		driver.close();
				
	}
}

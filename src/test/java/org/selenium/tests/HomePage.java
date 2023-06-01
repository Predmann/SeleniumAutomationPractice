package org.selenium.tests;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePage {
	private static final Logger log = LogManager.getLogger(HomePage.class);
	WebDriver driver = null;
	//WebDriver driver;
	//public static String browserName = null;
	
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


		try {
			// Navigate to wanted page
			driver.get(PAGE_URL);
			// Find text to ensure, that page works fine
			driver.findElement(By.xpath("//*[text()='Welcome to the-internet']"));

			log.info("element or URL are found!");
		}
		catch (Exception ex){
			log.trace("element or URL are NOT found!");
			ex.printStackTrace();
		}

	}

	@AfterTest
	public void tearDownTest() {
		log.info("closing");
		driver.close();

	}
}

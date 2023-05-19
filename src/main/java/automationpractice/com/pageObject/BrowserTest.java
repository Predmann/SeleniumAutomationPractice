package automationpractice.com.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BrowserTest {

    private static final Logger log = LogManager.getLogger(BrowserTest.class);

    public static void main(String[] args) throws Exception {

        String projectPath = System.getProperty("user.dir");
        // System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        //WebDriver driver = new FirefoxDriver();
        WebDriver driver = new ChromeDriver();

        if (driver.equals("new ChromeDriver()")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        } else {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");

        }

        // Navigate to wanted page
        try {
            driver.get("https://www.saucedemo.com/");
        } catch (Exception e) {
            throw new NullPointerException();
        }

        // Wait a little bit. I know that is not correct but I needed it for now.
        // Will be removed soon due to using implicityWaits
        Thread.sleep(2000);

        // Find textBox and searchButton
        try {
            WebElement loginButton = driver.findElement(By.id("login-button"));
            log.info("element found!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Thread.sleep(2000);
        log.info("finish");
        driver.quit();
        //driver.close();

    }
}

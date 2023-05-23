package automationpractice.com.pageObject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Utils;


public class LoginMainPage {

    public static void main(String[] args) throws Exception {

        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Variables
        String url = "https://www.saucedemo.com/";


        //Actions
        try {
            driver.get(url);
        } catch (Exception e) {
            throw new NullPointerException();
        }

        //Locators
        WebElement loginButton = driver.findElement(By.id("login-button"));


    }
}

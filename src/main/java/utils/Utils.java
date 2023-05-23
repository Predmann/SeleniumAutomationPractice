package utils;

import automationpractice.com.pageObject.LoginMainPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Utils {
    private static final Logger log = LogManager.getLogger(LoginMainPage.class);

    public static void navigateToUrl(WebDriver driver, String url) {
        try {
            log.info("Navigate to URL");
            driver.get(url);

        } catch (Exception e) {
            log.error(e.getMessage());
        }

    }

}

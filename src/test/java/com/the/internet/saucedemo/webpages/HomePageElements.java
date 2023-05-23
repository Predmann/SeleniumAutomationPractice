package com.the.internet.saucedemo.webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {
	WebDriver driver;

	@FindBy(xpath = "//*[text()='Welcome to the-internet']")
	WebElement mainTitle;
	
	
}

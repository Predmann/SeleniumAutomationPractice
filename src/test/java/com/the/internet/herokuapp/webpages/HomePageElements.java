package com.the.internet.herokuapp.webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageElements {
	WebDriver driver;

	@FindBy(xpath = "//*[text()='Welcome to the-internet']")
	WebElement mainTitle;
	
	
}

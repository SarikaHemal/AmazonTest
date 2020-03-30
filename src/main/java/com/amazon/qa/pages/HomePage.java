package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")
	WebElement logo;
	
	public String validateTitle() {
		return driver.getTitle();
	}

	

}

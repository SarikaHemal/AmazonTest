package com.amazon.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase {
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//span[@class='nav-sprite nav-logo-base']")
	WebElement logo;
	
	//Account list
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]11")
	WebElement accList;
	
	//Singin button
	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']//a//span[@class='nav-action-inner']")
	WebElement signinBtn;
	
	//Action
	public SigninPage validateSigninButton(){
		 
		Actions action=new Actions(driver);
		action.moveToElement(accList).build().perform();
		signinBtn.click();
		//Thread.sleep(3000);
		return new SigninPage();
	}
	
	
	public String validateTitle() {
		return driver.getTitle();
	}

	

}

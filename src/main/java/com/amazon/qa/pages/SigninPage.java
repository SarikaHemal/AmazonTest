package com.amazon.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SigninPage extends TestBase {
	
	public SigninPage() {
		PageFactory.initElements(driver, this);
	}
	//Account list
	@FindBy(xpath="//span[contains(text(),'Hello, Sign in')]")
	WebElement accList;
	//Singin button
	@FindBy(xpath="//div[@id='nav-flyout-ya-signin']//a//span[@class='nav-action-inner']")
	WebElement signinBtn;
	
	//Action
	public boolean validateSigninButton(){
		 
		Actions action=new Actions(driver);
		action.moveToElement(accList).build().perform();
		signinBtn.click();
		return true;
				
	}
}


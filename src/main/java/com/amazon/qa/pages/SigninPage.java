package com.amazon.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class SigninPage extends TestBase {
	
	public SigninPage() {
		PageFactory.initElements(driver, this);
	}
	//Email Textbox
	@FindBy(name="email")
	WebElement email;
	
	//Continue button
	@FindBy(id="continue")
	WebElement continueBtn;
	
	//Password
	@FindBy(name="password")
	WebElement password;
	
	//SignIn Submit
	@FindBy(id="signInSubmit")
	WebElement signinBtn;
	
	
	
	//Action
	public HomePage validaSignin(String un,String pwd){
				 
		//Actions action=new Actions(driver);
		//action.moveToElement(accList).build().perform();
		//signinBtn.click();
		
		
		email.sendKeys(un);
		continueBtn.click();
		password.sendKeys(pwd);
		signinBtn.click();
		return new HomePage();
		
				
	}
}


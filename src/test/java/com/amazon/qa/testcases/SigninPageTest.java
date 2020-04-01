package com.amazon.qa.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.SigninPage;
import com.amazon.qa.pages.HomePage;

public class SigninPageTest extends TestBase{
	SigninPage SigninPage;
	HomePage HomePage;
	public SigninPageTest() {
		super();
	}
	
	 @BeforeMethod
	 public void setUp() {
		 intialization();
		 SigninPage= new SigninPage();
		 HomePage= new HomePage();
		 
	 }
	 
	 @Test
	 public void validateSigninTest() {
		HomePage = SigninPage.validaSignin(prop.getProperty("email"), prop.getProperty("password"));
		Assert.assertEquals(driver.getTitle(),"Your Amazon.com","login success");
		//String s1=driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']")).getText();
		//System.out.print(s1);
		
	 }
	 
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }

}

package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.SigninPage;

public class SigninPageTest extends TestBase{
	SigninPage SigninPage;
	public SigninPageTest() {
		super();
	}
	
	 @BeforeMethod
	 public void setUp() {
		 intialization();
		 SigninPage= new SigninPage();
		 
	 }
	 
	 @Test
	 public void signinButtonTest() {
		boolean b1= SigninPage.validateSigninButton();
		Assert.assertTrue(b1);
		 
	 }
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }

}

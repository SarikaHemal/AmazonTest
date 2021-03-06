package com.amazon.qa.testcases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.SigninPage;
import com.amazon.qa.util.TestUtil;


public class HomePageTest extends TestBase{
	HomePage HomePage;
	SigninPage SigninPage;
	public String sheetName="New Address";
	public HomePageTest() {
		super();
	}
	 @BeforeMethod
	 public void setUp() {
		 intialization();
		 HomePage= new HomePage();	
		 SigninPage =new SigninPage();
		 
	 }
	 
	 @Test(priority=1)
	 public void TitleTest() {
		 String s1=HomePage.validateTitle();
		 Assert.assertEquals(s1, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	 }
	 @DataProvider
	 public Object[][] getTestData() {
		 Object data[][]=TestUtil.getTestData(sheetName);
		 return data;
	 }
	/* @Test(priority=3,dataProvider="getTestData")
	 public void validateAddAddrees() {
		 
	 }*/
	 
	 @Test(priority=2)
	 public void signinButtonTest() {
		SigninPage = HomePage.validateSigninButton();
		Assert.assertEquals(driver.getTitle(), "Amazon Sign-In");
		
		 
	 }
	 
	 @AfterMethod
	 public void tearDown() throws IOException {
		 TestUtil.takeScreenshotAtEndOfTest();
		 driver.quit();
	 }


}

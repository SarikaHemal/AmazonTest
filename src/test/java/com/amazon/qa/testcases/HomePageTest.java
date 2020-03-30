package com.amazon.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.HomePage;

public class HomePageTest extends TestBase{
	HomePage HomePage;
	public HomePageTest() {
		super();
	}
	 @BeforeMethod
	 public void setUp() {
		 intialization();
		 HomePage= new HomePage();		 
	 }
	 
	 @Test
	 public void TitleTest() {
		 String s1=HomePage.validateTitle();
		 Assert.assertEquals(s1, "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
	 }
	 
	 @AfterMethod
	 public void tearDown() {
		 driver.quit();
	 }


}

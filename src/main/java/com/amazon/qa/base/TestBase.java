package com.amazon.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	static WebDriver driver;
	static Properties prop;
	public TestBase()  {
		try {
			prop= new Properties();
			FileInputStream ip= new FileInputStream("C:\\Users\\sarik\\eclipse-workspace\\AmazonTestAutomation\\src\\main\\java"
					+ "\\co\\amazon\\qa\\config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	public static void intialization() {
		String browserName =prop.getProperty("browser");
		if (browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\ChomeDriver\\new\\chromedriver.exe");
			driver =new ChromeDriver();//launch Chrome
		}
		else if (browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","C:\\geckodriver-v0.24.0-win64\\geckodriver.exe");
			driver =new FirefoxDriver();//launch firefox
		}
		else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver","C:\\internetexplorerldriver\\iedriverserver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
	}
		

}

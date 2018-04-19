package com.Pagefactory;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testbase.testbase;

public class amazonsearchbox extends testbase{
	
	 
	WebDriver driver;
	amazon login;
	booknextpage page;
	
	
	@Test(priority=1)	
	public void amazon(){
		login=new amazon(driver);
		login.sedkeys("books");
	}
	
	

	
	@Test(priority=0)
	public void BeforeTest(){
		System.setProperty("webdriver.gecko.driver","C:\\Users\\RAKESH\\Desktop\\New folder\\Testing\\jars\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		  driver = new FirefoxDriver();
		 driver.get("https://www.amazon.in/");

		
		 }
		 
		
	

	/*@Test(alwaysRun=false)
	public void quit(){
	driver.quit();
	}*/

	
}

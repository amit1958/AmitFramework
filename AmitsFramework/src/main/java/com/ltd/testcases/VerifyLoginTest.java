package com.ltd.testcases;

import org.com.origin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.ltd.pom.LoginPage;

public class VerifyLoginTest extends origin {
	
	@Test
	public void startLoginValidation(){
		/*System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lockthedeal.com/login");*/
		LoginPage mylogin= new LoginPage(driver);
		mylogin.locktheDealLogin("9811854502", "2124");
		/*
		mylogin.typeusername("9811854502");
		mylogin.typePassword("2124");
		mylogin.submitButton();
		*/
	}
	

}

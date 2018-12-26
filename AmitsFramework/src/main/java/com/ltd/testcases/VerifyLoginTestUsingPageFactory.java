package com.ltd.testcases;

import org.com.origin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Utility.BrowserFactory;

import com.ltd.pom.LoginPage;
import com.ltd.pom.LoginPageUsingPageFactory;

public class VerifyLoginTestUsingPageFactory {
	
	@Test
	public void startLoginValidation(){
		// This will launch browser and specific url 
		WebDriver driver=BrowserFactory.startBrowser("firefox", "https://www.lockthedeal.com/login");

		// Created Page Object using Page Factory
		/*System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lockthedeal.com/login");*/
		LoginPageUsingPageFactory myloginF= PageFactory.initElements(driver, LoginPageUsingPageFactory.class);
		myloginF.locktheDealLogin("9811854502", "2124");
		/*
		mylogin.typeusername("9811854502");
		mylogin.typePassword("2124");
		mylogin.submitButton();
		*/
	}
	

}

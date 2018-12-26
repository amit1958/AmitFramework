package com.ltd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class LoginPageUsingPageFactory {
	/*
	 This class has all the locators on the Login page
	 */
	WebDriver driver;
	
	@FindBy(id="loginusername")
	@CacheLookup
	WebElement user;
	
	@FindBy(id="password")
	@CacheLookup
	WebElement password;
	
	@FindBy(id= "submit")
	@CacheLookup
	WebElement formsubmit;
	

public LoginPageUsingPageFactory(WebDriver driver){
this.driver=driver;	
}

public void locktheDealLogin(String userid, String pass){
	user.sendKeys(userid);
	password.sendKeys(pass);
	formsubmit.click();
	
}

}


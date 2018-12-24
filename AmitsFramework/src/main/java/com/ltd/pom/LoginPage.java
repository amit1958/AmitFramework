package com.ltd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	/*
	 This class has all the locators on the Login page
	 */
	WebDriver driver;
By username= By.id("loginusername");
By password= By.id("password");
By submit= By.id("submit");

public LoginPage(WebDriver driver){
this.driver=driver;	
}

public void locktheDealLogin(String userid, String pass){
	driver.findElement(username).sendKeys(userid);
	driver.findElement(password).sendKeys(pass);
	driver.findElement(submit).click();
	
}
/*
public void typeusername(String uid){
	driver.findElement(username).sendKeys(uid);
}

public void typePassword(String pass){
	driver.findElement(password).sendKeys(pass);
}

public void submitButton(){
	driver.findElement(submit).click();
}
*/
}


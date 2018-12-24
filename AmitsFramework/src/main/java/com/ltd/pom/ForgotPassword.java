/**
 * 
 */
package com.ltd.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Amit.Sharma
 *
 */
public class ForgotPassword {

WebDriver driver;
By forgotlink= By.linkText("Forgot Passcode?");
By forgotEmailId = By.id("FPloginusername");
By submitforgot= By.id("submit");

public ForgotPassword(WebDriver driver){
	this.driver=driver;
}
public void myForgotPasswordPage(String forgotEmail){
	driver.findElement(forgotlink).click();
	driver.findElement(forgotEmailId).sendKeys(forgotEmail);
	driver.findElement(submitforgot).click();
}
}

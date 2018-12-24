/**
 * 
 */
package com.ltd.testcases;

import org.com.origin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ltd.pom.ForgotPassword;

/**
 * @author Amit.Sharma
 *
 */
public class VerifyForgotPassword  extends origin{
	
	public void validateForgotpassword(){
	System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver\\geckodriver-v0.23.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.lockthedeal.com/login");
	ForgotPassword fp= new ForgotPassword(driver);
	fp.myForgotPasswordPage("amit.kumar@lakshyanet.com");
	}

}

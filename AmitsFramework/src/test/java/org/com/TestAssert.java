package org.com;

import org.openqa.selenium.By;
import org.testng.Assert;

public class TestAssert extends origin {

	public void testAssertmyBlankLoginPage(){
		String expect = pr.getProperty("logininstruction");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='loginForm']/div[1]/div")).getText(), expect);
	}
	public void testAssertmyvalidloginPage(){
		String expect = pr.getProperty("loginexpected");
		System.out.println("expected text is " +expect);
		Assert.assertEquals(driver.getTitle(), expect);	
	}
	public void testAssertmyloginPageInvalidUName(){
		String expect = pr.getProperty("nonexistinguser");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='messagingDiv']/div")).getText(), expect);	
	}
	public void testAssertmyloginPageInvalidPassworde(){
		String expect = pr.getProperty("nonexistinguser");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='messagingDiv']/div")).getText(), expect);	
	}
}

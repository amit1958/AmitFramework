package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginPage extends origin{
	
	
	@Test(priority=0)
	public  void myBlankloginPage() throws InterruptedException{
		try{
			WebElement username= driver.findElement(By.id("loginusername"));
			//username.sendKeys(pr.getProperty("blankusername"));
			username.sendKeys(Keys.TAB);
			//WebElement password= driver.findElement(By.id("password"));
			//password.sendKeys(pr.getProperty("blankpassword"));
//			username.sendKeys(Keys.TAB);
//			username.sendKeys(Keys.TAB);
//			username.sendKeys(Keys.TAB);
			username.sendKeys(Keys.ENTER);
//			WebElement login= driver.findElement(By.id("submit"));
//					login.click();
			Thread.sleep(2);
			WebElement login1= driver.findElement(By.id("submit"));
			login1.click();
			String expect = pr.getProperty("logininstruction");
			Assert.assertEquals(driver.findElement(By.xpath("//*[@id='loginForm']/div[1]/div")).getText(), expect);	
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	
		
	}
	/*@Test(priority=1)
	public  void myvalidloginPage(){
		WebElement username= driver.findElement(By.id("loginusername"));
		username.sendKeys(pr.getProperty("username"));
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys(pr.getProperty("password"));
		driver.findElement(By.id("submit")).click();
		myWait= new WebDriverWait(driver, 10);
		myWait.until(ExpectedConditions.titleContains(pr.getProperty("loginexpected")));
		String expect = pr.getProperty("loginexpected");
		Assert.assertEquals(driver.getTitle(), expect);	
		//System.out.println("usrename is " +username1 );
		//System.out.println("and password is" +password1);
		
	}
	
	@Test(priority=2)
	public  void myloginPageInvalidUName(){
		WebElement username= driver.findElement(By.id("loginusername"));
		username.sendKeys(pr.getProperty("invalidusername"));
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys(pr.getProperty("password"));
		driver.findElement(By.id("submit")).click();
		String expect = pr.getProperty("nonexistinguser");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='messagingDiv']/div")).getText(), expect);	
		//System.out.println("usrename is " +username1 );
		//System.out.println("and password is" +password1);
		
	}
	@Test(priority=3)
	public  void myloginPageInvalidPassword(){
		WebElement username= driver.findElement(By.id("loginusername"));
		username.sendKeys(pr.getProperty("username"));
		WebElement password= driver.findElement(By.id("password"));
		password.sendKeys(pr.getProperty("invalidpassword"));
		driver.findElement(By.id("submit")).click();
		String expect = pr.getProperty("nonexistinguser");
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='messagingDiv']/div")).getText(), expect);	
		//System.out.println("usrename is " +username1 );
		//System.out.println("and password is" +password1);
		
	}
*/
}

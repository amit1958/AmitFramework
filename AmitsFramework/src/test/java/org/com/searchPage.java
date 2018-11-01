package org.com;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchPage extends origin  {
	loginPage login= new loginPage();
	@Test
	public void SearchwithOutSearchKey(){
		driver.findElement(By.id("search")).sendKeys("withoutsearchkey");
		driver.findElement(By.id("searchsubmit")).click();
		String currenturl= driver.getCurrentUrl();
		String url ="http://qa.lockthedeal.com/lakshyaCatalog/index?id=&query=exide";
	Assert.assertEquals(url, currenturl);
	}
	@Test
	public void myValidSearchwithOutLogin(){
		driver.findElement(By.id("search")).sendKeys("exidesearchkey");
		driver.findElement(By.id("searchsubmit")).click();
		String currenturl= driver.getCurrentUrl();
		String url ="http://qa.lockthedeal.com/lakshyaCatalog/index?id=&query=exide";
	Assert.assertEquals(url, currenturl);
	}
	@Test
	public void myInValidSearchwithOutLogin(){
		driver.findElement(By.id("search")).sendKeys("invalidSearchkey");
		driver.findElement(By.id("searchsubmit")).click();
		String currenturl= driver.getCurrentUrl();
		String url ="http://qa.lockthedeal.com/lakshyaCatalog/index?id=&query=exide";
	Assert.assertEquals(url, currenturl);
	}
	@Test
	public void myValidSearchwithLogin(){
		
		login.myvalidloginPage();
		driver.findElement(By.id("search")).sendKeys("exide");
		driver.findElement(By.id("searchsubmit")).click();
		String currenturl= driver.getCurrentUrl();
		String url ="http://qa.lockthedeal.com/lakshyaCatalog/index?id=&query=exide";
	Assert.assertEquals(url, currenturl);
	}
	@Test
	public void myInValidSearchwithLogin(){
		login.myvalidloginPage();
		driver.findElement(By.id("search")).sendKeys("exide");
		driver.findElement(By.id("searchsubmit")).click();
		String currenturl= driver.getCurrentUrl();
		String url ="http://qa.lockthedeal.com/lakshyaCatalog/index?id=&query=exide";
	Assert.assertEquals(url, currenturl);
	}
	}


package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.com.*;

public class origin {
	public static WebDriver driver;
	public static WebDriverWait myWait;
	public static Properties pr = new Properties() ;
	public static Actions myactions;
	public static Action myaction;
	
	@BeforeMethod
	public  void startUp() throws IOException{
	
		try{
			File myfile = new File("C:\\Users\\amit.sharma\\git\\repository-AmitFramework\\AmitsFramework\\my.properties");
			System.out.println("exists:==> "+myfile.exists());
			FileInputStream myInput= new FileInputStream(myfile);
			pr.load(myInput);
			//System.setProperty("webdriver.gecko.driver", pr.getProperty("ffdriverpath"));
			System.setProperty("webdriver.gecko.driver", pr.getProperty("ffdriverpathupdated"));
			System.out.println("before calling the url");
			driver= new FirefoxDriver();
			System.out.println("After calling the ffdriver");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			//driver.manage().window().maximize();
			driver.get(pr.getProperty("url"));
			System.out.println("url is " +pr.getProperty("url"));
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}
	@AfterMethod
	public void close()
	{
		driver.close();
	}	

}

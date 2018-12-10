package org.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.mail.EmailException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import sendEmail.SendEmail;

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
	public void failedscreenshot(ITestResult result) throws EmailException{
		if(ITestResult.FAILURE == result.getStatus()){
			 
				try {
					File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				  // now copy the  screenshot to desired location using copyFile method
				 
				 FileUtils.copyFile(src, new File("C:\\Users\\amit.sharma\\git\\repository-AmitFramework\\AmitsFramework" + fileName + " "+ System.currentTimeMillis()+".png"));
//				 Getting the TestMethod Name
				 String tcName = result.getMethod().getMethodName();
				 System.out.println("testcase is" +tcName);
				 
//				 Sending an email on the failure of the Testcase
				 SendEmail myemail = new SendEmail();
				 
					myemail.sendAnEmail("Failed testcase is "+" "  +tcName,"Selenium Testing"); 
					myemail.sendAnEmailwithAttachement("This is my body", "Email with Atachement");
				}
				 
				catch (IOException e)
				 
				{
				 
					e.printStackTrace();
				 
				    }
			driver.quit();	
		 }
		
		}
	String fileName;
	public void close()
	{
		driver.quit();
	}
	
	
}

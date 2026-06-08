package com.automation.stepDefinitions;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;
import com.automation.utility.Constants;
import com.automation.utility.ExtentReportsUtility;
import com.automation.utility.propertiesUtility;
public class UsermenuDropDownTest extends BaseSalesforce{
	private static Logger mylog = LogManager.getLogger(LoginstepDefinitions.class);
	 protected static  ExtentReportsUtility  extentObject=ExtentReportsUtility.getInstance();

@Test
public static void Testcase5() throws Exception 
{
	String usernameData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
			"username");
	String passwordData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
			"password");
	WebElement username = driver.findElement(By.id("username"));
	enterText(username, usernameData, "username filled");
	Thread.sleep(2000);
	WebElement password = driver.findElement(By.id("password"));
	enterText(password, passwordData, "password filled");
	Thread.sleep(2000);
	WebElement loginButton = driver.findElement(By.id("Login"));
	loginButton.click();
	mylog.info("Login successful");
		
		Thread.sleep(40000);
		//login_Salesforce();
		 
		WebElement profileBtn = driver.findElement(By.id("userNavButton"));
		profileBtn.click();
		Thread.sleep(2000);
		mylog.info("Test Passed");
		extentObject.logTestpassed("Testcase is passed ");
	    //extentObject.logTestpassed("Testcase is passed due to correct password");
	}

@Test
public static void Testcase8() throws Exception{
	Thread.sleep(2000);
	login_Salesforce();

WebElement usermenu  = driver.findElement(By.id("userNavButton"));
usermenu.click();
Thread.sleep(4000);
WebElement menuButton  = driver.findElement(By.xpath("//a[contains(@title,'Developer Console')]"));
menuButton.click();
Thread.sleep(4000);
mylog.info("Test Passed");
extentObject.logTestpassed("Testcase is passed ");
 
}

@Test
public static void Testcase9() throws Exception {
	
	
	Thread.sleep(2000);
		login_Salesforce();
		WebElement usermenu  = driver.findElement(By.id("userNavButton"));
		usermenu.click();
		Thread.sleep(4000);
		
		WebElement logout  = driver.findElement(By.xpath("//a[contains(@title,'Logout')]"));;
		logout.click();
		Thread.sleep(4000);
		mylog.info("Test Passed");
		extentObject.logTestpassed("Testcase is passed ");
		
	}
		 
		
}

	
		
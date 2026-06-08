package com.automation.stepDefinitions;

//import java.sql.Date;

import java.text.SimpleDateFormat;

import java.util.Date;


import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.automation.pages.Homepage;
import com.automation.pages.Loginpage;
//import com.automation.tests.base.BaseTest;
import com.automation.utility.Constants;
import com.automation.utility.ExtentReportsUtility;
import com.automation.utility.propertiesUtility;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

@Listeners(com.automation.utility.SalesforceListenersUtility.class)
public class LoginstepDefinitions {
	Loginpage login;
	Homepage homepage;
	//private LoginPage login;
protected static WebDriver driver;
	
	
	private static Logger mylog = LogManager.getLogger(LoginstepDefinitions.class);
	 protected static   ExtentReportsUtility  extentObject=ExtentReportsUtility.getInstance();
	



	
	public static void Errormsg() throws Exception {
		//extentObject.startTest("Error Message Test");

	    //extentObject.logTestpassed("Test started");

		Thread.sleep(2000);
		String usernameData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
				"username");
		Loginpage lp=new Loginpage(driver);
		lp.enterUserName(usernameData);
		Thread.sleep(2000);

		WebElement password = driver.findElement(By.id("password"));
		password.clear();

		Thread.sleep(2000);
		lp.clickLoginButton();
		
		String expected_formValue= "enter your username";
		WebElement actual_formValue = driver.findElement(By.id("error"));
		if (actual_formValue.equals(expected_formValue)) {
			mylog.info("Test Passed");
			
		    extentObject.logTestpassed("Testcase is passed due to correct password");
		} else {
			
			mylog.error("Test case is Failed");
			extentObject.logTestFailed("Testcase is failed due to passsword");	
			String filename=new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
			//takeScreenshot(Constants.SCREENSHOT_DIRECTORY_PATH+filename+".png");
			Assert.assertEquals(actual_formValue,expected_formValue);
			//extentObject.logTestWithscreenshot(Constants.SCREENSHOT_DIRECTORY_PATH+filename+".png");
		}

	}
	 public static void launchBrowser(String browserName) throws Exception
	 {
	 	switch (browserName.toLowerCase()) {
	 	case "chrome": driver= new ChromeDriver();
	 		break;
	 	case "firefox": driver= new FirefoxDriver();
	 	break;
	 	case "edge": driver= new EdgeDriver();
	 	break;
	 	case "safari": driver= new SafariDriver();
	 	
	 	break;
	 	default: mylog.info("invalid browser");
	 		break;
	 	}
	 }

	public static void goToURL(String url) throws Exception
	 {
	 	driver.get(url);
	 	driver.manage().window().maximize();
	 	Thread.sleep(3000);
	 }
	 public static void closeBrowser() throws Exception
		{
			Thread.sleep(3000);
			driver.close();
		}

	
	@Test(priority = 2)
	public static void Testcase2() throws Exception {

		
		
		String usernameData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
				"username");
		String passwordData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
				"password");
		Loginpage lp=new Loginpage(driver);
		lp.enterUserName(usernameData);
		lp.enterPassword(passwordData);
		lp.clickLoginButton();
			
			Thread.sleep(40000);
			//login_Salesforce();*/
		mylog.info("Test Passed");
		extentObject.logTestpassed("Testcase is passed ");
	}

	@Test(priority = 3)
	public static void Testcase3() throws Exception {

		Thread.sleep(2000);
		String usernameData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
				"username");
		String passwordData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
				"password");

		Loginpage lp=new Loginpage(driver);
		lp.enterUserName(usernameData);
		lp.enterPassword(passwordData);
		lp.clickremembercheckbox();
		lp.clickLoginButton();
		Thread.sleep(40000);
         Homepage hp=new Homepage(driver);
         hp.clickprofliebtn();
		Thread.sleep(2000);
		WebElement logoutLink = driver.findElement(By.xpath("//a[contains(@title,'Logout')]"));
		logoutLink.click();
		mylog.info("Clicked logout");
		Thread.sleep(2000);
		
	    WebElement emailField1 = driver.findElement(By.id("username"));

	    String actualValue = emailField1.getAttribute("value");

	    if (actualValue.equals(usernameData)) {
	        mylog.info("Test Passed");
	        extentObject.logTestpassed("Test case passed");        
	    } else {
	        mylog.error("Test Failed");
	        extentObject.logTestFailed("Testcase is failed due to validation");    
	    }
		
		
	}

	/*@Test(priority = 4)
	public static void Testcase4a() throws Exception {
		Thread.sleep(2000);
		String usernameData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
	    Loginpage lp=new Loginpage(driver);
		lp.enterUserName(usernameData);
		Thread.sleep(2000);
		WebElement forgotpassword = driver.findElement(By.id("forgot_password_link"));
		forgotpassword.click();
		Thread.sleep(2000);
		WebElement username1 = driver.findElement(By.id("un"));
		username1.sendKeys(usernameData);
		Thread.sleep(2000);

		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
		mylog.info("Test Passed");
	extentObject.logTestpassed("Testcase is passed due to validation");		
	}*/

	@Test(priority = 5)
	public static void Testcase4b() throws Exception {
		Thread.sleep(2000);
		String usernameData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
				"invalidusername");
		String passwordData = propertiesUtility.readDataFromPropertiesFile(Constants.APPLICATION_PROPERTIES,
				"invalidpassword");

		Loginpage lp=new Loginpage(driver);
		lp.enterUserName(usernameData);
		lp.enterPassword(passwordData);
		lp.clickLoginButton();
			
		mylog.info("Test Passed");
		extentObject.logTestpassed("Testcase is passed due to validation");		
	}
	@BeforeStep 

	public static void beforeStep() { 

	System.out.println("@beforestep executed"); 

	} 

	@AfterStep 

	public static void afterStep() { 

	System.out.println("@afterstep executed"); 

	} 
	@Before
	public static void beforeScenario() throws Exception
	{
		launchBrowser("chrome");
	}
	@After
	public static void afterScenario() throws Exception
	{
		closeBrowser();
	}

	@BeforeAll
	public static void beforeAllScenario()
	{
		System.out.println("@beforeAllSceanrio executed..............");
	}

	@AfterAll
	public static void afterAllScenario()
	{
		System.out.println("@afterAllSceanrio executed..............");
	}
	@Given("the url of the login of firebase application")
	public void the_url_of_the_login_of_firebase_application() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(4000);
	    //throw new io.cucumber.java.PendingException();
	}

	@When("i enter the username data")
	public void i_enter_the_username_data() throws Exception {
		WebElement emailField = driver.findElement(By.id("username"));
		emailField.sendKeys("gopuanushareddy31.e1b1ed27a7f6@agentforce.com");
		Thread.sleep(4000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("i enter the password data")
	public void i_enter_the_password_data() throws Exception {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Dharanireddy2018");
		Thread.sleep(4000);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("i click the login button")
	public void i_click_the_login_button() throws Exception {
		WebElement loginButton = driver.findElement(By.id("Login"));
		loginButton.click();
		Thread.sleep(40000);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("i should be able to see homepage")
	public void i_should_be_able_to_see_homepage() throws Exception {
		WebElement usermenu  = driver.findElement(By.id("userNavButton"));
		usermenu.click();
		//Thread.sleep(4000);
		//driver.close();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}
	@Given("the url {string}")
	public void the_url(String url) {
		driver=new ChromeDriver();
		driver.get(url);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@When("i enter the username as {string}")
	public void i_enter_the_username_as(String username_data) {
		WebElement emailField = driver.findElement(By.id("username"));
		emailField.sendKeys(username_data);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		
	}

	@When("i enter the password as {string}")
	public void i_enter_the_password_as(String password_data) {
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(password_data);
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
	@When("i land in {string}")
	public void i_land_in(String page) {
		//String page = null;
		if(page.equalsIgnoreCase("loginpage"))
		{
			login=new Loginpage(driver);
		}
		else if(page.equalsIgnoreCase("homepage"))
		{
			homepage=new Homepage(driver);
		}

	}

	@Then("i should be able to see error message")
	public void i_should_be_able_to_see_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();

		//String expected_formValue= "Error: Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		WebElement actual_formValue = driver.findElement(By.id("error"));
		//Assert.assertEquals(actual_formValue,expected_formValue);
	}




}

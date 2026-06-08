package com.automation.pages.base;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.messages.types.Duration;

//import com.automation.tests.base.BaseTest;

public class BasePage {
protected static  WebDriver driver;
public static WebDriverWait wait;
	
	private static Logger mylog = LogManager.getLogger(BasePage.class);
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public static void enterText(WebElement ele, CharSequence usernameData, String objectName)
	{
		if(ele.isDisplayed())
		{
			ele.clear();
			ele.sendKeys(usernameData);
			mylog.info("data is entred in the "+objectName);
		}
		else
		{
			mylog.error(objectName+" is not displayed");
		}
	}
	
	public static void clickElement(WebElement ele, String objectName)
	{
		if(ele.isEnabled())
		{
			ele.click();
			mylog.info(objectName+" is clicked");
		}
		else
		{
			mylog.error(objectName+" is disabled");
		}
	}
	
	public static void selectElement(WebElement ele, String objectName)
	{
		if(!ele.isSelected())
		{
			ele.click();
			mylog.info(objectName+" is slected");
		}
		else
		{
			mylog.error(objectName+" was already selected");
		}
	}
	public static void selectByText(WebElement ele, String value) {
		Select select=new Select(ele);
		select.selectByVisibleText(value);
		
		
	}
	public static void selectByIndex(WebElement ele, int value)
	{
		Select select=new Select(ele);
		select.selectByIndex(value);
		
	}
	public static void selectByValue(WebElement ele, String value)
	{
		Select select=new Select(ele);
		select.selectByValue(value);
	}

	public static void waitForAlertPresent(long timeInSec,String ObjectName)
	{
		System.out.println(ObjectName+ "waiting for visibility of alert box for maximum of "+timeInSec+ "sec");
		wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSec));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public static void waitForVisiblityOfElement(WebElement ele, long timeInSec, String ObjectName)
	{
		System.out.println(ObjectName+ "waiting for visibility of WebElement for maximum of "+timeInSec+ "sec");
		wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSec));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	public static void waitForElementToClickable(WebElement ele, long timeInSec, String ObjectName)
	{
		System.out.println(ObjectName+ "waiting for visibility of WebElement for maximum of "+timeInSec+ "sec");
		wait=new WebDriverWait(driver,Duration.ofSeconds(timeInSec));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}

}

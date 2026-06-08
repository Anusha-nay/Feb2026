package com.automation.stepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;

import org.openqa.selenium.support.ui.Select;



import java.time.Duration;
public class CreateAccountTest extends BaseSalesforce{


private static FluentWait<WebDriver> wait;

//private static FluentWait<WebDriver> wait;
@Test

public static void Testcase10() throws Exception {
	
	Thread.sleep(2000);
	login_Salesforce();

		
		WebElement accountsTab = driver.findElement(By.id("Account_Tab"));
		accountsTab.click();
		Thread.sleep(2000);
		
		WebElement newbutton = driver.findElement(By.xpath("//input[contains(@title,'New')]"));
		newbutton.click();
		Thread.sleep(2000);
		//FluentWait<WebDriver> wait;
		WebElement accName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("acc2")));
        accName.sendKeys("Test Account");
		
        WebElement Type = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("acc6")));
        Select select=new Select(Type);

		select.selectByIndex(5);
        
		 WebElement customerpriority = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.id("00NdM000021oWO6")));
	        Select select1=new Select(customerpriority);

			select1.selectByIndex(1);
	        
		
	}

@Test
public static void  Testcase11() throws Exception{
	
	Thread.sleep(2000);
	login_Salesforce();

	
		
		 
		
		WebElement accountsTab = driver.findElement(By.id("Account_Tab"));
		accountsTab.click();
		Thread.sleep(2000);
		WebElement createnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
		createnewview.click();
		Thread.sleep(2000);
		WebElement viewName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("fname")));
        viewName.sendKeys("abcd1");
		
        WebElement uniqueviewName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("devname")));
        uniqueviewName.sendKeys("abcd12");
        WebElement savebtn = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td/input[1]"));
		savebtn.click();
		Thread.sleep(2000);
		
		
	}


}



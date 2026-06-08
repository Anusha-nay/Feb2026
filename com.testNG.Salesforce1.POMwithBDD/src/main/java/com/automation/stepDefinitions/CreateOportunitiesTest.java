package com.automation.stepDefinitions;
import org.checkerframework.common.value.qual.StaticallyExecutable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.automation.tests.base.BaseSalesforce;

//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
public class CreateOportunitiesTest extends BaseSalesforce{
private static FluentWait<WebDriver> wait;
@Test
public static void Testcase15() throws Exception 
{
	
		 
	Thread.sleep(2000);
	login_Salesforce();
		WebElement opportunitieslink= driver.findElement(By.xpath("//a[contains(@title,'Opportunities Tab')]"));
		opportunitieslink.click();
		Thread.sleep(2000);
		WebElement Dropdownbtn= driver.findElement(By.xpath("//select[contains(@name,'fcf')]"));
		Dropdownbtn.click();
		Thread.sleep(2000);
	}

@Test
public static void  Testcase16() throws Exception{
{
	Thread.sleep(2000);
	login_Salesforce();
	
		WebElement opportunitieslink= driver.findElement(By.xpath("//a[contains(@title,'Opportunities Tab')]"));
		opportunitieslink.click();
		Thread.sleep(2000);
		WebElement newbutton = driver.findElement(By.xpath("//input[contains(@value,'New')]"));
		newbutton.click();
		Thread.sleep(2000);
		WebElement opportunityName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("opp3")));
        opportunityName.sendKeys("nay");
		
        WebElement accountName = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("opp4")));
        accountName.sendKeys("dhar");
        WebElement closedate = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("opp9")));
        closedate.sendKeys("3/24/2026");
        WebElement probability = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("opp12")));
        probability.sendKeys("5");
        WebElement primarycampaign = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("opp17")));
        primarycampaign.sendKeys("shar");
        WebElement leadsource = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("opp6")));
        Select select=new Select(leadsource);

		select.selectByIndex(1);
        
        

	}
}
@Test
public static void  Testcase17() throws Exception{
{
	Thread.sleep(2000);
	login_Salesforce();
	WebElement opportunitieslink= driver.findElement(By.xpath("//a[contains(@title,'Opportunities Tab')]"));
	opportunitieslink.click();
	Thread.sleep(2000);
	WebElement opportunitiespipeline= driver.findElement(By.xpath("//a[contains(text(),'Opportunity Pipeline')]"));
	opportunitiespipeline.click();
	Thread.sleep(2000);
	

}
}
@Test
public static void  Testcase18() throws Exception{
{
	Thread.sleep(2000);
	login_Salesforce();
	WebElement opportunitieslink= driver.findElement(By.xpath("//a[contains(@title,'Opportunities Tab')]"));
	opportunitieslink.click();
	Thread.sleep(2000);
	WebElement stuckopportunities= driver.findElement(By.xpath("//a[contains(text(),'Stuck Opportunities')]"));
	stuckopportunities.click();
	Thread.sleep(2000);
}
}
@Test
public static void  Testcase19() throws Exception{
{
	Thread.sleep(2000);
	login_Salesforce();
	WebElement opportunitieslink= driver.findElement(By.xpath("//a[contains(@title,'Opportunities Tab')]"));
	opportunitieslink.click();
	Thread.sleep(2000);
	WebElement quarterlySummary = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//h3[contains(text(),'Quarterly Summary')]")));
    quarterlySummary.click();
    WebElement interval = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("quarter_q")));
    Select select=new Select(interval);
    select.selectByIndex(1);
    WebElement include = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("quarter_q")));
    Select select1=new Select(include);
    select1.selectByIndex(1);
}
}
}





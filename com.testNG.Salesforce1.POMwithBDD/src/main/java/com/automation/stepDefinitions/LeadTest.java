package com.automation.stepDefinitions;
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
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class LeadTest extends BaseSalesforce{
private static FluentWait<WebDriver> wait;
@Test
public static void Testcase20() throws Exception 
{
	
		 
	Thread.sleep(2000);
	login_Salesforce();
		WebElement leadsbtn= driver.findElement(By.xpath("//a[contains(@title,'Leads Tab')]"));
		leadsbtn.click();
		Thread.sleep(2000);
		
        WebElement usermenu  = driver.findElement(By.id("userNavButton"));
		usermenu.click();
		Thread.sleep(4000);
		WebElement logout  = driver.findElement(By.xpath("//a[contains(@title,'Logout')]"));;
		logout.click();
		Thread.sleep(4000);
		
        }
@Test
public static void  Testcase21() throws Exception{
{
	Thread.sleep(2000);
	login_Salesforce();
	WebElement leadbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Leads Tab')]")));
    leadbtn.click();
    WebElement viewdropdown = driver.findElement(By.xpath("//select[contains(@title,'View:')]"));
	viewdropdown.click();
	Thread.sleep(2000);
}
}
@Test
public static void  Testcase23() throws Exception{
{
	Thread.sleep(2000);
	login_Salesforce();
	WebElement leadbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Leads Tab')]")));
    leadbtn.click();
    WebElement viewdropdown = driver.findElement(By.xpath("//select[contains(@title,'View:')]"));
	viewdropdown.click();
	Thread.sleep(2000);
	 Select select=new Select(viewdropdown);
        select.selectByIndex(3);
        WebElement gobtn = driver.findElement(By.xpath("//input[contains(@value,' Go! ')]"));
		gobtn.click();
		Thread.sleep(2000);

}
}
@Test
public static void  Testcase24() throws Exception{
{
	Thread.sleep(2000);
	login_Salesforce();
	WebElement leadbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Leads Tab')]")));
    leadbtn.click();

	WebElement newbutton = driver.findElement(By.xpath("//input[contains(@value,' New ')]"));
	newbutton.click();
	Thread.sleep(2000);
	WebElement lastName = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("name_lastlea2")));
    lastName.sendKeys("ABCD");
	
    WebElement companyname = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("lea3")));
    companyname.sendKeys("ABCD");
    WebElement savebtn = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
	savebtn.click();
	Thread.sleep(2000);
	
}
}
}

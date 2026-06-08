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

public class ContactsTest extends BaseSalesforce{


private static FluentWait<WebDriver> wait;

//private static FluentWait<WebDriver> wait;
@Test

public static void Testcase25() throws Exception {
	
	Thread.sleep(2000);
	login_Salesforce();
		WebElement contactsbtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[contains(@title,'Contacts Tab')]")));
        contactsbtn.click();
        WebElement newbtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//input[contains(@value,' New ')]")));
        newbtn.click();
        WebElement lastname = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("name_lastcon2")));
        lastname.sendKeys("red");
        WebElement accountname = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("con4")));
        accountname.sendKeys("shar1");
        WebElement savebtn = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/form/div/div[1]/table/tbody/tr/td[2]/input[1]"));
		savebtn.click();
		Thread.sleep(2000);
	}
@Test

public static void Testcase26() throws Exception {
	
	Thread.sleep(2000);
	login_Salesforce();
	WebElement contactsbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Contacts Tab')]")));
	contactsbtn.click();
	WebElement createnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	createnewview.click();
	Thread.sleep(2000);
	WebElement viewName = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("fname")));
    viewName.sendKeys("abcd2");
	
    WebElement uniqueviewName = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("devname")));
    uniqueviewName.sendKeys("abcd123");
    WebElement savebtn = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
	savebtn.click();
	Thread.sleep(2000);

}

@Test
public static void  Testcase27() throws Exception{
	
	Thread.sleep(2000);
	login_Salesforce();
	WebElement contactsbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Contacts Tab')]")));
	contactsbtn.click();
	WebElement recentlyviewed = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//select[contains(@name,'hotlist_mode')]")));
	 Select select=new Select(recentlyviewed);
        select.selectByVisibleText("Recently Modified"); 
}
@Test
public static void  Testcase28() throws Exception{
	
	Thread.sleep(2000);
	login_Salesforce();
	WebElement contactsbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Contacts Tab')]")));
	contactsbtn.click();
	WebElement viewbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//select[contains(@id,'fcf')]")));
	Select select=new Select(viewbtn);
    select.selectByVisibleText("My Contacts"); 
}
@Test
public static void  Testcase29() throws Exception{
	
	Thread.sleep(2000);
	login_Salesforce();
	WebElement contactsbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Contacts Tab')]")));
	contactsbtn.click();
	WebElement viewbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//select[contains(@id,'fcf')]")));
	Select select=new Select(viewbtn);
    select.selectByVisibleText("Recently Viewed Contacts"); 
    WebElement gobtn = driver.findElement(By.xpath("//input[contains(@value,' Go! ')]"));
	gobtn.click();
	Thread.sleep(2000);
	WebElement contact = driver.findElement(By.xpath("//a[.//span[text()='Bond, John']]"));
	contact.click();
	Thread.sleep(2000);

}
@Test
public static void  Testcase30() throws Exception{
	
	Thread.sleep(2000);
	login_Salesforce();
	WebElement contactsbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Contacts Tab')]")));
	contactsbtn.click();
	WebElement createnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	createnewview.click();
	Thread.sleep(2000);
	WebElement uniqueviewName = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("devname")));
    uniqueviewName.sendKeys("EFGH");
    WebElement savebtn = driver.findElement(By.xpath("/html/body/div/div[2]/table/tbody/tr/td[2]/div[2]/form/div[1]/table/tbody/tr/td[2]/input[1]"));
	savebtn.click();
	Thread.sleep(2000);
}
@Test
public static void  Testcase31() throws Exception{
	
	Thread.sleep(2000);
	login_Salesforce();
	WebElement contactsbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Contacts Tab')]")));
	contactsbtn.click();
	WebElement createnewview = driver.findElement(By.xpath("//a[contains(text(),'Create New View')]"));
	createnewview.click();
	Thread.sleep(2000);
	WebElement viewName = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("fname")));
    viewName.sendKeys("ABCD");
	
    WebElement uniqueviewName = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("devname")));
    uniqueviewName.sendKeys("EFGH");
    WebElement cancelbtn = driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]"));
	cancelbtn.click();
	Thread.sleep(2000);
}
@Test
public static void  Testcase32() throws Exception{
	
	Thread.sleep(2000);
	login_Salesforce();
	WebElement contactsbtn = wait.until(
            ExpectedConditions.elementToBeClickable(
                    By.xpath("//a[contains(@title,'Contacts Tab')]")));
	contactsbtn.click();
	WebElement newbutton = driver.findElement(By.xpath("//input[contains(@value,'New')]"));
	newbutton.click();
	Thread.sleep(2000);
	WebElement lastname = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("name_lastcon2")));
    lastname.sendKeys("indian");
	
    WebElement accountName = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                    By.id("con4")));
    accountName.sendKeys("Global media");
    WebElement newandsavebtn = driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[2]"));
	newandsavebtn.click();
	Thread.sleep(2000);
}
}




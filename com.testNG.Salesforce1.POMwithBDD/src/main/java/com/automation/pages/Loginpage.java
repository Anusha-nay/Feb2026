package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.base.BasePage;

public class Loginpage extends BasePage {
	@FindBy(id="username") WebElement userNameEle;
	@FindBy(id="password") WebElement passwordEle ;
	@FindBy(id="Login") WebElement login_button ;
	@FindBy(id=("rememberUn")) WebElement remembercheckbox ;
	public Loginpage(WebDriver driver) {
		
		//PageFactory.initElements(driver, this);
		super(driver);
	}
	
	public void enterUserName(String data)
	{
		//userNameEle.sendKeys(data);
		enterText(userNameEle, data, "username field");
		
	}
	public void enterPassword(String data)
	{
		//passwordEle.sendKeys(data);
		enterText(passwordEle, data, "password field");
	}
	public void clickLoginButton()
	{
		//login_button.click();
		clickElement(login_button, "login button");
	}
	public void clickremembercheckbox()
	{
		//login_button.click();
		clickElement(remembercheckbox, "remembercheckbox");
	}
	
	
	
}

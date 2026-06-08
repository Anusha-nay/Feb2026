package com.automation.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.base.BasePage;

public class Homepage extends BasePage {
	@FindBy(id="userNavButton") WebElement profilebtn;
public Homepage(WebDriver driver) {
		
		//PageFactory.initElements(driver, this);
	super(driver);
	}
public void clickprofliebtn()
{
	//login_button.click();
	clickElement(profilebtn, "profile_btn");
}

}

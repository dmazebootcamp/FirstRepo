package com.pack.pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.pack.test1.BaseTest;

public class Searchuser extends BaseTest{
	

	WebDriver driver;
	

	@FindBy(xpath = "//input[@id='searchSystemUser_userName']")
	WebElement SearchUser;

	@FindBy(xpath = "//input[@id='searchBtn']")
	WebElement SearchButton;
	
	@FindBy(xpath = "//b[contains(text(),'Admin')]")
	WebElement AdminTab;
	

	public Searchuser(WebDriver dr)
	{
		driver=dr;
	}
	
	
	public void employeesearch () {
		//AdminTab.click();
		SearchUser.sendKeys("r.craig1");
		SearchButton.click();
		
	}

}

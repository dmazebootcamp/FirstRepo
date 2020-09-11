package com.pack.pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.pack.test1.BaseTest;

public class Loginpage extends BaseTest{
	
	
	WebDriver driver;
	
	@FindBy(id = "txtUsername")
	WebElement Username;

	@FindBy(id = "txtPassword")
	WebElement Password;

	@FindBy(id = "btnLogin")
	WebElement Login;


	public Loginpage(WebDriver dr)
	{
		driver=dr;
	}
	
	
	public void login(String user, String password) {
		
		Username.sendKeys(user);
		Password.sendKeys(password);
		Login.click();
		
		
		
	}
	

}

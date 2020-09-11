package com.pack.test1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pack.pages1.Loginpage;
import com.pack.pages1.Adduser;

public class AdduserTest extends BaseTest{
	
	//static WebDriver driver; // driver is a reference variable
	
	Adduser addemployee;
	Loginpage login;

	
	
	@Test
	public void addingemployee() throws InterruptedException {
		
		addemployee = PageFactory.initElements(driver, Adduser.class);
		addemployee.addingUser();
		
	}
	
}

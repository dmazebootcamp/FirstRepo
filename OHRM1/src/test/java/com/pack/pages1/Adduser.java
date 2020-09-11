package com.pack.pages1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.pack.test1.BaseTest;

public class Adduser extends BaseTest {
	
	
WebDriver driver;
	


@FindBy(xpath = "//b[contains(text(),'Admin')]")
WebElement AdminTab;

	@FindBy(xpath = "//input[@id='btnAdd']")
	WebElement Addbutton;

	@FindBy(xpath = "//input[@id='systemUser_employeeName_empName']")
	WebElement EmployeeName;

	@FindBy(id = "systemUser_userName")
	WebElement SystemUserName;

	@FindBy(id = "systemUser_password")
	WebElement systemPassword;

	@FindBy(id = "systemUser_confirmPassword")
	WebElement confirmpassword;

	@FindBy(id = "btnSave")
	WebElement SaveButton;
	
	@FindBy(xpath="//div[contains(text(),'Saved')]")
	WebElement Savemsg;
	

	public Adduser(WebDriver dr)
	{
		driver=dr;
	}
	
	
	
	public void addingUser () throws InterruptedException {
		
		//AdminTab.click();
		
		Addbutton.click();
		
		/*
		 * EmployeeName.sendKeys("Robert Craig");
		 * 
		 * SystemUserName.sendKeys("r.craig1");
		 * 
		 * systemPassword.sendKeys("Automate1234");
		 * 
		 * confirmpassword.sendKeys("Automate1234");
		 */
		
		EmployeeName.sendKeys(prop.getProperty("empname"));
		SystemUserName.sendKeys(prop.getProperty("SysUserName"));
		systemPassword.sendKeys(prop.getProperty("Syspass"));
		confirmpassword.sendKeys(prop.getProperty("Confirmpass"));
		
		
		
		
		SaveButton.click();
		
		Thread.sleep(2000);
	
		Assert.assertTrue(Savemsg.getText().contains("Saved"));
		
		
	}
	
	
	

}

package com.pack.pages1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage123 {

	WebDriver driver;

	@FindBy(id = "txtUsername")
	WebElement Username;

	@FindBy(id = "txtPassword")
	WebElement Password;

	@FindBy(id = "btnLogin")
	WebElement Login;

	@FindBy(xpath = "//b[contains(text(),'Admin')]")
	WebElement AdminTab;

	@FindBy(xpath = "//input[@id='searchSystemUser_userName']")
	WebElement SearchUser;

	@FindBy(xpath = "//input[@id='searchBtn']")
	WebElement SearchButton;

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

	public LoginPage123(WebDriver dr) {
		driver = dr;
	}

	public void setUserName() {
		// WebElement driver;
		Username.sendKeys("Admin");

	}

	public void setPassword() {

		Password.sendKeys("admin123");
	}

	public void login() {

		Login.click();
	}

	public void clickadmin() {

		AdminTab.click();

	}

	public void searchuser() {

		SearchUser.sendKeys("jasmine.morgan");
	}

	public void clicksearch() {

		SearchButton.click();

	}

	public void adduser() {

		Addbutton.click();

	}

	public void addingusername() {

		EmployeeName.sendKeys("John Smith");

	}

	public void addsystemUser() {

		SystemUserName.sendKeys("J.Smith");

	}

	public void password() {

		systemPassword.sendKeys("Automate1234");

	}

	public void confirmpassword()

	{

		confirmpassword.sendKeys("Automate1234");
	}

	public void saveuser() {

		SaveButton.click();
	}

}

package com.pack.pages1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	
	WebDriver driver;
	
	
	
	@FindBy(xpath = "//b[contains(text(),'Admin')]")
	WebElement AdminTab;
	
	public Homepage(WebDriver dr)
	{
		driver=dr;
	}

	
	
	public void clickAdmin() {
	
		
		AdminTab.click();

	}

}

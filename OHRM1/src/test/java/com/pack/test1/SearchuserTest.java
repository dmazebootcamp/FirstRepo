package com.pack.test1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import com.pack.pages1.BaseTest;
import com.pack.pages1.Loginpage;
import com.pack.pages1.Searchuser;

public class SearchuserTest  extends BaseTest{

//static WebDriver driver; // driver is a reference variable
	
	Searchuser employee;
	Loginpage login;

	
	@Test
	public void searchemployee() {
		
		employee = PageFactory.initElements(driver, Searchuser.class);
		employee.employeesearch();
		Assert.assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"));
	
		
		
	}
	
	
	
}

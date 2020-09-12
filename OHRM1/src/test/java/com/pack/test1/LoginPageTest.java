package com.pack.test1;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pack.pages1.Loginpage;

public class LoginPageTest extends BaseTest {

	//static WebDriver driver; // driver is a reference variable
	
	Loginpage lpage;
	
	//@BeforeMethod
	
	@Test(dataProvider="Data",dataProviderClass = DataProvidersExcel.class)
	public void logincheck(String user, String Password) {
		
		//setup();
		
		lpage = PageFactory.initElements(driver, Loginpage.class);
		lpage.login(user,Password);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		
		
		
		
		
		//Assert.assert
	}
	
	
	

	
	
	
}

package com.pack.test1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pack.pages1.LoginPage123;

public class LoginTest123 {

	static WebDriver driver; // driver is a reference variable
	static WebDriverWait wait;

	LoginPage123 lpage;

	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		driver = new ChromeDriver(); // OPen up the browser
		// driver=new FirefoxDriver();
		wait = new WebDriverWait(driver, 20);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testLogin() throws InterruptedException {
		// TODO Auto-generated method stub

		lpage = PageFactory.initElements(driver, LoginPage123.class);
		lpage.setUserName();
		lpage.setPassword();
		lpage.login();
		
		
		
		
		String link = driver.getCurrentUrl();
		System.out.println(link);
		
		
		//search user
		lpage.clickadmin();
		lpage.searchuser();
		lpage.clicksearch();
		
		//add user
		
		lpage.adduser();
		lpage.addingusername();
		lpage.addsystemUser();
		lpage.password();
		lpage.confirmpassword();
		lpage.saveuser();
		
		

		
		Thread.sleep(3000);
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"));

	}

	//@AfterMethod
	@AfterMethod
	public void tearDown() {
	//	driver.quit();
	}

}

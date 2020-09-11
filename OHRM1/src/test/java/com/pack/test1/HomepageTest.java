package com.pack.test1;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pack.pages1.Homepage;

public class HomepageTest extends BaseTest{

	//static WebDriver driver; // driver is a reference variable

	Homepage home;

	@Test
	public void hometest() {
		// TODO Auto-generated method stub

		home = PageFactory.initElements(driver, Homepage.class);
		home.clickAdmin();

	}

}

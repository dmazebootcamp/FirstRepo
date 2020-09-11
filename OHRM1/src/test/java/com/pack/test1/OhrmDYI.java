package com.pack.test1;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OhrmDYI {
	
	
	
	static WebDriver driver; // 
	static WebDriverWait wait;
	
	
	@Test
	public  void testHomePage() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
		driver=new ChromeDriver(); //OPen up the browser
		//driver=new FirefoxDriver();
		wait=new WebDriverWait(driver, 20);
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String link = driver.getCurrentUrl();
		System.out.println(link);

		//click user 
		driver.findElement(By.xpath("//b[contains(text(),'Admin')]")).click();
		driver.findElement(By.xpath("//input[@id='searchSystemUser_userName']")).sendKeys("jasmine.morgan");
		driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//adding user
		//driver.findElement(By.id("btnAdd"));
		driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
		
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='systemUser_employeeName_empName']")).sendKeys("Thomas Flemings");
		//driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Leo Kate");
		driver.findElement(By.id("systemUser_userName")).sendKeys("T.fleming1234");
		driver.findElement(By.id("systemUser_password")).sendKeys("Automate@1234");
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Automate@1234");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(3000);
		AssertJUnit.assertTrue(driver.getCurrentUrl().contains("viewSystemUsers"));
		

		
		Thread.sleep(3000);
		driver.quit();
		
		
}
	
}

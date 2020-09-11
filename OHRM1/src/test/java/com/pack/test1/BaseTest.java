package com.pack.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest {
	
	public static WebDriver driver;
	protected static Properties prop;
	public static ExtentReports extent= new ExtentReports(System.getProperty("user.dir")+ "/Reports/ExtentReportsTestNG.html", true);;
	public static ExtentTest test;
	
	@BeforeMethod
	public void setup() throws IOException {
		File file=new File(System.getProperty("user.dir")+"/src/test/java/com/pack/res/data.properties");
		FileInputStream fis=new FileInputStream(file);
		prop=new Properties();
		prop.load(fis);
		
		    // String browsername=prop.getProperty("browser");
		
		String browsername=System.getProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
		driver = new ChromeDriver(); // OPen up the browser
		}
		else
		{
			System.setProperty("webdriver.firefox.driver", System.getProperty("user.dir") + "/geckodriver");
			driver = new FirefoxDriver(); // OPen up the browser
				//COde for the firefox browser
			
		}
		
		//get data from properties
		
		// driver=new FirefoxDriver();
		driver.get(prop.getProperty("url")); // getting the orange hrm site
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
	
	

}

package com.test.acadally;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_class
{
	public static WebDriver driver;
	public String base_url= "https://uat.acadally.com/login/index.php";
		
		@BeforeClass
		public void setUp() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver-win64\\chromedriver.exe");		
			
			DesiredCapabilities caps= new DesiredCapabilities();
			caps.setAcceptInsecureCerts(true);
			
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			options.merge(caps);
	        options.addArguments("--remote-allow-origins=*");
	        options.setCapability("browserVersion", "125.0.6422.77");
	        options.setCapability("platformName", "Windows 10");

			driver= new ChromeDriver(options);			 		
		}

		@AfterClass
		public void tearDown()
		{
			driver.quit();
		}
		
}

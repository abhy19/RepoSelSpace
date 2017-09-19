package com.SelProject;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class LaunchBrowser {

	WebDriver driver;
	
	@Test
	public void init()
	{
		
		System.setProperty("webdriver.gecko.driver","/home/abhy/DevOps/TestWorkspace/geckodriver.exe");
	    DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	    capabilities.setCapability("marionette", false);
	    WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("https://www.planittesting.com/nz/Home");
		String title = driver.getTitle();
		System.out.println("Title is :: "+title);
	}
}

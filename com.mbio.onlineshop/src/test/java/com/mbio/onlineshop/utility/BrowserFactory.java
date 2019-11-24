package com.mbio.onlineshop.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserFactory {
	
	public static WebDriver startApplication(WebDriver driver, String browserName, String applicationURL) 
	{
		if(browserName.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();		
		}
		else {
			
		}
		
	    driver.manage().window().maximize();		
		driver.get(applicationURL);
		
		return driver;
	}
	
	public static WebDriverWait waitTime(WebDriver driver,int seconds) {
		return new WebDriverWait(driver,seconds);
	}
	
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}

}

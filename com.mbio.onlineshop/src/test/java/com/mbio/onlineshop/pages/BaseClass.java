package com.mbio.onlineshop.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mbio.onlineshop.utility.ApplicationDataProvider;
import com.mbio.onlineshop.utility.BrowserFactory;
import com.mbio.onlineshop.utility.ClickUtility;
import com.mbio.onlineshop.utility.ConfigDataProvider;
import com.mbio.onlineshop.utility.ScreenshotUtility;

public class BaseClass {
	
	public WebDriver driver;
	public WebDriverWait wait;
	public ConfigDataProvider config;
	public ApplicationDataProvider applConfig;
	public ExtentReports extent;
	public ExtentTest logger;
	
	@BeforeSuite
	public void setupSuite() {
		System.out.println("BaseClass setupSuite");
		config=new ConfigDataProvider();
		applConfig=new ApplicationDataProvider();
		
	    ExtentHtmlReporter reporter=new ExtentHtmlReporter(config.getReportPath());		
	    extent = new ExtentReports();	    
	    extent.attachReporter(reporter);	    
	    
	}
	
	@BeforeClass
	public void setup() {
		System.out.println("BaseClass setup");
		System.out.println("BaseClass:"+ config.getBrowser());
		System.out.println("BaseClasss:"+  config.getTestURL());
		System.out.println("BaseClass:"+ config.getWaitSeconds());	
		
		driver= BrowserFactory.startApplication(driver, config.getBrowser(), config.getTestURL());
		wait= BrowserFactory.waitTime(driver, config.getWaitSeconds());		
		
		
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) throws IOException
	{		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			String temp=ScreenshotUtility.getScreenshot(driver);
			
		}		
		extent.flush();
	
	}
	
	@AfterClass
	public void tearDown() {
		System.out.println("BaseClass teardown");
		copyReport();
		driver= BrowserFactory.startApplication(driver, config.getBrowser(), config.getReportResultPath());
		//BrowserFactory.quitBrowser(driver);
	}
	
	public void copyReport() {
		File src=new File("./Reports/MBOnlineShopTestReport.html");
		File destination=new File("C:/Reports/MBOnlineShopTestReport.html");
		
		try {
			FileUtils.copyFile(src, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

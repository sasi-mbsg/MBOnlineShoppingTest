package com.mbio.onlineshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbio.onlineshop.utility.ApplicationDataProvider;
import com.mbio.onlineshop.utility.ClickUtility;

public class HomePage {
	
	WebDriver driver;
	WebDriverWait wait;	
	ApplicationDataProvider applConfig;

	public HomePage(WebDriver lDriver, WebDriverWait lwait,ApplicationDataProvider lapplConfig) {
		this.driver=lDriver;
		this.wait=lwait;
		this.applConfig=lapplConfig;
	}
	
	public void selectCollection() {
		ClickUtility utility=new ClickUtility(driver);
		utility.waitForElementVisibilityByXpathAndClick(wait, applConfig.getDataFromConfig("HomePage.Agree"));
		utility.waitForElementVisibilityByLinktextAndClick(wait, applConfig.getDataFromConfig("HomePage.Collection"));
		utility.waitForElementVisibilityByLinktextAndClick(wait, applConfig.getDataFromConfig("HomePage.Item"));
		utility.waitForElementVisibilityByLinktextAndClick(wait, applConfig.getDataFromConfig("HomePage.Gender"));
		
	}

}

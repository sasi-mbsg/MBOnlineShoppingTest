package com.mbio.onlineshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbio.onlineshop.utility.ApplicationDataProvider;
import com.mbio.onlineshop.utility.ClickUtility;

public class ShoppingBasket {
	
	WebDriver driver;
	WebDriverWait wait;
	ApplicationDataProvider applConfig;
		
	public ShoppingBasket(WebDriver lDriver, WebDriverWait lwait,ApplicationDataProvider lapplConfig) {
		this.driver=lDriver;
		this.wait=lwait;
		this.applConfig=lapplConfig;
	}
	
	public void addToBasket() {
		ClickUtility utility=new ClickUtility(driver);
		utility.waitForElementVisibilityByXpathAndClick(wait, applConfig.getDataFromConfig("ShoppingBasket.SelectItem"));
		utility.waitForElementVisibilityByXpathAndClick(wait, applConfig.getDataFromConfig("ShoppingBasket.AddToBasket"));
		utility.waitForElementVisibilityByXpathAndClick(wait, applConfig.getDataFromConfig("ShoppingBasket.GotoShoppingBasket"));
		
	}

}

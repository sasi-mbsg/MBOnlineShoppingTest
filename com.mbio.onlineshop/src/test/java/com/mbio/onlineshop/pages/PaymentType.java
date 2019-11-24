package com.mbio.onlineshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbio.onlineshop.utility.ApplicationDataProvider;
import com.mbio.onlineshop.utility.ClickUtility;

public class PaymentType {
	
	WebDriver driver;
	WebDriverWait wait;
	ApplicationDataProvider applConfig;
		
	public PaymentType(WebDriver lDriver, WebDriverWait lwait,ApplicationDataProvider lapplConfig) {
		this.driver=lDriver;
		this.wait=lwait;
		this.applConfig=lapplConfig;
	}
	
	public void choosePayment() {
		ClickUtility utility=new ClickUtility(driver);
		utility.waitForRadioByXpathAndClick(wait, applConfig.getDataFromConfig("PaymentType.ChoosePayment"));		
		utility.waitForElementClickableByXpathAndClick(wait, applConfig.getDataFromConfig("PaymentType.ContinueToVerification"));
		
	}

}

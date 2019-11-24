package com.mbio.onlineshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mbio.onlineshop.utility.ApplicationDataProvider;
import com.mbio.onlineshop.utility.ClickUtility;

public class AddressAndDelivery {
	
	WebDriver driver;
	WebDriverWait wait;
	ApplicationDataProvider applConfig;
		
	public AddressAndDelivery(WebDriver lDriver, WebDriverWait lwait,ApplicationDataProvider lapplConfig) {
		this.driver=lDriver;
		this.wait=lwait;
		this.applConfig=lapplConfig;
	}
	
	public void fillDetails() {
		ClickUtility utility=new ClickUtility(driver);
		utility.waitForElementVisibilityByXpathAndClick(wait, applConfig.getDataFromConfig("AddressAndDelivery.ContinueToAddress"));
		
		//Shop as guest user
		utility.waitForElementVisibilityByXpathAndType(wait, applConfig.getDataFromConfig("AddressAndDelivery.UserEmail"),applConfig.getDataFromConfig("AddressAndDelivery.UserEmailValue"));
		utility.waitForElementVisibilityByXpathAndClick(wait, applConfig.getDataFromConfig("AddressAndDelivery.PlaceOrderAsGuest"));
		
		//Enter customer details
		utility.waitForRadioByXpathAndClick(wait, applConfig.getDataFromConfig("AddressAndDelivery.SelectGender"));		
		utility.waitForElementVisibilityByXpathAndType(wait, applConfig.getDataFromConfig("AddressAndDelivery.FirstName"), applConfig.getDataFromConfig("AddressAndDelivery.FirstNameValue"));
		utility.waitForElementVisibilityByXpathAndType(wait, applConfig.getDataFromConfig("AddressAndDelivery.LastName"), applConfig.getDataFromConfig("AddressAndDelivery.LastNameValue"));
		utility.waitForElementVisibilityByXpathAndType(wait, applConfig.getDataFromConfig("AddressAndDelivery.Number"), applConfig.getDataFromConfig("AddressAndDelivery.NumberValue"));
		utility.waitForElementVisibilityByXpathAndType(wait, applConfig.getDataFromConfig("AddressAndDelivery.Street"), applConfig.getDataFromConfig("AddressAndDelivery.StreetValue"));
		utility.waitForElementVisibilityByXpathAndType(wait, applConfig.getDataFromConfig("AddressAndDelivery.Country"), applConfig.getDataFromConfig("AddressAndDelivery.CountryValue"));
		utility.waitForElementVisibilityByXpathAndType(wait, applConfig.getDataFromConfig("AddressAndDelivery.PinCode"), applConfig.getDataFromConfig("AddressAndDelivery.PinCodeValue"));
		
		utility.waitForElementClickableByXpathAndClick(wait, applConfig.getDataFromConfig("AddressAndDelivery.ContinueToPaymentType"));
		
	}

}

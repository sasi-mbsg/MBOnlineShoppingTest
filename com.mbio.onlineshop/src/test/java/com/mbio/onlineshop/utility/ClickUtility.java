package com.mbio.onlineshop.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickUtility {
	
	WebDriver driver;
	WebElement element;
	
	public ClickUtility(WebDriver lDriver) {
		this.driver=lDriver;
	}
	
	
	public void waitForElementVisibilityByXpathAndClick(WebDriverWait wait, String xPathValue) {
		
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathValue)));
		element.click();	
		
	}
	
	public void waitForElementClickableByXpathAndClick(WebDriverWait wait, String xPathValue) {
		
		element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xPathValue)));
		element.click();	
		
	}
	
	public void waitForElementVisibilityByXpathAndType(WebDriverWait wait, String xPathValue, String typeValue) {
		
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathValue)));
		element.sendKeys(typeValue);	
		
	}
	
	public void waitForRadioByXpathAndClick(WebDriverWait wait, String xPathValue) {
		
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPathValue)));
	
		boolean status=element.isDisplayed();
		 
        System.out.println("radio button is Displayed >>"+status);

        boolean enabled_status=element.isEnabled();

        System.out.println("radio button is Enabled >>"+enabled_status);

        boolean selected_status=element.isSelected();

        System.out.println("radio button is Selected >>"+selected_status);

        element.click();

        boolean selected_status_new=element.isSelected();

        System.out.println("radio button is Selected >>"+selected_status_new);
		
	}

	public void waitForElementVisibilityByLinktextAndClick(WebDriverWait wait, String text) {
		
		element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(text)));
		element.click();

	}
	

}

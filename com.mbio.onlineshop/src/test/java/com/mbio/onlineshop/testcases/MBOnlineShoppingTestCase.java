package com.mbio.onlineshop.testcases;

	import java.util.Iterator;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.Alert;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.Test;

import com.mbio.onlineshop.pages.AddressAndDelivery;
import com.mbio.onlineshop.pages.BaseClass;
import com.mbio.onlineshop.pages.HomePage;
import com.mbio.onlineshop.pages.PaymentType;
import com.mbio.onlineshop.pages.ShoppingBasket;
import com.mbio.onlineshop.utility.BrowserFactory;

	public class MBOnlineShoppingTestCase extends BaseClass{
	
		@Test(priority=1)
		public void selectProduct() {
			logger=extent.createTest("VerifyProductSelection");
			logger.info("Select the product");
			HomePage home=new HomePage(driver,wait,applConfig);
			home.selectCollection();
			logger.pass("Product selected successfully");
		
		}
		
		
		@Test(priority=2)
		public void doShopping() throws Exception
		{
			logger=extent.createTest("VerifyDoShopping");
			logger.info("Do shopping & add to basket");
			ShoppingBasket shopping=new ShoppingBasket(driver,wait,applConfig);
			shopping.addToBasket();	
			logger.pass("Products added to basket successfully");
		}
		
		
		@Test(priority=3)
		public void enterCustomerAddress() throws Exception
		{
			logger=extent.createTest("VerifyEnterCustomerAddress");
			logger.info("Enter the customer address for delivery");
			AddressAndDelivery address=new AddressAndDelivery(driver,wait,applConfig);
			address.fillDetails();
			logger.pass("Address & Delivery Details is entered successfully");
		}
		
		@Test(priority=4)
		public void paymentOption() throws Exception
		{
			logger=extent.createTest("VerifyChoosePaymentOption");
			logger.info("Choose the payment option");
			PaymentType payType=new PaymentType(driver,wait,applConfig);
			payType.choosePayment();
			logger.pass("Payment Option is selected successfully");
		}	
		
		
}

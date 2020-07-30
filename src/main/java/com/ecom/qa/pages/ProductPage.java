package com.ecom.qa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class ProductPage extends TestBase {
	
	@FindBy(xpath="//*[@class='s-image' and @alt='Samsung Galaxy S10 (Prism Blue, 8GB RAM, 128GB Storage)']")
	WebElement Imglink;
	
	@FindBy(id="buy-now-button")
	WebElement Buybtn;
	
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	public PaymentPage ClickOnproduct() { 
		Imglink.click();
		Buybtn.click();
		
		
		return new PaymentPage();
	}
	


}

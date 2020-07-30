package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class PaymentPage extends TestBase{
	
	@FindBy(xpath="//input[@id='radiobtn']")
	WebElement netbankingbtn;
	
	@FindBy(xpath="//input[@id='Axis']")
	WebElement Bankbtn;
	
	@FindBy(xpath="//input[@id='userid']")
	WebElement bankID;
	
	@FindBy(xpath="//input[@id='paswd']")
	WebElement Passwd;
	
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}
	public void Paymentprocess() { 
		netbankingbtn.click();
		Bankbtn.click();
		bankID.sendKeys("*********************");
		Passwd.sendKeys("*************************");
	}
}
		
		
		
		


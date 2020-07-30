package com.ecom.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.HomePage;
import com.ecom.qa.pages.LoginPage1;
import com.ecom.qa.pages.PaymentPage;
import com.ecom.qa.pages.ProductPage;


public class PaymentPageTest extends TestBase {
	LoginPage1 login;
	HomePage home;
	ProductPage product;
	PaymentPage payment;
	
	public PaymentPageTest(){
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		login=new LoginPage1();
	    home=login.Login(prop.getProperty("username"), prop.getProperty("password"));
		product=home.search();
		payment=product.ClickOnproduct();
		

	}
	@Test()
	public void CompletePayment() {
		payment.Paymentprocess();
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}


}

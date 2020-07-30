package com.ecom.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.HomePage;
import com.ecom.qa.pages.LoginPage1;
import com.ecom.qa.pages.ProductPage;

public class HomePageTest extends TestBase {
	LoginPage1 login;
	HomePage home;
	ProductPage product;

	public HomePageTest(){
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		login=new LoginPage1();
		//login.clickonLink();
		home=login.Login(prop.getProperty("username"), prop.getProperty("password"));

	}
	@Test()
	public void searchproductTest() {
		product=home.search();
		
	}
	@AfterMethod
	public void teardown() {
		driver.close();
	}
}

package com.ecom.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ecom.qa.base.TestBase;
import com.ecom.qa.pages.HomePage;
import com.ecom.qa.pages.LoginPage1;

public class LoginPageTest extends TestBase {

	LoginPage1 login;
	HomePage home;

	public LoginPageTest(){
		super();
	}

	@BeforeMethod
	public void setup() {
		initialization();
		login=new LoginPage1();

	}

	@Test(priority=2)
	public void HomepageTitletest() {
		String title=login.validatePageTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	}


	@Test(priority=1)
	public void loginTest(){
		//login.clickonLink();
		home = login.Login(prop.getProperty("username"), prop.getProperty("password"));

	}

	@AfterMethod
	public void teardown() {
		driver.close();
	}
}

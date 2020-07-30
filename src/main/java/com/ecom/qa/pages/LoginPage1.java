package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class LoginPage1 extends TestBase  {

	@FindBy(id="nav-link-accountList")
	WebElement link;

	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement signinLink;

	@FindBy(xpath="//*[@id='ap_email']")
	WebElement username;

	@FindBy(xpath="//*[@id='continue']")
	WebElement continuebtn;

	@FindBy(xpath="//*[@id='ap_password']")
	WebElement password;

	@FindBy(id="signInSubmit")
	WebElement signin;

	public LoginPage1() {
		PageFactory.initElements(driver, this);
	}
	public String validatePageTitle() {
		return driver.getTitle();
	}

	
	public HomePage Login(String uname,String pwd) {
		Actions action=new Actions(driver);
		action.moveToElement(link).build().perform();
		signinLink.click();
		username.sendKeys(uname);
		continuebtn.click();
		password.sendKeys(pwd);
		signin.click();

		return new HomePage();


	}
}

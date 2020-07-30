package com.ecom.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ecom.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;

	@FindBy(xpath = "//input[@value='Go']")
	WebElement Searchbtn;

	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public ProductPage search() {
		searchbox.sendKeys("Samsung Galaxy S10 (Prism Blue, 8GB RAM, 128GB Storage)");
		Searchbtn.click();
		return new ProductPage();
	}

}

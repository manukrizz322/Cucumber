package com.AutomationPractice_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adress_Page {
	public  WebDriver driver;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	WebElement checkout_btn;

	public Adress_Page(WebDriver driver2) {
		  this.driver=driver2;
			
			PageFactory.initElements(driver, this);
	}

	public WebElement getCheckout_btn() {
		return checkout_btn;
	}

}

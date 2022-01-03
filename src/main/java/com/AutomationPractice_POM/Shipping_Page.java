package com.AutomationPractice_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {
	public  WebDriver driver;
	
	@FindBy(xpath="//input[@type='checkbox']")
	WebElement Checkbox;
	
	@FindBy(xpath="(//span[text()[normalize-space()='Proceed to checkout']])[2]")
	WebElement checkout_btn;

	public Shipping_Page(WebDriver driver2) {
		 this.driver=driver2;
			
			PageFactory.initElements(driver, this);
	}

	public WebElement getCheckbox() {
		return Checkbox;
	}

	public WebElement getCheckout_btn() {
		return checkout_btn;
	}
	
	

}

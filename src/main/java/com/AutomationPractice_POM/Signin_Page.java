package com.AutomationPractice_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_Page {
	
	public WebDriver driver;
	@FindBy(xpath="(//input[@name='email'])[1]")
	WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement passwrd;
	
	@FindBy(xpath="//span[text()[normalize-space()='Sign in']]")
	WebElement signin_btn;

	public Signin_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getSignin_btn() {
		return signin_btn;
	}
	
	

}

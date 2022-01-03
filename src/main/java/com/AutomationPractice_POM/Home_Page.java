package com.AutomationPractice_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	public WebDriver  driver;
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	WebElement signin_btn;

	

	public WebElement getSignin_btn() {
		return signin_btn;
	}
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dresses_btn;
  
	
	@FindBy(xpath="//a[text()='Women']")
	private WebElement women_btn;
	
	public WebElement getWomen_btn() {
		return women_btn;
	}
	public WebElement getT_shirts_btn() {
		return T_shirts_btn;
	}

	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement T_shirts_btn;
	
	
	public WebElement getDresses_btn() {
		return dresses_btn;
	}
	
	
	
	@FindBy(xpath="//a[text()='Tops']")
	   private WebElement women_tops;
	   
	   public WebElement getWomen_tops() {
		return women_tops;
	}
	public WebElement getWomen_dresses() {
		return women_dresses;
	}
	public WebElement getDresses_casual() {
		return dresses_casual;
	}
	public WebElement getDresses_evening() {
		return dresses_evening;
	}
	public WebElement getDresses_summer() {
		return dresses_summer;
	}

	@FindBy(xpath="(//a[@class='sf-with-ul'])[3]")
	   private WebElement women_dresses;
	   
	   @FindBy(xpath="(//a[text()='Casual Dresses'])[2]")
	   private WebElement dresses_casual;
	   
	   @FindBy(xpath="(//a[text()='Evening Dresses'])[2]")
	   private WebElement dresses_evening;
	   @FindBy(xpath="(//a[text()='Summer Dresses'])[2]")
	   private WebElement dresses_summer;
	public Home_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}
}

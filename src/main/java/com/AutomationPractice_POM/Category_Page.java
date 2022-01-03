package com.AutomationPractice_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Category_Page {
	public  WebDriver driver;
	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	WebElement dressescart_btn;
	
	@FindBy(xpath="(//span[text()='Add to cart'])[2]")
	WebElement Womencart_btn;
	
	public WebElement getWomencart_btn() {
		return Womencart_btn;
	}

	public WebElement getTshirtscart_btn() {
		return tshirtscart_btn;
	}

	@FindBy(xpath="(//span[text()='Add to cart'])[1]")
	WebElement tshirtscart_btn;
	
	
	@FindBy(xpath="//span[text()[normalize-space()='Proceed to checkout']]")
    WebElement checkout_btn;

	public Category_Page(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getdressescart_btn() {
		return dressescart_btn;
	}

	public WebElement getCheckout_btn() {
		return checkout_btn;
	}
	
	@FindBy(xpath="//span[text()='Add to cart']")
    private WebElement tops_cartbtn;

	public WebElement getTops_cartbtn() {
		return tops_cartbtn;
	}
	
	
	@FindBy(xpath="//span[text()='Add to cart']")
    private WebElement dresses_cartbtn;

	public WebElement getdresses_cartbtn() {
		return dresses_cartbtn;
	}
	@FindBy(xpath="//span[text()='Add to cart']")
    private WebElement casualdresses_cartbtn;

	public WebElement getCasualdresses_cartbtn() {
		return casualdresses_cartbtn;
	}
	@FindBy(xpath="//span[text()='Add to cart']")
    private WebElement eveningdresses_cartbtn;

	public WebElement getEveningdresses_cartbtn() {
		return eveningdresses_cartbtn;
	}
	@FindBy(xpath="//span[text()='Add to cart']")
    private WebElement  summerdresses_cartbtn;

	public WebElement getSummerdresses_cartbtn() {
		return summerdresses_cartbtn;
	}
	@FindBy(xpath="(//img[@itemprop='image'])[1]")
	private WebElement women_tops_productimg;
	
	public WebElement getWomen_tops_productimg() {
		return women_tops_productimg;
	}

	public WebElement getWomen_dresses_productimg() {
		return women_dresses_productimg;
	}

	public WebElement getDresses_Casualdresses_productimg() {
		return dresses_Casualdresses_productimg;
	}

	public WebElement getDresses_Eveningdresses_productimg() {
		return dresses_Eveningdresses_productimg;
	}

	public WebElement getDresses_Summerdresses_productimg() {
		return dresses_Summerdresses_productimg;
	}

	public WebElement getTshirt_productimg() {
		return tshirt_productimg;
	}

	@FindBy(xpath="(//img[@itemprop='image'])[2]")
	private WebElement women_dresses_productimg;
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement dresses_Casualdresses_productimg;
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement dresses_Eveningdresses_productimg;
	
	@FindBy(xpath="(//img[@itemprop='image'])[3]")
	private WebElement dresses_Summerdresses_productimg;
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement tshirt_productimg;
	
	
	
	
	
	
	
}

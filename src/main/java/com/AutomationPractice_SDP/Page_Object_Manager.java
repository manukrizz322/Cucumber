package com.AutomationPractice_SDP;

import org.openqa.selenium.WebDriver;

import com.AutomationPractice_POM.Adress_Page;
import com.AutomationPractice_POM.Bank_wire_Payment_Page;
import com.AutomationPractice_POM.CartSummary_Page;
import com.AutomationPractice_POM.Category_Page;
import com.AutomationPractice_POM.Home_Page;
import com.AutomationPractice_POM.Payment_Page;
import com.AutomationPractice_POM.Shipping_Page;
import com.AutomationPractice_POM.Signin_Page;

public class Page_Object_Manager {
	
	public WebDriver driver;
	private   Home_Page hp ;
	private  Signin_Page si ;
	private  Category_Page cp ;
	private  CartSummary_Page cs;
	private  Adress_Page ad ;
	private  Shipping_Page sh;
	private  Payment_Page pay;
	private  Bank_wire_Payment_Page bw;
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
	}
	public Payment_Page getIntancePaymentPage() {
		if (pay==null) {
			pay=new Payment_Page(driver);
		}
return pay;
	}
	public Bank_wire_Payment_Page getInstanceBankWirePaymentPage() {
		if (bw==null) {
			bw=new Bank_wire_Payment_Page(driver);
		}
return bw;
	}
	
	public Home_Page getInstanceHome_Page() {
		if (hp==null) {
		hp=	 new Home_Page(driver);
			
		}
          return hp;
	}
	public Signin_Page getInstanceSignin_Page() {
		if (si==null) {
			si= new Signin_Page(driver);
		}
return si;
	}
	public Category_Page getInstanceCategory_Page() {
		if (cp==null) {
			cp=new Category_Page(driver);
			
		}
		return cp;

	}
	public CartSummary_Page getInstanecartSummary_Page() {
	if (cs==null) {
		cs=new CartSummary_Page(driver);
		
	}
	return cs;

	}
	public Adress_Page getInstanceAdress_Page() {
		if (ad==null) {
			ad=new Adress_Page(driver);
			
		}
		return ad;

	}
	public Shipping_Page getInstanceShipping_Page() {
		if (sh==null) {
			sh=new Shipping_Page(driver);
			
		}
		return sh;

	}
}

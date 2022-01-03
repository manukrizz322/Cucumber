package com.Automation_Practice.Step_definition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.AutomationPractice_SDP.Page_Object_Manager;
import com.Automation_Practice.Runner.Test_Runner;
import com.Base_Class.Base_Class;
import com.helper.automation.practice.File_Read_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class Step_Definition extends Base_Class {
	public static WebDriver driver=Test_Runner.driver;
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("user Launch The Application")
	public  void user_launch_the_application() throws IOException {

		url(File_Read_Manager.getInstanceFRM().getInstanceCR().geturl());
		clickOnElement(pom.getInstanceHome_Page().getSignin_btn());

	}
	@When("^user Enter The Username In \"([^\"]*)\" Username Field$")
	public void user_Enter_The_Username_In_Username_Field(String username) throws Throwable {
		
		scroll(File_Read_Manager.getInstanceFRM().getInstanceCR().getscrollinto(), null,
				pom.getInstanceSignin_Page().getEmail());

		implictlyWait(10, TimeUnit.SECONDS);

		inputValueOnElement(pom.getInstanceSignin_Page().getEmail(),
				username);
	}

	@When("^user Enter The Password In \"([^\"]*)\" Password Field$")
	public void user_Enter_The_Password_In_Password_Field(String password) throws Throwable {
		inputValueOnElement(pom.getInstanceSignin_Page().getPasswrd(),password);
	
	}
	
	@Then("user Click On The Signin Button And It Navigates To The My Account page")
	public void user_click_on_the_signin_button_and_it_navigates_to_the_my_account_page() {

		clickOnElement(pom.getInstanceSignin_Page().getSignin_btn());
	}

	@When("user Mouse Hover to the Women Option")
	public void user_mouse_hover_to_the_women_option() throws IOException {
		actions(File_Read_Manager.getInstanceFRM().getInstanceCR().getmovetoelement(), pom.getInstanceHome_Page().getWomen_btn());
	}

	@When("user Click On The Tops Category in Women Option")
	public void user_click_on_the_tops_category_in_women_option() throws IOException {
		actions(File_Read_Manager.getInstanceFRM().getInstanceCR().getclick(), pom.getInstanceHome_Page().getWomen_tops());
	}

	@When("user Click On The Product Image")
	public void user_click_on_the_product_image() throws IOException {
		scroll(File_Read_Manager.getInstanceFRM().getInstanceCR().getscrollinto(), null, pom.getInstanceCategory_Page().getWomen_tops_productimg());
		clickOnElement(pom.getInstanceCategory_Page().getWomen_tops_productimg());
	}

	@When("user Click On The Add To Cart Button")
	public void user_click_on_the_add_to_cart_button() {
		framesIndex(0);
		clickOnElement(pom.getInstanceCategory_Page().getTops_cartbtn());
		framesDefaultContent();	
		}

	@When("user Click On The Proceed To Checkout Button In Product Page")
	public void user_click_on_the_proceed_to_checkout_button_in_product_page() {
		clickOnElement(pom.getInstanceCategory_Page().getCheckout_btn());
	}

	@When("user Click On The Proceed To Checkout Button In Shopping Cart Summary Page")
	public void user_click_on_the_proceed_to_checkout_button_in_shopping_cart_summary_page() {
		clickOnElement(pom.getInstanecartSummary_Page().getCheckout_btn());
	
	}

	@When("user Click On The Proceed To Checkout Button In Addresses Page")
	public void user_click_on_the_proceed_to_checkout_button_in_addresses_page() {
		clickOnElement(pom.getInstanceAdress_Page().getCheckout_btn());
	
	}

	@When("user Click On The Terms Of Service CheckBox In Shipping Page")
	public void user_click_on_the_terms_of_service_check_box_in_shipping_page() throws IOException {
		scroll(File_Read_Manager.getInstanceFRM().getInstanceCR().getscrollinto(), null,
				pom.getInstanceShipping_Page().getCheckbox());
		clickOnElement(pom.getInstanceShipping_Page().getCheckbox());
	
	}

	@When("user Click On The Proceed To Checkout Button In Shipping page")
	public void user_click_on_the_proceed_to_checkout_button_in_shipping_page() {
		clickOnElement(pom.getInstanceShipping_Page().getCheckout_btn());
	
	}
	
	

	@When("user Click On The Pay By Bank Wire Option In Payment Page")
	public void user_click_on_the_pay_by_bank_wire_option_in_payment_page() {
		clickOnElement(pom.getIntancePaymentPage().getBankwire());
	
	}

	@Then("user Click On The I Confirm My Order In Order Summary Page")
	public void user_click_on_the_i_confirm_my_order_in_order_summary_page() {
		clickOnElement(pom.getInstanceBankWirePaymentPage().getConfirm_my_order());
	
	}

	@Then("user Click On The Signout Button And It Navigates To The Home Page")
	public void user_click_on_the_signout_button_and_it_navigates_to_the_home_page() {
		clickOnElement(pom.getInstanceBankWirePaymentPage().getLog_Out());

	
	}

}

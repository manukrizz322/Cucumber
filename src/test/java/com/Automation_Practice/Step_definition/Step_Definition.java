package com.Automation_Practice.Step_definition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.AutomationPractice_SDP.Page_Object_Manager;
import com.Automation_Practice.Runner.Test_Runner;
import com.Base_Class.Base_Class;
import com.helper.automation.practice.File_Read_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver = Test_Runner.driver;

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		logMsg("Scenario Name : " + name);
		logMsg("scenario started");

	}

	@After
	public void afterHooks(Scenario s) throws IOException {
		if (s.isFailed()) {
			takeSnap("./screen/failscenario.png");

		}
		String status = s.getStatus();

		logMsg("status : " + status);

	}

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		url(File_Read_Manager.getInstanceFRM().getInstanceCR().geturl());
		clickOnElement(pom.getInstanceHome_Page().getSignin_btn());
	}

	@When("^user Enter The Username In \"([^\"]*)\" Username Field$")
	public void user_Enter_The_Username_In_Username_Field(String username) throws Throwable {
		scroll("scrollinto", null, pom.getInstanceSignin_Page().getEmail());
		inputValueOnElement(pom.getInstanceSignin_Page().getEmail(), username);

	}

	@When("^user Enter The Password In \"([^\"]*)\" Password Field$")
	public void user_Enter_The_Password_In_Password_Field(String password) throws Throwable {
		inputValueOnElement(pom.getInstanceSignin_Page().getPasswrd(), password);

	}

	@Then("^user Click On The Signin Button And It Navigates To The My Account page$")
	public void user_Click_On_The_Signin_Button_And_It_Navigates_To_The_My_Account_page() throws Throwable {
		clickOnElement(pom.getInstanceSignin_Page().getSignin_btn());

	}

	@When("^user Move to the Women Option For Click the Tops Category$")
	public void user_Move_to_the_Women_Option_For_Click_the_Tops_Category() throws Throwable {
		actions("movetoelement", pom.getInstanceHome_Page().getWomen_btn());

	}

	@When("^user Click On The Tops Category In Women Option$")
	public void user_Click_On_The_Tops_Category_In_Women_Option() throws Throwable {
		actions("click", pom.getInstanceHome_Page().getWomen_tops());

	}

	@When("^user Click On The Product Image In Tops Category$")
	public void user_Click_On_The_Product_Image_In_Tops_Category() throws Throwable {
		scroll("scrollinto", null, pom.getInstanceCategory_Page().getWomen_tops_productimg());
		clickOnElement(pom.getInstanceCategory_Page().getWomen_tops_productimg());

	}

	@When("^user Click On The Add To Cart Button In Tops Category$")
	public void user_Click_On_The_Add_To_Cart_Button_In_Tops_Category() throws Throwable {
		framesIndex(0);
		clickOnElement(pom.getInstanceCategory_Page().getTops_cartbtn());

	}

	@When("^user Click On The Proceed To Checkout Button In Product Page of that Tops Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Tops_Category() throws Throwable {
		implictlyWait(20, TimeUnit.SECONDS);
		framesDefaultContent();
		implictlyWait(20, TimeUnit.SECONDS);
		clickOnElement(pom.getInstanceCategory_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Tops Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Tops_Category()
			throws Throwable {

		clickOnElement(pom.getInstanecartSummary_Page().getCheckout_btn());
	}

	@When("^user Click On The Proceed To Checkout Button In Addresses Page of that Tops Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Tops_Category()
			throws Throwable {

		clickOnElement(pom.getInstanceAdress_Page().getCheckout_btn());

	}

	@When("^user Click On The Terms Of Service CheckBox In Shipping Page of that Tops Category$")
	public void user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Tops_Category() throws Throwable {
		scroll("scrollinto", null, pom.getInstanceShipping_Page().getCheckbox());
		clickOnElement(pom.getInstanceShipping_Page().getCheckbox());

	}

	@When("^user Click On The Proceed To Checkout Button In Shipping page of that Tops Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Tops_Category() throws Throwable {

		clickOnElement(pom.getInstanceShipping_Page().getCheckout_btn());
	}

	@When("^user Click On The Pay By Bank Wire Option In Payment Page of that Tops Category$")
	public void user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Tops_Category() throws Throwable {
		scroll("scrollinto", null, pom.getIntancePaymentPage().getBankwire());
		clickOnElement(pom.getIntancePaymentPage().getBankwire());

	}

	@Then("^user Click On The I Confirm My Order In Order Summary Page of that Tops Category$")
	public void user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Tops_Category() throws Throwable {
		scroll("scrollinto", null, pom.getInstanceBankWirePaymentPage().getConfirm_my_order());
		clickOnElement(pom.getInstanceBankWirePaymentPage().getConfirm_my_order());

	}

	@When("^user Move	To The Women Option For Click The Dresses Category$")
	public void user_Move_To_The_Women_Option_For_Click_The_Dresses_Category() throws Throwable {
		actions("movetoelement", pom.getInstanceHome_Page().getWomen_btn());

	}

	@When("^user Click On The Dresses Category In Women Option$")
	public void user_Click_On_The_Dresses_Category_In_Women_Option() throws Throwable {
		actions("click", pom.getInstanceHome_Page().getWomen_dresses());

	}

	@When("^user Click On The Product Image In Dresses Category$")
	public void user_Click_On_The_Product_Image_In_Dresses_Category() throws Throwable {
		scroll("scrollinto", null, pom.getInstanceCategory_Page().getWomen_dresses_productimg());
		clickOnElement(pom.getInstanceCategory_Page().getWomen_dresses_productimg());

	}

	@When("^user Click On The Add To Cart Button In Dresses Category$")
	public void user_Click_On_The_Add_To_Cart_Button_In_Dresses_Category() throws Throwable {

		framesIndex(0);
		clickOnElement(pom.getInstanceCategory_Page().getdresses_cartbtn());
		framesDefaultContent();
	}

	@When("^user Click On The Proceed To Checkout Button In Product Page of that Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Dresses_Category()
			throws Throwable {
		scroll("scrollinto", null, pom.getInstanceCategory_Page().getCheckout_btn());
		clickOnElement(pom.getInstanceCategory_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Dresses_Category()
			throws Throwable {
		scroll("scrollinto", null, pom.getInstanecartSummary_Page().getCheckout_btn());
		clickOnElement(pom.getInstanecartSummary_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Addresses Page of that Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Dresses_Category()
			throws Throwable {

		scroll("scrollinto", null, pom.getInstanceAdress_Page().getCheckout_btn());
		clickOnElement(pom.getInstanceAdress_Page().getCheckout_btn());

	}

	@When("^user Click On The Terms Of Service CheckBox In Shipping Page of that Dresses Category$")
	public void user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Dresses_Category()
			throws Throwable {

		scroll("scrollinto", null, pom.getInstanceShipping_Page().getCheckbox());
		clickOnElement(pom.getInstanceShipping_Page().getCheckbox());

	}

	@When("^user Click On The Proceed To Checkout Button In Shipping page of that Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Dresses_Category()
			throws Throwable {

		clickOnElement(pom.getInstanceShipping_Page().getCheckout_btn());

	}

	@When("^user Click On The Pay By Bank Wire Option In Payment Page of that Dresses Category$")
	public void user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Dresses_Category() throws Throwable {

		scroll("scrollinto", null, pom.getIntancePaymentPage().getBankwire());
		clickOnElement(pom.getIntancePaymentPage().getBankwire());
	}

	@Then("^user Click On The I Confirm My Order In Order Summary Page of that Dresses Category$")
	public void user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Dresses_Category() throws Throwable {
		scroll("scrollinto", null, pom.getInstanceBankWirePaymentPage().getConfirm_my_order());
		clickOnElement(pom.getInstanceBankWirePaymentPage().getConfirm_my_order());

	}

	@When("^user Move	To The Dresses Option For Click The Casual Dresses Category$")
	public void user_Move_To_The_Dresses_Option_For_Click_The_Casual_Dresses_Category() throws Throwable {
		actions("movetoelement", pom.getInstanceHome_Page().getDresses_btn());

	}

	@When("^user Click On The Casual Dresses Category In Dresses Option$")
	public void user_Click_On_The_Casual_Dresses_Category_In_Dresses_Option() throws Throwable {

		actions("click", pom.getInstanceHome_Page().getDresses_casual());
	}

	@When("^user Click On The Product Image In Casual Dresses Category$")
	public void user_Click_On_The_Product_Image_In_Casual_Dresses_Category() throws Throwable {
		scroll("scrollinto", null, pom.getInstanceCategory_Page().getDresses_Casualdresses_productimg());
		clickOnElement(pom.getInstanceCategory_Page().getDresses_Casualdresses_productimg());

	}

	@When("^user Click On The Add To Cart Button In Casual Dresses Category$")
	public void user_Click_On_The_Add_To_Cart_Button_In_Casual_Dresses_Category() throws Throwable {
		framesIndex(0);
		clickOnElement(pom.getInstanceCategory_Page().getCasualdresses_cartbtn());

	}

	@When("^user Click On The Proceed To Checkout Button In Product Page of that Casual Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Casual_Dresses_Category()
			throws Throwable {
		implictlyWait(20, TimeUnit.SECONDS);
		framesDefaultContent();
		implictlyWait(20, TimeUnit.SECONDS);
		clickOnElement(pom.getInstanceCategory_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Casual Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Casual_Dresses_Category()
			throws Throwable {

		clickOnElement(pom.getInstanecartSummary_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Addresses Page of that Casual Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Casual_Dresses_Category()
			throws Throwable {

		clickOnElement(pom.getInstanceAdress_Page().getCheckout_btn());
	}

	@When("^user Click On The Terms Of Service CheckBox In Shipping Page of that Casual Dresses Category$")
	public void user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Casual_Dresses_Category()
			throws Throwable {
		scroll(File_Read_Manager.getInstanceFRM().getInstanceCR().getscrollinto(), null,
				pom.getInstanceShipping_Page().getCheckbox());
		clickOnElement(pom.getInstanceShipping_Page().getCheckbox());
	}

	@When("^user Click On The Proceed To Checkout Button In Shipping page of that Casual Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Casual_Dresses_Category()
			throws Throwable {
		clickOnElement(pom.getInstanceShipping_Page().getCheckout_btn());

	}

	@When("^user Click On The Pay By Bank Wire Option In Payment Page of that Casual Dresses Category$")
	public void user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Casual_Dresses_Category()
			throws Throwable {
		clickOnElement(pom.getIntancePaymentPage().getBankwire());
	}

	@Then("^user Click On The I Confirm My Order In Order Summary Page of that Casual Dresses Category$")
	public void user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Casual_Dresses_Category()
			throws Throwable {
		clickOnElement(pom.getInstanceBankWirePaymentPage().getConfirm_my_order());

	}

	@When("^user Move	To The Dresses Option For Click The Evening Dresses Category$")
	public void user_Move_To_The_Dresses_Option_For_Click_The_Evening_Dresses_Category() throws Throwable {
		actions("movetoelement", pom.getInstanceHome_Page().getDresses_btn());

	}

	@When("^user Click On The Evening Dresses Category In Dresses Option$")
	public void user_Click_On_The_Evening_Dresses_Category_In_Dresses_Option() throws Throwable {
		actions("click", pom.getInstanceHome_Page().getDresses_evening());

	}

	@When("^user Click On The Product Image In Evening Dresses Category$")
	public void user_Click_On_The_Product_Image_In_Evening_Dresses_Category() throws Throwable {
		scroll("scrollinto", null, pom.getInstanceCategory_Page().getDresses_Eveningdresses_productimg());
		clickOnElement(pom.getInstanceCategory_Page().getDresses_Eveningdresses_productimg());

	}

	@When("^user Click On The Add To Cart Button In Evening Dresses Category$")
	public void user_Click_On_The_Add_To_Cart_Button_In_Evening_Dresses_Category() throws Throwable {
		framesIndex(0);
		clickOnElement(pom.getInstanceCategory_Page().getEveningdresses_cartbtn());

	}

	@When("^user Click On The Proceed To Checkout Button In Product Page of that Evening Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Evening_Dresses_Category()
			throws Throwable {
		implictlyWait(20, TimeUnit.SECONDS);
		framesDefaultContent();
		implictlyWait(20, TimeUnit.SECONDS);
		clickOnElement(pom.getInstanceCategory_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Evening Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Evening_Dresses_Category()
			throws Throwable {

		clickOnElement(pom.getInstanecartSummary_Page().getCheckout_btn());
	}

	@When("^user Click On The Proceed To Checkout Button In Addresses Page of that Evening Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Evening_Dresses_Category()
			throws Throwable {

		clickOnElement(pom.getInstanceAdress_Page().getCheckout_btn());
	}

	@When("^user Click On The Terms Of Service CheckBox In Shipping Page of that Evening Dresses Category$")
	public void user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Evening_Dresses_Category()
			throws Throwable {
		scroll(File_Read_Manager.getInstanceFRM().getInstanceCR().getscrollinto(), null,
				pom.getInstanceShipping_Page().getCheckbox());
		clickOnElement(pom.getInstanceShipping_Page().getCheckbox());

	}

	@When("^user Click On The Proceed To Checkout Button In Shipping page of that Evening Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Evening_Dresses_Category()
			throws Throwable {

		clickOnElement(pom.getInstanceShipping_Page().getCheckout_btn());
	}

	@When("^user Click On The Pay By Bank Wire Option In Payment Page of that Evening Dresses Category$")
	public void user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Evening_Dresses_Category()
			throws Throwable {
		clickOnElement(pom.getIntancePaymentPage().getBankwire());

	}

	@Then("^user Click On The I Confirm My Order In Order Summary Page of that Evening Dresses Category$")
	public void user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Evening_Dresses_Category()
			throws Throwable {
		clickOnElement(pom.getInstanceBankWirePaymentPage().getConfirm_my_order());

	}

	@When("^user Move	To The Dresses Option For Click The Summer Dresses Category$")
	public void user_Move_To_The_Dresses_Option_For_Click_The_Summer_Dresses_Category() throws Throwable {
		actions("movetoelement", pom.getInstanceHome_Page().getDresses_btn());

	}

	@When("^user Click On The Summer Dresses Category In Dresses Option$")
	public void user_Click_On_The_Summer_Dresses_Category_In_Dresses_Option() throws Throwable {

		actions("click", pom.getInstanceHome_Page().getDresses_summer());

	}

	@When("^user Click On The Product Image In Summer Dresses Category$")
	public void user_Click_On_The_Product_Image_In_Summer_Dresses_Category() throws Throwable {
		scroll("scrollinto", null, pom.getInstanceCategory_Page().getDresses_Summerdresses_productimg());
		clickOnElement(pom.getInstanceCategory_Page().getDresses_Summerdresses_productimg());

	}

	@When("^user Click On The Add To Cart Button In Summer Dresses Category$")
	public void user_Click_On_The_Add_To_Cart_Button_In_Summer_Dresses_Category() throws Throwable {

		framesIndex(0);
		clickOnElement(pom.getInstanceCategory_Page().getSummerdresses_cartbtn());

	}

	@When("^user Click On The Proceed To Checkout Button In Product Page of that Summer Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Summer_Dresses_Category()
			throws Throwable {
		implictlyWait(20, TimeUnit.SECONDS);
		framesDefaultContent();
		implictlyWait(20, TimeUnit.SECONDS);
		clickOnElement(pom.getInstanceCategory_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Summer Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Summer_Dresses_Category()
			throws Throwable {

		clickOnElement(pom.getInstanecartSummary_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Addresses Page of that Summer Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Summer_Dresses_Category()
			throws Throwable {

		clickOnElement(pom.getInstanceAdress_Page().getCheckout_btn());

	}

	@When("^user Click On The Terms Of Service CheckBox In Shipping Page of that Summer Dresses Category$")
	public void user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Summer_Dresses_Category()
			throws Throwable {
		scroll(File_Read_Manager.getInstanceFRM().getInstanceCR().getscrollinto(), null,
				pom.getInstanceShipping_Page().getCheckbox());
		clickOnElement(pom.getInstanceShipping_Page().getCheckbox());

	}

	@When("^user Click On The Proceed To Checkout Button In Shipping page of that Summer Dresses Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Summer_Dresses_Category()
			throws Throwable {
		clickOnElement(pom.getInstanceShipping_Page().getCheckout_btn());

	}

	@When("^user Click On The Pay By Bank Wire Option In Payment Page of that Summer Dresses Category$")
	public void user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Summer_Dresses_Category()
			throws Throwable {
		clickOnElement(pom.getIntancePaymentPage().getBankwire());

	}

	@Then("^user Click On The I Confirm My Order In Order Summary Page of that Summer Dresses Category$")
	public void user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Summer_Dresses_Category()
			throws Throwable {

		clickOnElement(pom.getInstanceBankWirePaymentPage().getConfirm_my_order());
	}

	@When("^user Click On The Tshirt Option$")
	public void user_Click_On_The_Tshirt_Option() throws Throwable {
		actions("click", pom.getInstanceHome_Page().getT_shirts_btn());

	}

	@When("^user Click On The Product Image In T Shirt Category$")
	public void user_Click_On_The_Product_Image_In_T_Shirt_Category() throws Throwable {
		scroll("scrollinto", null, pom.getInstanceCategory_Page().getTshirt_productimg());
		clickOnElement(pom.getInstanceCategory_Page().getTshirt_productimg());

	}

	@When("^user Click On The Add To Cart Button In T Shirt Category$")
	public void user_Click_On_The_Add_To_Cart_Button_In_T_Shirt_Category() throws Throwable {
		framesIndex(0);
		clickOnElement(pom.getInstanceCategory_Page().getTshirtscart_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Product Page of that T Shirt Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_T_Shirt_Category()
			throws Throwable {
		implictlyWait(20, TimeUnit.SECONDS);
		framesDefaultContent();
		implictlyWait(20, TimeUnit.SECONDS);
		clickOnElement(pom.getInstanceCategory_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that T Shirt Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_T_Shirt_Category()
			throws Throwable {

		clickOnElement(pom.getInstanecartSummary_Page().getCheckout_btn());

	}

	@When("^user Click On The Proceed To Checkout Button In Addresses Page of that T Shirt Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_T_Shirt_Category()
			throws Throwable {
		clickOnElement(pom.getInstanceAdress_Page().getCheckout_btn());

	}

	@When("^user Click On The Terms Of Service CheckBox In Shipping Page of that T Shirt Category$")
	public void user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_T_Shirt_Category()
			throws Throwable {
		scroll(File_Read_Manager.getInstanceFRM().getInstanceCR().getscrollinto(), null,
				pom.getInstanceShipping_Page().getCheckbox());
		clickOnElement(pom.getInstanceShipping_Page().getCheckbox());

	}

	@When("^user Click On The Proceed To Checkout Button In Shipping page of that T Shirt Category$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_T_Shirt_Category()
			throws Throwable {
		clickOnElement(pom.getInstanceShipping_Page().getCheckout_btn());

	}

	@When("^user Click On The Pay By Bank Wire Option In Payment Page of that T Shirt Category$")
	public void user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_T_Shirt_Category() throws Throwable {
		clickOnElement(pom.getIntancePaymentPage().getBankwire());

	}

	@Then("^user Click On The I Confirm My Order In Order Summary Page of that T Shirt Category$")
	public void user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_T_Shirt_Category() throws Throwable {
		clickOnElement(pom.getInstanceBankWirePaymentPage().getConfirm_my_order());

	}

}

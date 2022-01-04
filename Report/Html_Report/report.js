$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/Automation_Practice/feature/AutomationPractice.feature");
formatter.feature({
  "line": 1,
  "name": "Buy clothes",
  "description": "",
  "id": "buy-clothes",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Login",
  "description": "",
  "id": "buy-clothes;login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username In \"\u003cusername\u003e\" Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password In \"\u003cpassword\u003e\" Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Signin Button And It Navigates To The My Account page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "buy-clothes;login;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "buy-clothes;login;;1"
    },
    {
      "cells": [
        "manukrizz322@gmail.com",
        "Manukrizz@4052"
      ],
      "line": 12,
      "id": "buy-clothes;login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 157322400,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Login",
  "description": "",
  "id": "buy-clothes;login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The Username In \"manukrizz322@gmail.com\" Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password In \"Manukrizz@4052\" Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Signin Button And It Navigates To The My Account page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 13689442100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "manukrizz322@gmail.com",
      "offset": 28
    }
  ],
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field(String)"
});
formatter.result({
  "duration": 466312100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Manukrizz@4052",
      "offset": 28
    }
  ],
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field(String)"
});
formatter.result({
  "duration": 233650800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Signin_Button_And_It_Navigates_To_The_My_Account_page()"
});
formatter.result({
  "duration": 3141131500,
  "status": "passed"
});
formatter.after({
  "duration": 6817900,
  "status": "passed"
});
formatter.before({
  "duration": 16977800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Women Option Category is Tops",
  "description": "",
  "id": "buy-clothes;women-option-category-is-tops",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 14,
      "name": "@Women_Tops"
    }
  ]
});
formatter.step({
  "line": 16,
  "name": "user Move to the Women Option For Click the Tops Category",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user Click On The Tops Category In Women Option",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user Click On The Product Image In Tops Category",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Click On The Add To Cart Button In Tops Category",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Click On The Proceed To Checkout Button In Product Page of that Tops Category",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Tops Category",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Click On The Proceed To Checkout Button In Addresses Page of that Tops Category",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Click On The Terms Of Service CheckBox In Shipping Page of that Tops Category",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click On The Proceed To Checkout Button In Shipping page of that Tops Category",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click On The Pay By Bank Wire Option In Payment Page of that Tops Category",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On The I Confirm My Order In Order Summary Page of that Tops Category",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Move_to_the_Women_Option_For_Click_the_Tops_Category()"
});
formatter.result({
  "duration": 202958900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Tops_Category_In_Women_Option()"
});
formatter.result({
  "duration": 5786151300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Product_Image_In_Tops_Category()"
});
formatter.result({
  "duration": 282646900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Add_To_Cart_Button_In_Tops_Category()"
});
formatter.result({
  "duration": 4711411300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Tops_Category()"
});
formatter.result({
  "duration": 5141241800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Tops_Category()"
});
formatter.result({
  "duration": 3713611400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Tops_Category()"
});
formatter.result({
  "duration": 2185197100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Tops_Category()"
});
formatter.result({
  "duration": 161915200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Tops_Category()"
});
formatter.result({
  "duration": 1503331200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Tops_Category()"
});
formatter.result({
  "duration": 1558926800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Tops_Category()"
});
formatter.result({
  "duration": 2700020700,
  "status": "passed"
});
formatter.after({
  "duration": 8011400,
  "status": "passed"
});
formatter.before({
  "duration": 9049100,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Women Option Category is Dresses",
  "description": "",
  "id": "buy-clothes;women-option-category-is-dresses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@Women_Dresses"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "user Move\tTo The Women Option For Click The Dresses Category",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "user Click On The Dresses Category In Women Option",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user Click On The Product Image In Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user Click On The Add To Cart Button In Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user Click On The Proceed To Checkout Button In Product Page of that Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Click On The Proceed To Checkout Button In Addresses Page of that Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Click On The Terms Of Service CheckBox In Shipping Page of that Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Click On The Proceed To Checkout Button In Shipping page of that Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Click On The Pay By Bank Wire Option In Payment Page of that Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Click On The I Confirm My Order In Order Summary Page of that Dresses Category",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Move_To_The_Women_Option_For_Click_The_Dresses_Category()"
});
formatter.result({
  "duration": 169791600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Dresses_Category_In_Women_Option()"
});
formatter.result({
  "duration": 2481428500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Product_Image_In_Dresses_Category()"
});
formatter.result({
  "duration": 295803400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Add_To_Cart_Button_In_Dresses_Category()"
});
formatter.result({
  "duration": 2087200400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Dresses_Category()"
});
formatter.result({
  "duration": 3800813400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Dresses_Category()"
});
formatter.result({
  "duration": 2027049200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Dresses_Category()"
});
formatter.result({
  "duration": 1697379200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Dresses_Category()"
});
formatter.result({
  "duration": 140817100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Dresses_Category()"
});
formatter.result({
  "duration": 1437976100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Dresses_Category()"
});
formatter.result({
  "duration": 1704971100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Dresses_Category()"
});
formatter.result({
  "duration": 3279872100,
  "status": "passed"
});
formatter.after({
  "duration": 6687400,
  "status": "passed"
});
formatter.before({
  "duration": 16281300,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Dresses Option Category is Casual Dresses",
  "description": "",
  "id": "buy-clothes;dresses-option-category-is-casual-dresses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 42,
      "name": "@Dresses_Casual"
    }
  ]
});
formatter.step({
  "line": 44,
  "name": "user Move\tTo The Dresses Option For Click The Casual Dresses Category",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "user Click On The Casual Dresses Category In Dresses Option",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "user Click On The Product Image In Casual Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "user Click On The Add To Cart Button In Casual Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "user Click On The Proceed To Checkout Button In Product Page of that Casual Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Casual Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "user Click On The Proceed To Checkout Button In Addresses Page of that Casual Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "user Click On The Terms Of Service CheckBox In Shipping Page of that Casual Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "user Click On The Proceed To Checkout Button In Shipping page of that Casual Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "user Click On The Pay By Bank Wire Option In Payment Page of that Casual Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "user Click On The I Confirm My Order In Order Summary Page of that Casual Dresses Category",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Move_To_The_Dresses_Option_For_Click_The_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 173781800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Casual_Dresses_Category_In_Dresses_Option()"
});
formatter.result({
  "duration": 2346510500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Product_Image_In_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 185104600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Add_To_Cart_Button_In_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 1690125000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 3614170300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 1727677600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 1588704000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 129041900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 1303428000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 1560515700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Casual_Dresses_Category()"
});
formatter.result({
  "duration": 4156970800,
  "status": "passed"
});
formatter.after({
  "duration": 10944600,
  "status": "passed"
});
formatter.before({
  "duration": 12097400,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "Dresses Option Category is Evening Dresses",
  "description": "",
  "id": "buy-clothes;dresses-option-category-is-evening-dresses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 57,
      "name": "@Dresses_Evening"
    }
  ]
});
formatter.step({
  "line": 59,
  "name": "user Move\tTo The Dresses Option For Click The Evening Dresses Category",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "user Click On The Evening Dresses Category In Dresses Option",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user Click On The Product Image In Evening Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user Click On The Add To Cart Button In Evening Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "user Click On The Proceed To Checkout Button In Product Page of that Evening Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Evening Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "user Click On The Proceed To Checkout Button In Addresses Page of that Evening Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "user Click On The Terms Of Service CheckBox In Shipping Page of that Evening Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "user Click On The Proceed To Checkout Button In Shipping page of that Evening Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "user Click On The Pay By Bank Wire Option In Payment Page of that Evening Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "user Click On The I Confirm My Order In Order Summary Page of that Evening Dresses Category",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Move_To_The_Dresses_Option_For_Click_The_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 154619900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Evening_Dresses_Category_In_Dresses_Option()"
});
formatter.result({
  "duration": 3012609500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Product_Image_In_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 197281500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Add_To_Cart_Button_In_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 3341318000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 4028704100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 1810893500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 1392131800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 181704900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 3040530600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 1328773300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Evening_Dresses_Category()"
});
formatter.result({
  "duration": 3152047800,
  "status": "passed"
});
formatter.after({
  "duration": 5179800,
  "status": "passed"
});
formatter.before({
  "duration": 18067600,
  "status": "passed"
});
formatter.scenario({
  "line": 73,
  "name": "Dresses Option Category is Summer Dresses",
  "description": "",
  "id": "buy-clothes;dresses-option-category-is-summer-dresses",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 72,
      "name": "@Dresses_Summer"
    }
  ]
});
formatter.step({
  "line": 74,
  "name": "user Move\tTo The Dresses Option For Click The Summer Dresses Category",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "user Click On The Summer Dresses Category In Dresses Option",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "user Click On The Product Image In Summer Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "user Click On The Add To Cart Button In Summer Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "user Click On The Proceed To Checkout Button In Product Page of that Summer Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Summer Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "user Click On The Proceed To Checkout Button In Addresses Page of that Summer Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "user Click On The Terms Of Service CheckBox In Shipping Page of that Summer Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "user Click On The Proceed To Checkout Button In Shipping page of that Summer Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "user Click On The Pay By Bank Wire Option In Payment Page of that Summer Dresses Category",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "user Click On The I Confirm My Order In Order Summary Page of that Summer Dresses Category",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Move_To_The_Dresses_Option_For_Click_The_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 170133100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Summer_Dresses_Category_In_Dresses_Option()"
});
formatter.result({
  "duration": 2760231400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Product_Image_In_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 220247300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Add_To_Cart_Button_In_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 3562345500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 3444028500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 1760252700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 1731334800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 163240700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 1378907300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 1772048100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_Summer_Dresses_Category()"
});
formatter.result({
  "duration": 3488107200,
  "status": "passed"
});
formatter.after({
  "duration": 5686700,
  "status": "passed"
});
formatter.before({
  "duration": 11264000,
  "status": "passed"
});
formatter.scenario({
  "line": 87,
  "name": "T Shirt Option",
  "description": "",
  "id": "buy-clothes;t-shirt-option",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 86,
      "name": "@Tshit"
    }
  ]
});
formatter.step({
  "line": 89,
  "name": "user Click On The Tshirt Option",
  "keyword": "When "
});
formatter.step({
  "line": 90,
  "name": "user Click On The Product Image In T Shirt Category",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "user Click On The Add To Cart Button In T Shirt Category",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "user Click On The Proceed To Checkout Button In Product Page of that T Shirt Category",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that T Shirt Category",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "user Click On The Proceed To Checkout Button In Addresses Page of that T Shirt Category",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "user Click On The Terms Of Service CheckBox In Shipping Page of that T Shirt Category",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "user Click On The Proceed To Checkout Button In Shipping page of that T Shirt Category",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "user Click On The Pay By Bank Wire Option In Payment Page of that T Shirt Category",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "user Click On The I Confirm My Order In Order Summary Page of that T Shirt Category",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Tshirt_Option()"
});
formatter.result({
  "duration": 2611067600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Product_Image_In_T_Shirt_Category()"
});
formatter.result({
  "duration": 206517900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Add_To_Cart_Button_In_T_Shirt_Category()"
});
formatter.result({
  "duration": 1657398300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Product_Page_of_that_T_Shirt_Category()"
});
formatter.result({
  "duration": 4280102500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shopping_Cart_Summary_Page_of_that_T_Shirt_Category()"
});
formatter.result({
  "duration": 2085981400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Addresses_Page_of_that_T_Shirt_Category()"
});
formatter.result({
  "duration": 1241000100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Terms_Of_Service_CheckBox_In_Shipping_Page_of_that_T_Shirt_Category()"
});
formatter.result({
  "duration": 156006900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Proceed_To_Checkout_Button_In_Shipping_page_of_that_T_Shirt_Category()"
});
formatter.result({
  "duration": 1204372200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Pay_By_Bank_Wire_Option_In_Payment_Page_of_that_T_Shirt_Category()"
});
formatter.result({
  "duration": 1918325900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_I_Confirm_My_Order_In_Order_Summary_Page_of_that_T_Shirt_Category()"
});
formatter.result({
  "duration": 3452723800,
  "status": "passed"
});
formatter.after({
  "duration": 4609900,
  "status": "passed"
});
});
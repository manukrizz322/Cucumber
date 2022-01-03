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
      "name": "@Ap1"
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
        "A1",
        "1234567"
      ],
      "line": 12,
      "id": "buy-clothes;login;;2"
    },
    {
      "cells": [
        "B1",
        "34567"
      ],
      "line": 13,
      "id": "buy-clothes;login;;3"
    },
    {
      "cells": [
        "manukrizz322@gmail.com",
        "Manukrizz@4052"
      ],
      "line": 14,
      "id": "buy-clothes;login;;4"
    }
  ],
  "keyword": "Examples"
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
      "name": "@Ap1"
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
  "name": "user Enter The Username In \"A1\" Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password In \"1234567\" Password Field",
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
  "location": "Step_Definition.user_launch_the_application()"
});
formatter.result({
  "duration": 12510263700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A1",
      "offset": 28
    }
  ],
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field(String)"
});
formatter.result({
  "duration": 463216300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567",
      "offset": 28
    }
  ],
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field(String)"
});
formatter.result({
  "duration": 243047400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_signin_button_and_it_navigates_to_the_my_account_page()"
});
formatter.result({
  "duration": 1559560100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Login",
  "description": "",
  "id": "buy-clothes;login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Ap1"
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
  "name": "user Enter The Username In \"B1\" Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The Password In \"34567\" Password Field",
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
  "location": "Step_Definition.user_launch_the_application()"
});
formatter.result({
  "duration": 4103754300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "B1",
      "offset": 28
    }
  ],
  "location": "Step_Definition.user_Enter_The_Username_In_Username_Field(String)"
});
formatter.result({
  "duration": 197171600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "34567",
      "offset": 28
    }
  ],
  "location": "Step_Definition.user_Enter_The_Password_In_Password_Field(String)"
});
formatter.result({
  "duration": 197739200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_signin_button_and_it_navigates_to_the_my_account_page()"
});
formatter.result({
  "duration": 1732783700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login",
  "description": "",
  "id": "buy-clothes;login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Ap1"
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
  "location": "Step_Definition.user_launch_the_application()"
});
formatter.result({
  "duration": 3730703300,
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
  "duration": 257597700,
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
  "duration": 245922600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_signin_button_and_it_navigates_to_the_my_account_page()"
});
formatter.result({
  "duration": 1856676300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Women Category Tops",
  "description": "",
  "id": "buy-clothes;women-category-tops",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Ap2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "user Mouse Hover to the Women Option",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Click On The Tops Category in Women Option",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Click On The Product Image",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Click On The Add To Cart Button",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Click On The Proceed To Checkout Button In Product Page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Click On The Proceed To Checkout Button In Shopping Cart Summary Page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Click On The Proceed To Checkout Button In Addresses Page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click On The Terms Of Service CheckBox In Shipping Page",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On The Proceed To Checkout Button In Shipping page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user Click On The Pay By Bank Wire Option In Payment Page",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user Click On The I Confirm My Order In Order Summary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_mouse_hover_to_the_women_option()"
});
formatter.result({
  "duration": 395704100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_tops_category_in_women_option()"
});
formatter.result({
  "duration": 3341295200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_product_image()"
});
formatter.result({
  "duration": 256150300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_add_to_cart_button()"
});
formatter.result({
  "duration": 3321477100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_proceed_to_checkout_button_in_product_page()"
});
formatter.result({
  "duration": 4637324800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_proceed_to_checkout_button_in_shopping_cart_summary_page()"
});
formatter.result({
  "duration": 2530136000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_proceed_to_checkout_button_in_addresses_page()"
});
formatter.result({
  "duration": 1511202200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_terms_of_service_check_box_in_shipping_page()"
});
formatter.result({
  "duration": 159366200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_proceed_to_checkout_button_in_shipping_page()"
});
formatter.result({
  "duration": 1563392400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_pay_by_bank_wire_option_in_payment_page()"
});
formatter.result({
  "duration": 1685564300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_click_on_the_i_confirm_my_order_in_order_summary_page()"
});
formatter.result({
  "duration": 2672499000,
  "status": "passed"
});
});
Feature: Buy clothes 

@Ap1
Scenario Outline: Login
Given user Launch The Application
When user Enter The Username In "<username>" Username Field
And user Enter The Password In "<password>" Password Field
Then user Click On The Signin Button And It Navigates To The My Account page

Examples:
|username|password|
|A1|1234567|
|B1|34567|
|manukrizz322@gmail.com|Manukrizz@4052|

@Ap2
Scenario: Women Category Tops
When user Mouse Hover to the Women Option 
And user Click On The Tops Category in Women Option 
And user Click On The Product Image
And user Click On The Add To Cart Button
And user Click On The Proceed To Checkout Button In Product Page
And user Click On The Proceed To Checkout Button In Shopping Cart Summary Page  
And user Click On The Proceed To Checkout Button In Addresses Page 
And user Click On The Terms Of Service CheckBox In Shipping Page 
And user Click On The Proceed To Checkout Button In Shipping page 
And user Click On The Pay By Bank Wire Option In Payment Page 
Then user Click On The I Confirm My Order In Order Summary Page


@Ap3
Scenario: Logout

Then user Click On The Signout Button And It Navigates To The Home Page  








	



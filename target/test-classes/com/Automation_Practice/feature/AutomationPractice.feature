Feature: Buy clothes 

@Login
Scenario Outline: Login 
	Given user Launch The Application 
	When user Enter The Username In "<username>" Username Field 
	And user Enter The Password In "<password>" Password Field 
	Then user Click On The Signin Button And It Navigates To The My Account page 
	
	Examples: 
		|username|password|
		|manukrizz322@gmail.com|Manukrizz@4052|
		
		@Women_Tops
		Scenario: Women Option Category is Tops 
			When user Move to the Women Option For Click the Tops Category 
			And user Click On The Tops Category In Women Option 
			And user Click On The Product Image In Tops Category 
			And user Click On The Add To Cart Button In Tops Category 
			And user Click On The Proceed To Checkout Button In Product Page of that Tops Category 
			And user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Tops Category 
			And user Click On The Proceed To Checkout Button In Addresses Page of that Tops Category 
			And user Click On The Terms Of Service CheckBox In Shipping Page of that Tops Category 
			And user Click On The Proceed To Checkout Button In Shipping page of that Tops Category 
			And user Click On The Pay By Bank Wire Option In Payment Page of that Tops Category 
			Then user Click On The I Confirm My Order In Order Summary Page of that Tops Category 
		
		@Women_Dresses	
		Scenario: Women Option Category is Dresses 
			When user Move	To The Women Option For Click The Dresses Category 
			And user Click On The Dresses Category In Women Option 
			And user Click On The Product Image In Dresses Category 
			And user Click On The Add To Cart Button In Dresses Category 
			And user Click On The Proceed To Checkout Button In Product Page of that Dresses Category 
			And user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Dresses Category 
			And user Click On The Proceed To Checkout Button In Addresses Page of that Dresses Category 
			And user Click On The Terms Of Service CheckBox In Shipping Page of that Dresses Category 
			And user Click On The Proceed To Checkout Button In Shipping page of that Dresses Category 
			And user Click On The Pay By Bank Wire Option In Payment Page of that Dresses Category 
			Then user Click On The I Confirm My Order In Order Summary Page of that Dresses Category 
			
			@Dresses_Casual
			Scenario: Dresses Option Category is Casual Dresses 
			When user Move	To The Dresses Option For Click The Casual Dresses Category 
			And user Click On The Casual Dresses Category In Dresses Option 
			And user Click On The Product Image In Casual Dresses Category 
			And user Click On The Add To Cart Button In Casual Dresses Category 
			And user Click On The Proceed To Checkout Button In Product Page of that Casual Dresses Category 
			And user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Casual Dresses Category 
			And user Click On The Proceed To Checkout Button In Addresses Page of that Casual Dresses Category 
			And user Click On The Terms Of Service CheckBox In Shipping Page of that Casual Dresses Category 
			And user Click On The Proceed To Checkout Button In Shipping page of that Casual Dresses Category 
			And user Click On The Pay By Bank Wire Option In Payment Page of that Casual Dresses Category 
			Then user Click On The I Confirm My Order In Order Summary Page of that Casual Dresses Category 
			
			
			@Dresses_Evening
			Scenario: Dresses Option Category is Evening Dresses 
			When user Move	To The Dresses Option For Click The Evening Dresses Category 
			And user Click On The Evening Dresses Category In Dresses Option 
			And user Click On The Product Image In Evening Dresses Category 
			And user Click On The Add To Cart Button In Evening Dresses Category 
			And user Click On The Proceed To Checkout Button In Product Page of that Evening Dresses Category 
			And user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Evening Dresses Category 
			And user Click On The Proceed To Checkout Button In Addresses Page of that Evening Dresses Category 
			And user Click On The Terms Of Service CheckBox In Shipping Page of that Evening Dresses Category 
			And user Click On The Proceed To Checkout Button In Shipping page of that Evening Dresses Category 
			And user Click On The Pay By Bank Wire Option In Payment Page of that Evening Dresses Category 
			Then user Click On The I Confirm My Order In Order Summary Page of that Evening Dresses Category 
			
			
			@Dresses_Summer
			Scenario: Dresses Option Category is Summer Dresses 
			When user Move	To The Dresses Option For Click The Summer Dresses Category 
			And user Click On The Summer Dresses Category In Dresses Option 
			And user Click On The Product Image In Summer Dresses Category 
			And user Click On The Add To Cart Button In Summer Dresses Category 
			And user Click On The Proceed To Checkout Button In Product Page of that Summer Dresses Category 
			And user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that Summer Dresses Category 
			And user Click On The Proceed To Checkout Button In Addresses Page of that Summer Dresses Category 
			And user Click On The Terms Of Service CheckBox In Shipping Page of that Summer Dresses Category 
			And user Click On The Proceed To Checkout Button In Shipping page of that Summer Dresses Category 
			And user Click On The Pay By Bank Wire Option In Payment Page of that Summer Dresses Category 
			Then user Click On The I Confirm My Order In Order Summary Page of that Summer Dresses Category 
			
			@Tshit
			Scenario: T Shirt Option  
			
			When user Click On The Tshirt Option 
			And user Click On The Product Image In T Shirt Category 
			And user Click On The Add To Cart Button In T Shirt Category 
			And user Click On The Proceed To Checkout Button In Product Page of that T Shirt Category 
			And user Click On The Proceed To Checkout Button In Shopping Cart Summary Page of that T Shirt Category 
			And user Click On The Proceed To Checkout Button In Addresses Page of that T Shirt Category 
			And user Click On The Terms Of Service CheckBox In Shipping Page of that T Shirt Category 
			And user Click On The Proceed To Checkout Button In Shipping page of that T Shirt Category 
			And user Click On The Pay By Bank Wire Option In Payment Page of that T Shirt Category 
			Then user Click On The I Confirm My Order In Order Summary Page of that T Shirt Category 
			
			
		@Logout
		Scenario: Logout 
		
			Then user Click On The Signout Button And It Navigates To The Home Page 
			
			
			
			
			
			
			
			
			
			
			

Feature: Testing loggings Application

Scenario Outline: Testing logins case

Given user launch the application
When user enter <userName> and <password>
And click on login button
Then user navigate to application

And  select the "Laptops" categories

Then user select the "Sony vaio i5" product

And user add product to add to cart

Then user click on "Cart" to verify product "Sony vaio i5"

And user proceed to place order

Then user fill the required details "sathish" and "3425 44226" for order

And user purchase the order

Then user verify the message "Thank you for your purchase!"
 

Examples:
| userName | password |
| SathishDamarapelly | S@t26-26 | 




Feature: Ordering a Dress in Automation Practice Application

Scenario: User Click Evening Dress in Dresses

				Given user Launch The Url
				When user Click The Dresses
				And user Click The Evening Dresses
				Then user Navigate To Evening Dresses Page
				
Scenario: User Select The Size Colour And Add To Cart

				When user Scroll Down And Click Quickview
				And user Select The Size
				And user Select The Colour
				And user Click Add To Cart
				And user Click Checkout
				Then user Navigate To Order Details Page

Scenario Outline: User Signin And Confirm The Order

				When user Scroll Down And Click Checkout
				And user Enter The "<email>" And "<password>"
				And user Click On Signin
				And user Click Agree And Click Checkout
				And user Click On Payment And Done Payment
				And user Scroll Down And Click Confirm Order
				Then user Receive The Order Id
				
Examples:
|email|password|
|mithneesh15@gmail.com|M1234567890|			
				
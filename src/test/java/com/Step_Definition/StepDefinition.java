package com.Step_Definition;

import java.io.IOException;

import com.Base.Base_Class;
import com.Pom_Manager.Page_Object_Manager;
import com.Properties.File_Reader_Manager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends Base_Class {
	
	@Before
	public void beforeHooks(Scenario s) {
		String name = s.getName();
		System.out.println("Scenario Name: " + name);
	}
	@After
	public void afterHooks(Scenario s) throws IOException {
		Status status = s.getStatus();
		System.out.println("Scenario Status: " + status);
		
//		if (s.isFailed()) {
//			Screenshot("./Screenshot/Failure1.png");
//		}
	}

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("user Launch The Url")
	public void user_launch_the_url() throws Throwable {

		String url = File_Reader_Manager.getFRM().getCR().getUrl();
		launchUrl(url);
	}

	@When("user Click The Dresses")
	public void user_click_the_dresses() {

		moveToElement(pom.getMs().getDresses());
	}

	@When("user Click The Evening Dresses")
	public void user_click_the_evening_dresses() {

		clickOnElement(pom.getMs().getEvening_dresses());
	}

	@Then("user Navigate To Evening Dresses Page")
	public void user_navigate_to_evening_dresses_page() {
	}

	@When("user Scroll Down And Click Quickview")
	public void user_scroll_and_click_quickview() {

		scroll(pom.getEd().getEvening_dresses());
		clickOnElement(pom.getEd().getQuickview());
		frame(driver, pom.getEd().getCartFrame());
	}

	@When("user Select The Size")
	public void user_select_the_size() {

		clickOnElement(pom.getEd().getPlus());
		clickOnElement(pom.getEd().getPlus());
		selectText(pom.getEd().getSize(), "M");
	}

	@When("user Select The Colour")
	public void user_select_the_colour() {

		clickOnElement(pom.getEd().getColour());
	}

	@When("user Click Add To Cart")
	public void user_click_add_to_cart() {

		clickOnElement(pom.getEd().getAddtoCart());
		defaultframe();
	}

	@When("user Click Checkout")
	public void user_click_checkout() {

		clickOnElement(pom.getEd().getCheckout());
	}

	@Then("user Navigate To Order Details Page")
	public void user_navigate_to_order_details() {
	}

	@When("user Scroll Down And Click Checkout")
	public void user_scroll_down_and_click_checkout() {

		scroll(pom.getOrd().getCartSummary());
		clickOnElement(pom.getOrd().getCheckout());
	}

	@When("user Enter The {string} And {string}")
	public void user_enter_the_and(String email, String password) {

		passInput(pom.getLog().getEmail(), email);
		passInput(pom.getLog().getPassword(), password);
	}

	@When("user Click On Signin")
	public void user_click_on_signin() {

		clickOnElement(pom.getLog().getSignin());
	}

	@When("user Click Agree And Click Checkout")
	public void user_click_agree_and_click_checkout() {

		clickOnElement(pom.getOrd().getAddressCheckout());
		clickOnElement(pom.getOrd().getAgreeCheckbox());
		clickOnElement(pom.getOrd().getShippingCheckout());
	}

	@When("user Click On Payment And Done Payment")
	public void user_click_on_payment_and_done_payment() {
		
		clickOnElement(pom.getOrd().getPaybyBank());
	}

	@When("user Scroll Down And Click Confirm Order")
	public void user_scroll_down_and_click_confirm_order() throws IOException {
		
		scroll(pom.getOrd().getOrdersummary());
		Screenshot("./Screenshot/Order_Summary.png");
		clickOnElement(pom.getOrd().getConfirmOrder());
	}

	@Then("user Receive The Order Id")
	public void user_receive_the_order_id() {
	}

}

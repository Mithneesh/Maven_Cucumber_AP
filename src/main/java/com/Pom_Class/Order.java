package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {
	
	public WebDriver driver;

	public Order(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
	private WebElement checkout;

	public WebElement getCheckout() {
		return checkout;
	}
	
	@FindBy(id="cart_title")
	private WebElement cartSummary;
	
	public WebElement getCartSummary() {
		return cartSummary;
	}

	@FindBy(id="addressesAreEquals")
	private WebElement checkbox;
	
	public WebElement getCheckbox() {
		return checkbox;
	}
	
	@FindBy(name="processAddress")
	private WebElement addressCheckout;
	
	public WebElement getAddressCheckout() {
		return addressCheckout;
	}
	
	@FindBy(id="cgv")
	private WebElement agreeCheckbox;

	public WebElement getAgreeCheckbox() {
		return agreeCheckbox;
	}
		
	@FindBy(name="processCarrier")
	private WebElement shippingCheckout;
	
	public WebElement getShippingCheckout() {
		return shippingCheckout;
	}
	
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement paybyBank;

	public WebElement getPaybyBank() {
		return paybyBank;
	}
	
	@FindBy(xpath=" //h1[contains(text(),'Order summary')]")
	private WebElement ordersummary;

	public WebElement getOrdersummary() {
		return ordersummary;
	}
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium']")
	private WebElement confirmOrder;

	public WebElement getConfirmOrder() {
		return confirmOrder;
	}
	
	
	
	
	
	
	

}
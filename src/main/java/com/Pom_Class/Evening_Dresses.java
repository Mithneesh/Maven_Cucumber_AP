package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evening_Dresses {
	
	public WebDriver driver;
	
	@FindBy(xpath="//span[@class='cat-name']")
	private WebElement evening_dresses;
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement movetoQuickview;
	
	@FindBy(xpath="//img[@itemprop='image']")
	private WebElement quickview;
	
	@FindBy(xpath="//iframe[contains(@id,'fancybox')]")
	private WebElement cartFrame;
	
	@FindBy(xpath="//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement plus;
	
	@FindBy(xpath="//select[@id='group_1']")
	private WebElement size;
	
	@FindBy(xpath="//a[@id='color_24']")
	private WebElement colour;
	
	@FindBy(xpath="//span[normalize-space()='Add to cart']")
	private WebElement addToCart;
	
	@FindBy(xpath="//span[normalize-space()='Proceed to checkout']")
	private WebElement checkout;

	
	
	
	
	
	
	
	
	
	
	
	public Evening_Dresses(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	
	
	
	

	public WebElement getEvening_dresses() {
		return evening_dresses;
	}
	
	public WebElement getMovetoQuickview() {
		return movetoQuickview;
	}

	public WebElement getQuickview() {
		return quickview;
	}

	public WebElement getCartFrame() {
		return cartFrame;
	}

	public WebElement getPlus() {
		return plus;
	}
	
	public WebElement getSize() {
		return size;
	}
	
	public WebElement getColour() {
		return colour;
	}
	
	public WebElement getAddtoCart() {
		return addToCart;
	}
	
	public WebElement getCheckout() {
		return checkout;
	}
	
	
	
	
	
	
	
	

}

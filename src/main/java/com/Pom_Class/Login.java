package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public WebDriver driver;

	public Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	private WebElement email;
	
	public WebElement getEmail() {
		return email;
	}

	@FindBy(id="passwd")
	private WebElement password;
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//span[normalize-space()='Sign in']")
	private WebElement signin;
	
	public WebElement getSignin() {
		return signin;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

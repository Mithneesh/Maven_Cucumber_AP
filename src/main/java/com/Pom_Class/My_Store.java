package com.Pom_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class My_Store {
	
	public WebDriver driver;
	
	@FindBy(xpath="//body/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[2]/a[1]")
	private WebElement dresses;
	
	@FindBy(xpath="//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	private WebElement evening_dresses;
	
	
	public My_Store(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);

	}
	
	
	
	

	public WebElement getDresses() {
		return dresses;
	}

	public WebElement getEvening_dresses() {
		return evening_dresses;
	}

}

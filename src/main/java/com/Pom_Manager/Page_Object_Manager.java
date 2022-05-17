package com.Pom_Manager;

import org.openqa.selenium.WebDriver;

import com.Pom_Class.Evening_Dresses;
import com.Pom_Class.Login;
import com.Pom_Class.My_Store;
import com.Pom_Class.Order;

public class Page_Object_Manager {
	
	public WebDriver driver;
	
	private My_Store ms;
	private Evening_Dresses ed;
	private Order ord;
	private Login log;
	
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;

	}
	
	

	public My_Store getMs() {
		if (ms==null) {
			ms = new My_Store(driver);
		}
		return ms;
	}

	
	public Evening_Dresses getEd() {
		if (ed==null) {
			ed = new Evening_Dresses(driver);
		}
		return ed;
	}

	
	public Order getOrd() {
		if (ord==null) {
			ord = new Order(driver);
		}
		return ord;
	}

	public Login getLog() {
		if (log==null) {
			log = new Login(driver);	
		}
		return log;
	}

	
	
	
	
	
	
	
	
	
}

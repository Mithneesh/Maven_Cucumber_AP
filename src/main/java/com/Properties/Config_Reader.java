package com.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config_Reader {

	Properties p;
	
	public Config_Reader() throws Throwable {

		File f = new File("C:\\Users\\mithn\\eclipse-workspace\\Maven_AutomationPractice\\src\\main\\java\\com\\Properties\\Project.Properties");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		p.load(fis);
	
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}
	
	public String getEmail() {
		String email = p.getProperty("email");
		return email;
	}
	
	public String getPassword() {
		String password = p.getProperty("password");
		return password;
	}
	
	
}

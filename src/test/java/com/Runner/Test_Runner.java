package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Base.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\Feature_File" ,
				 glue = "com.Step_Definition" ,
				 monochrome = true ,
				 dryRun = false ,
				 plugin = {"pretty" ,
						 "html:target/Reports/Report.html" ,
						 "json:target/Reports/Report.json" ,
						 "junit:target/Reports/Report.xml" ,
						 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Test_Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
		driver = Base_Class.launchIncognitoBrowser("chrome");
	}
	@AfterClass
	public static void tearDown() {
		Base_Class.closeBrowser();
	}
	

}

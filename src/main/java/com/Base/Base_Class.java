package com.Base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;
	public static ChromeOptions co;
	public static Select s;
	public static Actions act;
	public static Robot rob;
	public static WebDriverWait wait;



	//Launch Browser
	public static WebDriver launchBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		else if (browsername.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", 
					System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");

			driver = new EdgeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

		return driver;
	}


	//Launch Incognito Browser
	public static WebDriver launchIncognitoBrowser(String browsername) {

		if (browsername.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

			ChromeOptions co = new ChromeOptions();
			co.addArguments("Incognito");

			driver = new ChromeDriver(co);

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

		else if (browsername.equalsIgnoreCase("edge")) {

			System.setProperty("webdriver.edge.driver", 
					System.getProperty("user.dir") + "\\Driver\\msedgedriver.exe");

			driver = new EdgeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}

		return driver;
	}



	//Get URL
	public static void launchUrl(String url) {
		driver.get(url);
	}

	//Get Title
	public static void getTitle() {
		System.out.println(driver.getTitle());
	}

	//Get Current URL
	public static void getcurrenturl() {
		System.out.println(driver.getCurrentUrl());
	}

	//Get Text
	public static void getText(WebElement element) {
		System.out.println(element.getText());
	}

	//Get Attribute Value
	public static void getAttributeValue(WebElement element) {
		System.out.println(element.getAttribute("Value"));
	}

	//Navigate
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	//Close
	public static void closeBrowser() {
		driver.close();
	}

	//Quit
	public static void quit() {
		driver.quit();
	}

	//Sendkeys
	public static void passInput(WebElement element , String input) {
		element.sendKeys(input);
	}

	//Clear
	public static void clearpassedInput(WebElement element) {
		element.clear();
	}

	//Click
	public static void clickOnElement(WebElement element) {
		element.click();
	}

	//Radio Button
	public static void clickOnRadiobtn(WebElement element) {
		element.click();
	}

	//Check Box
	public static void clickOnCheckbox(WebElement element) {
		element.click();
	}


	//Screenshot
	public static void Screenshot(String location) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE); 
		File destination = new File(location);
		FileHandler.copy(source, destination);
	}

	//DropDown Select
	public static void selectText(WebElement element , String text) {
		s = new Select(element); 											
		s.selectByVisibleText(text); 							
	}

	public static void selectValue(WebElement element , String value) {
		s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectIndex(WebElement element , int index) {
		s = new Select(element);
		s.selectByIndex(index);
	}

	//DropDown Deselect
	public static void deselectText(WebElement element , String text) {
		s = new Select(element);
		s.deselectByVisibleText(text);
	}

	public static void deselectValue(WebElement element , String text) {
		s = new Select(element);
		s.deselectByValue(text);
	}

	public static void deselectIndex(WebElement element , int index) {
		s = new Select(element);
		s.deselectByIndex(index);
	}

	//Deselect All
	public static void deselectAll(WebElement element) {
		s = new Select(element);
		s.deselectAll();
	}

	//Get Options
	public static void getOpts(WebElement element) {
		List<WebElement> options = s.getOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}		
	}

	//Get All Selected Options
	public static void getAllSelectedOpts(WebElement element) {
		List<WebElement> options = s.getAllSelectedOptions();
		for (WebElement opt : options) {
			System.out.println(opt.getText());
		}
	}

	//Get First Selected Option
	public static void getFirstSelectedOpt(WebElement element) {
		element = s.getFirstSelectedOption();
		System.out.println(element.getText());
	}

	//Is Multiple?
	public static void isMultiple(WebElement element) {
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	//Is Displayed?
	public static void isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	//Is Enabled?
	public static void isEnable(WebElement element) {
		boolean enable = element.isEnabled();
		System.out.println(enable);
	}

	//Is Selected?
	public static void isSelected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);
	}

	//Alert
	public static void simpleAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	public static void confirmAlert(WebDriver driver) {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	public static void promptAlert(WebDriver driver , String str) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(str);
		alert.accept();
	}

	//Switch to Frame
	public static void frame(WebDriver driver , WebElement element) {
		driver.switchTo().frame(element);
	}

	//Switch to Default Content
	public static void defaultframe() {
		driver.switchTo().defaultContent();
	}

	//Scroll
	public static void scroll(WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView()", element);
	}

	//Mouse Actions
	public static void doubleClick(WebElement element) {
		act = new Actions(driver);
		act.doubleClick(element).build().perform();
	}

	public static void rightClick(WebElement element) {
		act = new Actions(driver);
		act.contextClick(element).build().perform();
	}

	public static void moveToElement(WebElement element) {
		act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public static void dragAnddrop(WebElement source , WebElement target) {
		act = new Actions(driver);
		act.dragAndDrop(source, target).build().perform();
	}

	//KeyBoard Actions
	public static void keyUp() throws Throwable {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_UP);
		rob.keyRelease(KeyEvent.VK_UP);
	}

	public static void keyDown() throws Throwable {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void keyEnter() throws Throwable {
		rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);
		rob.keyRelease(KeyEvent.VK_ENTER);
	}

	//Get WindowHandle - Parent Window ID
	public static void windowhandle(WebDriver driver) {
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent Window : " + parentwindow);
	}

	//Get WindowHandles - Switch to New Child Window
	public static void windowhandles(WebDriver driver) {
		Set<String> windows = driver.getWindowHandles();
		for (String newwindow : windows) {
			driver.switchTo().window(newwindow);
		}
	}

	//Switch to Parent Window
	public static void parentWindow(WebDriver driver , String parentwindow) {
		driver.switchTo().window(parentwindow);
	}

	//No Of Windows opened
	public static void windowsSize(WebDriver driver) {
		Set<String> noofwindows = driver.getWindowHandles();									
		int size = noofwindows.size();
		System.out.println("Number of Windows Opened - " + size);		
	}

	//Closing All Child Windows Except Parent Window
	public static void closeAllChildWindows(WebDriver driver , String parentwindow) {
		Set<String> windows = driver.getWindowHandles();
		for (String childtabs : windows) {
			if (!childtabs.equals(parentwindow)) {											
				driver.switchTo().window(childtabs);									 
				driver.close();
			}
		}
	}

	//Implicit Wait
	public static void implicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	//Explicit Wait
	public static void waitVisibilityOf(WebElement element) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void waitInVisibilityOf(WebElement element) {
		wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.invisibilityOf(element));
	}

	public static void waitAlertIsPresent(WebElement element) {
		wait = new WebDriverWait(driver, 30);
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
	}
}











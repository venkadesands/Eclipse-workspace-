package com.adaction.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String type) {
		if (type.equalsIgnoreCase("chrome")) {
			
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace2019\\Cucooo\\ChromeNew\\chromedriver.exe" );
		 driver= new ChromeDriver();
		
		}
		return driver;
	}
	
	public static void getUrl(String url) {
		driver.get(url);

	}
	
	public static void inputValueElement(WebElement Element , String value) {
		 
		Element.sendKeys(value);

	}
	
	public static void inputvalueElementForInt(WebElement element,int value) {
		element.sendKeys("value");

	}
	public static void clickOnButton(WebElement Element) {
		Element.click();
		
	
	}
	
	public static void dropDown(String type , String value, WebElement element ) {
	Select s = new Select(element);
  if (type.equalsIgnoreCase("byvisibletext")) {
	s.selectByVisibleText(value);
}

  else if (type.equalsIgnoreCase("byvalue")) {
	s.selectByValue(value);
}
  else if (type.equalsIgnoreCase("byindex")) {
	  int parseInt = Integer.parseInt(value);
	s.selectByIndex(parseInt);
}

}
	
	
}

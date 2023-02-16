package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomForAdactinLoginpage {
public static WebDriver driver;
	@FindBy(id = "username")
	private WebElement Username;
	
	
	@FindBy(id= "password")
	private WebElement Password ;
	
	
	@FindBy(id= "login")
	private WebElement Login ;
	
	
	public PomForAdactinLoginpage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}


	public WebElement getUsername() {
		return Username;
	}


	public WebElement getPassword() {
		return Password;
	}


	public WebElement getLogin() {
		return Login;
	}
	
	
	
	
}

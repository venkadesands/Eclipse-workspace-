package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_For_select_And_Bookhotel {
 public static WebDriver driver;
	
 public Pom_For_select_And_Bookhotel(WebDriver driver3) {
		this.driver=driver3;
		PageFactory.initElements(driver3, this);
	}

	
	
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getCheck_box() {
		return Check_box;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getFirstName2() {
		return FirstName2;
	}

	public WebElement getLastname() {
		return Lastname;
	}

	public WebElement getBilling_Address() {
		return Billing_Address;
	}

	public WebElement getCredit_Card_No() {
		return Credit_Card_No;
	}

	public WebElement getCredit_card_type() {
		return Credit_card_type;
	}

	public WebElement getExpiry_Date_Month() {
		return Expiry_Date_Month;
	}

	public WebElement getExpiry_Date_Year() {
		return Expiry_Date_Year;
	}

	public WebElement getCVV_Number() {
		return CVV_Number;
	}

	public WebElement getBookNowButton() {
		return BookNowButton;
	}

	public WebElement getLogout() {
		return Logout;
	}
	@FindBy(xpath="//input[@type=\"radio\"]")
	private WebElement Check_box;
	
	@FindBy(id="continue")
	private WebElement  Continue;
	
	
	@FindBy(xpath="(//input[@type=\"text\"])[11]")
	private WebElement FirstName2;
	
	
	@FindBy(xpath="(//input[@type=\"text\"])[12]")
	private WebElement Lastname;
	
	
	@FindBy(id="address")
	private WebElement  Billing_Address;
	
	
	@FindBy(xpath="(//input[@type=\"text\"])[13]")
	private WebElement Credit_Card_No;
	
	@FindBy(id="cc_type")
	private WebElement  Credit_card_type;
	
	@FindBy(id="cc_exp_month")
	private WebElement  Expiry_Date_Month;
	
	@FindBy(id="cc_exp_year")
	private WebElement Expiry_Date_Year ;
	
	@FindBy(xpath="(//input[@type=\"text\"])[14]")
	private WebElement CVV_Number ;
	
	
	@FindBy(xpath="(//input[@type=\"button\"])[1]")
	private WebElement BookNowButton ;
	
	@FindBy(id="logout")
	private WebElement Logout  ;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

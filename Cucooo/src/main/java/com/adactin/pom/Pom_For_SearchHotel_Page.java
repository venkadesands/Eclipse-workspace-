package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_For_SearchHotel_Page {
public static WebDriver driver;
	@FindBy(id = "location")
	private WebElement Location;
	
	public Pom_For_SearchHotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver ,this );
	}


	public WebElement getLocation() {
		return Location;
	}


	public WebElement getHotels() {
		return Hotels;
	}


	public WebElement getRoomtype() {
		return Roomtype;
	}


	public WebElement getNumber_of_Rooms() {
		return Number_of_Rooms;
	}


	public WebElement getCheck_In_Date() {
		return Check_In_Date;
	}


	public WebElement getCheck_out_Date() {
		return Check_out_Date;
	}


	public WebElement getAdults_per_Room() {
		return Adults_per_Room;
	}


	public WebElement getChildren_per_Room() {
		return Children_per_Room;
	}


	public WebElement getSearch() {
		return Search;
	}


	@FindBy(name="hotels")
	private WebElement  Hotels;
	
	@FindBy(id="room_type")
	private WebElement Roomtype;
	
	@FindBy(id="room_nos")
	private WebElement Number_of_Rooms;
	
	
	@FindBy(xpath="(//input[@type=\"text\"])[2]")
	private WebElement  Check_In_Date ;
	
	
	@FindBy(xpath="(//input[@type=\"text\"])[3]")
	private WebElement  Check_out_Date ;
	
	
	@FindBy(id = "adult_room")
	private WebElement Adults_per_Room ;
	
	
	@FindBy(id = "child_room")
	private WebElement Children_per_Room ;
	
	
	@FindBy(id = "Submit")
	private WebElement Search ;
	
	@FindBy(xpath="//input[@type=\"radio\"]")
	private WebElement Check_box;

	public WebElement getCheck_box() {
		return Check_box;
	}
	
	
}

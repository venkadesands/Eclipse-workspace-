package com.sdp;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.PomForAdactinLoginpage;
import com.adactin.pom.Pom_For_SearchHotel_Page;
import com.adactin.pom.Pom_For_select_And_Bookhotel;

public class Page_Object_Manager {

	public WebDriver driver;

	private PomForAdactinLoginpage pap;

	private Pom_For_select_And_Bookhotel psb;

	private Pom_For_SearchHotel_Page psh;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}

	public PomForAdactinLoginpage getinstancepap() {
		pap = new PomForAdactinLoginpage(driver);
		return pap;
	}

	public Pom_For_SearchHotel_Page getinstancepsh() {
		psh = new Pom_For_SearchHotel_Page(driver);
		return psh;
	}

	public Pom_For_select_And_Bookhotel getinstancepsb() {
		psb = new Pom_For_select_And_Bookhotel(driver);
		return psb;
	}

}

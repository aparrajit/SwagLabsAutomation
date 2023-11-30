package com.loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Productspage {

	WebDriver driver;

	// @FindBy(xpath = "////div[text() ='Sauce Labs Backpack']
	// /following::button[1]")
	// WebElement addtocartbtn;

	public Productspage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@Test
	public void addtocart(String productname) {

		WebElement addtocartbtn = driver
				.findElement(By.xpath("//div[text() = '" + productname + "']/following::button[1]"));
		addtocartbtn.click();
	}

}

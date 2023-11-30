package com.loginpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpageclass {

	WebDriver driver;

	@FindBy(id = "user-name")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(className = "btn_action")
	WebElement loginbtn;

	public Loginpageclass(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void loginfunction(String enteredUsername, String enteredPassword) {

		username.sendKeys(enteredUsername);
		password.sendKeys(enteredPassword);
		loginbtn.click();
	}
}

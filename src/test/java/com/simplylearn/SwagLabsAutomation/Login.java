package com.simplylearn.SwagLabsAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.loginpage.Loginpageclass;

public class Login extends BaseClass {

	@Test
	public void loginsuccesstest() {

		Loginpageclass obj = new Loginpageclass(driver);
		obj.loginfunction("standard_user", "secret_sauce");
		WebElement successmsg = driver.findElement(By.xpath("//div[@class='product_label']"));
		String Actual = successmsg.getText();
		String Expected = "Products";
		Assert.assertEquals(Actual, Expected);

	}

	@Test
	public void loginfailiuretest() {

		Loginpageclass obj = new Loginpageclass(driver);
		obj.loginfunction("standard_user", "secret_sauce1");
		WebElement errormsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String actual = errormsg.getText();
		String expected = "Epic sadface: Username and password do not match any user in this service1";
		Assert.assertEquals(actual, expected);

	}
}
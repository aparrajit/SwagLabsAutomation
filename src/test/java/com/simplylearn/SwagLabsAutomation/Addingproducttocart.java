package com.simplylearn.SwagLabsAutomation;

import org.testng.annotations.Test;

import com.loginpage.Loginpageclass;
import com.loginpage.Productspage;

public class Addingproducttocart extends BaseClass {

	@Test
	public void addingproducttocart() {
		Productspage obj1 = new Productspage(driver);
		Loginpageclass obj = new Loginpageclass(driver);

		obj.loginfunction("standard_user", "secret_sauce");
		obj1.addtocart("Sauce Labs Bike Light");

	}
}

package com.simplylearn.SwagLabsAutomation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

class BaseClass {
	WebDriver driver;

	@BeforeMethod
	public void driversetup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		driver.get("https://www.saucedemo.com/v1/");

	}

	@AfterMethod
	public void teardown() {

		driver.close();

	}

}

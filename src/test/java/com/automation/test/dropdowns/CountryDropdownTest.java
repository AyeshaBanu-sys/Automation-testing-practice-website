package com.automation.test.dropdowns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.page.dropdowns.CountryDropdownPage;
import com.automation.page.fields.EnterFieldsPage;
import com.automation.test.fields.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountryDropdownTest extends BaseTest {
	CountryDropdownPage cd;
	
	@BeforeClass//(groups= {"sanity"})
	@Parameters({ "browser" })

	public void initWebsite(@Optional("chrome") String browser) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // Setup ChromeDriver
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		cd = new CountryDropdownPage(driver); // Initialize Page Object
	}
			@Test(priority = 1)//,groups= {"sanity"})

	public void VerifyCountryDropdown() throws InterruptedException {
		cd.selectCountryByVisibleText("India");
	}
}

package com.automation.test.dropdowns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.page.datepickers.DatepickersPage;
import com.automation.page.dropdowns.AnimalsDropdownPage;
import com.automation.page.dropdowns.ColorsDropdownPage;
import com.automation.page.fields.EnterFieldsPage;
import com.automation.test.fields.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AnimalsDropdownTest extends BaseTest {
	AnimalsDropdownPage ad;

	@BeforeClass//(groups= {"smoke"})
	@Parameters({ "browser" })

	public void initWebsite(@Optional("chrome") String browser) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // Setup ChromeDriver
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		ad = new AnimalsDropdownPage(driver); // Initialize Page Object
	}
			@Test(priority = 1)//,groups= {"smoke"})

	public void VerifyAnimalsDropdown() throws InterruptedException {
		ad.scrollToElementAnimal();

		ad.selectAnimalsByVisibleText("Dog");
	}
}


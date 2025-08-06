package com.automation.test.checkbox.radiobutton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.page.checkbox.radiobutton.CheckBoxPage;
import com.automation.page.checkbox.radiobutton.SelectRadioButtonPage;
import com.automation.page.fields.EnterFieldsPage;
import com.automation.test.fields.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectRadioButtonTest extends BaseTest {
	SelectRadioButtonPage rdo;

	// WebDriver driver;
	@BeforeClass//(groups = { "smoke", "regression" })
	@Parameters({ "browser" })

	public void initWebsite(@Optional("chrome") String browser) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // Setup ChromeDriver
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		rdo = new SelectRadioButtonPage(driver); // Initialize Page Object

	}


	@Test//(groups = { "smoke", "regression" })

	public void VerifyRadiobutton() throws InterruptedException {
		rdo.ClickOnRadiobutton();
	}
}

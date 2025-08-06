package com.automation.test.datepickers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.page.checkbox.radiobutton.SelectRadioButtonPage;
import com.automation.page.datepickers.DatepickersPage;
import com.automation.page.dropdowns.CountryDropdownPage;
import com.automation.page.fields.EnterFieldsPage;
import com.automation.test.fields.BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatepickerTest extends BaseTest{
	DatepickersPage dob;
	@BeforeClass//(groups= {"smoke"})
	@Parameters({ "browser" })

	public void initWebsite(@Optional("chrome") String browser) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // Setup ChromeDriver
		driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		dob = new DatepickersPage(driver); // Initialize Page Object
	}

			@Test(priority = 1)//,groups= {"smoke"})

	public void VerifyDatePicker() throws InterruptedException {
		        dob.SelectDOB("January", "2020", "27"); // ✅ Selects 27th Jan 2002
		    }
	}



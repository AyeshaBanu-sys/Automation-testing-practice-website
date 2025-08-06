package com.automation.page.dropdowns;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.automation.page.fields.BasePage;

public class CountryDropdownPage extends BasePage {

	@FindBy(xpath = "//select[@id='country']")
	WebElement drpcountry;

	public CountryDropdownPage(WebDriver driver) {
		super(driver);

	}

	public void selectCountryByVisibleText(String string) throws InterruptedException {
		Thread.sleep(2000);
		Select selectcountry = new Select(drpcountry);
		selectcountry.selectByVisibleText("India");

	}
}

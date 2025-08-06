package com.automation.page.checkbox.radiobutton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.page.fields.BasePage;

public class SelectRadioButtonPage extends BasePage{
    WebDriver driver;

	@FindBy(xpath = "//label[text()='Female']")
	WebElement rdoFemale;

	public SelectRadioButtonPage(WebDriver driver) {
		super(driver);
	}

	public void ClickOnRadiobutton() throws InterruptedException {
		Thread.sleep(2000);
		rdoFemale.click();
	}
}


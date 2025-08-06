package com.automation.page.checkbox.radiobutton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.page.fields.BasePage;

public class CheckBoxPage extends BasePage {
	public CheckBoxPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "//label[text()='Tuesday']")
	WebElement checkbox;

	public void ClickOnCheckbox() throws InterruptedException {
		Thread.sleep(2000);
		checkbox.click();
	}
}

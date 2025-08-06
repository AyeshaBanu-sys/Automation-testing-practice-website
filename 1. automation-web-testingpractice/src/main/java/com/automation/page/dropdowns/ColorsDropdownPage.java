package com.automation.page.dropdowns;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.automation.page.fields.BasePage;

public class ColorsDropdownPage extends BasePage{
	
	public ColorsDropdownPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "//select[@id='colors']")
	WebElement scrollbarcolors;

	@FindBy(xpath = "//label[text()='Colors:']//..//select")
	WebElement drpcolors;

	public void scrollToElementColors() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", drpcolors);
	}

	public void selectColorByVisibleText(String string) throws InterruptedException {
		Thread.sleep(2000);
		Select selectcolor = new Select(drpcolors);
		selectcolor.selectByVisibleText(string);
	}

}

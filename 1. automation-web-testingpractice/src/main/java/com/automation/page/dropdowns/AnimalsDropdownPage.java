package com.automation.page.dropdowns;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.automation.page.fields.BasePage;

public class AnimalsDropdownPage extends BasePage{

	public AnimalsDropdownPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//select[@id='animals']")
	WebElement ScrollbarAnimals;
	
	@FindBy(xpath = "//label[text()='Sorted List:']//..//select")
	WebElement drpAnimals;	
	
	public void scrollToElementAnimal() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", drpAnimals);
	}
public void selectAnimalsByVisibleText(String string) throws InterruptedException {
	Thread.sleep(2000);
	//scrollToElement(drpAnimals);
	Select selectAnimal = new Select(drpAnimals);
	selectAnimal.selectByVisibleText(string);

}
}


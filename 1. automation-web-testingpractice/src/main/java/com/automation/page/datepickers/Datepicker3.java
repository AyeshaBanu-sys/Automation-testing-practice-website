package com.automation.page.datepickers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.automation.page.fields.BasePage;

public class Datepicker3 extends BasePage{

	@FindBy(xpath="//input[@id='start-date']")
	WebElement btnStartDate;
	
	
	
	
	
	
	
	
	
	
	
	public Datepicker3(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
}

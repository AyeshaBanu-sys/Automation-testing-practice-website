package com.automation.page.fields;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EnterFieldsPage extends BasePage{
	@FindBy(xpath = "//input[@id='name']")
	WebElement txtName;

	@FindBy(xpath = "//input[@id='email']")
	WebElement txtEmail;

	@FindBy(xpath = "//input[@id='phone']")
	WebElement txtNumber;

	@FindBy(xpath = "//textarea[@id='textarea']")
	WebElement txtAddress;

	 public EnterFieldsPage(WebDriver driver) {
	        super(driver);
	    }

	public void VerifyNameField(String Name) throws InterruptedException {
		//Thread.sleep(2000);
		txtName.sendKeys(Name);
	}

	public void VerifyEmailField(String Email) throws InterruptedException {
		//Thread.sleep(2000);
		txtEmail.sendKeys(Email);
	}

	public void VerifyNumberField(String Number) throws InterruptedException {
		//Thread.sleep(2000);
		txtNumber.sendKeys(Number);
	}

	public void VerifyAddressField(String Address) throws InterruptedException {
	//	Thread.sleep(2000);
		txtAddress.sendKeys(Address);
	}	@Override
	public void takeScreenshot() throws IOException {
        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File("screenshots/login.png"));
        System.out.println("Screenshot saved as login.png");
	}
}



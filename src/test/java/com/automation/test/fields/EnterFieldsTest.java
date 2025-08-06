
package com.automation.test.fields;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automation.page.checkbox.radiobutton.SelectRadioButtonPage;
import com.automation.page.fields.BasePage;
import com.automation.page.fields.EnterFieldsPage;

import io.github.bonigarcia.wdm.WebDriverManager;

//@Test(groups= {"all"})
//ignore tests in class level
//@Ignore
public class EnterFieldsTest extends BaseTest{
	EnterFieldsPage gui;
    //WebDriver driver;

	@BeforeClass//(groups= {"smoke"})
	@Parameters({ "browser" })

	public void initWebsite(@Optional("chrome") String browser) throws InterruptedException {
		WebDriverManager.chromedriver().setup(); // Setup ChromeDriver
		 driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.navigate().to("https://testautomationpractice.blogspot.com/");
		 gui  = new EnterFieldsPage(driver);  

	}
	
	//@Test(groups= {"smoke"})
	//Ignoring tests or skip execution
	//@Test(enabled=false)   or
	//@Ignore
	@Test
	public void VerifyGUIElements() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(loginButton));

		gui.VerifyNameField("Ayesha banu");
		gui.VerifyEmailField("abanu6519@gmail.com");
		gui.VerifyNumberField("9573377982");
		gui.VerifyAddressField("Near railway station area, Bellampalli");
		gui.takeScreenshot();
	}
	
	
}


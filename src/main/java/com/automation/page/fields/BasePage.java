package com.automation.page.fields;

	import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

	public class BasePage {
	    protected static WebDriver driver;

	    public BasePage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements( driver, this);
	    }
	    
	    public void scrollToElement(WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	    public void takeScreenshot() throws IOException {
	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(srcFile, new File("screenshots/default.png"));
	        System.out.println("Screenshot saved as default.png");
	    
		}
	}


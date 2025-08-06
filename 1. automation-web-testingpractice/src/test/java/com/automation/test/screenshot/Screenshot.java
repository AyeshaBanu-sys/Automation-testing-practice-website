package com.automation.test.screenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;

public class Screenshot {
public static void main (String[] args) throws IOException {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver .get("https://testautomationpractice.blogspot.com/");
driver.manage().window().maximize();

//FULL SCREENSHOT
TakesScreenshot ts = (TakesScreenshot) driver;
File file = ts.getScreenshotAs(OutputType.FILE);
	File trgt=	new File(".\\Screenshots\\screenshot.png");
		FileUtils.copyFile(file, trgt);

}

public void saveScreenshotPNG(String screenshotType, WebDriver driver) {
	 
	/*
	 * Allure.addAttachment(screenshotType + UUID.randomUUID().toString(), new
	 * ByteArrayInputStream(((TakesScreenshot)
	 * driver).getScreenshotAs(OutputType.BYTES)));
	 */
	byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	Allure.getLifecycle().addAttachment(
			screenshotType + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yy_hh:mm:ss")),
			"image/png", "png", screenshot);
}
}

//SPECIFIC SECTION SCREENSHOT
//WebElement Filedsection=driver.findElement(By.xpath("(//div[@class='form-group'])[1]"));
//File file = Filedsection.getScreenshotAs(OutputType.FILE);
//File trgt=	new File(".\\Screenshots\\Filedsection.png");
//	FileUtils.copyFile(file, trgt);


//Element screenshot
//	WebElement Header=driver.findElement(By.xpath("//div[@id='header-inner']"));
//	File file = Header.getScreenshotAs(OutputType.FILE);
//	File trgt=	new File(".\\Screenshots\\Header.png");
//		FileUtils.copyFile(file, trgt);
//}
//}

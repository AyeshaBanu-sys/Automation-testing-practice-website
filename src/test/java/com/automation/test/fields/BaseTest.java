package com.automation.test.fields;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {
	 public WebDriver driver;

	    @Parameters("browser")
	    public void setup(String browser) {
	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        }
	        driver.get("https://testautomationpractice.blogspot.com/");
	        driver.manage().window().maximize();
	    }
	    public void tearDown() {
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	    
}


//protected static WebDriver driver;
//protected static WebDriverWait wait;

//@BeforeSuite
////public void setUp() {
////    if (driver == null) {
////        WebDriverManager.chromedriver().setup();
////        driver = new ChromeDriver();
////        driver.manage().window().maximize();
////        System.out.println("Browser launched successfully.");
////    }
//    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//    wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//}
//
//@AfterSuite
//public void tearDown() {
//    if (driver != null) {
//        driver.quit(); // Close browser after all tests
//        System.out.println("Browser closed after all tests.");
//        driver = null;
//    }
//}
//}

//public class BaseTest {
//	protected static WebDriver driver;
//	protected static WebDriverWait wait;
//
//	@BeforeSuite
//	@Parameters({ "siteURL" })
//	public void setUp(@Optional("https://testautomationpractice.blogspot.com/") String siteURL) {
//		if (driver == null) {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.get(siteURL);
//			System.out.println("Browser launched and navigated to: " + siteURL);
//		
//			
//		}
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//			wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//
//		}
//	
//
//	@AfterSuite
//	public void tearDown() {
//		if (driver != null) {
//			// driver.quit();
//			System.out.println("Browser closed after all tests.");
//			driver = null;
//		}
//	}
//}

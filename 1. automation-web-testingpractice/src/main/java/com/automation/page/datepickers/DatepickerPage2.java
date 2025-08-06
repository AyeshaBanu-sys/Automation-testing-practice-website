//package com.automation.page.datepickers;
//
//import java.time.Duration;
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import com.automation.page.fields.BasePage;
//
//public class DatepickerPage2 extends BasePage {
//
//	public DatepickerPage2(WebDriver driver) {
//		super(driver);
//	}
//
//    
//	@FindBy(xpath="//input[@id='txtDate']")
//	WebElement datePickerField;
//
//	@FindBy(xpath ="//select[@aria-label='Select year']")
//
//			//"//select[@class='ui-datepicker-year']")
//	WebElement yearDropdown;
//
//	@FindBy(xpath = "//select[@class='ui-datepicker-month']")
//	WebElement monthDropdown;
//
//	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a")
//	List<WebElement> allDays;
//
//	// ✅ Open the date picker
//	public void openDatePicker() {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//
//	    WebElement datePicker = wait.until(ExpectedConditions.elementToBeClickable(datePickerField));
//	    datePicker.click();
//	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@aria-label='Select year']")));
//
//	}	
//	
//	
//	// ✅ Select the correct date dynamically
//	public void selectDate(String month, String year, String day) throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	    wait.until(ExpectedConditions.visibilityOf(datePickerField));
//
//	    if (!yearDropdown.isDisplayed()) { // Check if datepicker is already open
//		openDatePicker(); // Open the date picker
//
//		
//		// ✅ Select Year
//	    wait.until(ExpectedConditions.visibilityOf(yearDropdown));
//		Select selectYear = new Select(yearDropdown);
//		selectYear.selectByVisibleText("2021");
//
//		// ✅ Select Month
//	    wait.until(ExpectedConditions.visibilityOf(monthDropdown));
//		Select selectMonth = new Select(monthDropdown);
//		selectMonth.selectByVisibleText("Mar");
//
//		// ✅ Select Day
//		for (WebElement dayElement : allDays) {
//			if (dayElement.getText().equals("10")) {
//				dayElement.click();
//				break;
//			}
//		}
//
//		System.out.println("Successfully selected: " + month + " " + day + ", " + year);
//	}
//	}
//}

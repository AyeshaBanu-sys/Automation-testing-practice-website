package com.automation.page.datepickers;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.automation.page.fields.BasePage;

public class DatepickersPage extends BasePage {

	@FindBy(xpath = "//input[@id='datepicker']")
	WebElement drpDatepickerfield;

	@FindBy(xpath = "//span[@class='ui-datepicker-month']")
	WebElement drpMonth;

	@FindBy(xpath = "//span[@class='ui-datepicker-year']")
	WebElement drpYear;

	@FindBy(xpath = "//span[@class='ui-icon ui-icon-circle-triangle-w']")
	WebElement btnPrev;

	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a")
	List<WebElement> alldays;

	public DatepickersPage(WebDriver driver) {
		super(driver);

	}

	public void OpenDatePicker() {
		drpDatepickerfield.click();
	}

	public void SelectDOB(String Month, String Year, String Date) {
		OpenDatePicker();
		while (true) {
			String month = drpMonth.getText();
			String year = drpYear.getText();
			if (month.equals(Month) && year.equals(Year)) {
				break;
			} else {
				btnPrev.click();
			}
		}
		for (WebElement day : alldays) {
			String dayText = day.getText();
			if (dayText.equals(Date)) {
				day.click();
				break;
			}

		}
	}

}

//	
//	 public DatepickersPage(WebDriver driver) {
//		super(driver);
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
//
//	}
//
//	 WebDriver driver;
//	    WebDriverWait wait;
//
//	    //  Find the date picker input field
//	    @FindBy(id = "datepicker")
//	     WebElement datePickerField;
//
//	    // Find the year dropdown
//	    @FindBy(className = "ui-datepicker-year")
//	    WebElement yearDropdown;
//
//	    //  Find the month dropdown
//	    @FindBy(className = "ui-datepicker-month")
//	 WebElement monthDropdown;
//
//	    //  Find the previous button to navigate back in the calendar
//	    @FindBy(className = "ui-datepicker-prev")
//	    WebElement prevButton;
//	    
//	    // ✅ Find all day elements in the date picker
//	    @FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a")
//	    private List<WebElement> allDays;
//	    
//	    //  Open the date picker
//	    public void openDatePicker() {
//	        wait.until(ExpectedConditions.elementToBeClickable(datePickerField)).click();
//	    }
//
//	    //  Select a date dynamically
//	    public void selectDob(String month, String year, String day) {
//	        // Step 1: Click to open the calendar
//	        openDatePicker();
//
//
//	        // Step 2: Select the year
//	        while (true) {
//	            WebElement yearElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-year")));
//	            if (yearElement.getText().equals(year)) {
//	                break; // Stop when the correct year is found
//	            }
//	            prevButton.click(); // Click "previous" to go back in years
//	        }
//
//	        // Step 3: Select the month
//	        while (true) {
//	            WebElement monthElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-month")));
//	            if (monthElement.getText().equals(month)) {
//	                break; // Stop when the correct month is found
//	            }
//	            prevButton.click(); // Click "previous" to go back in months
//	        }
//
//	        // Step 4: Select the day
//	        // ✅ Select the correct day using `@FindBy`
//	        for (WebElement dayElement : allDays) {
//	            if (dayElement.getText().equals(day)) {
//	                wait.until(ExpectedConditions.elementToBeClickable(dayElement)).click();
//	                break;
//	            }
//	        }
//	        System.out.println("Successfully selected: " + month + " " + day + ", " + year);
//	    }
//	}
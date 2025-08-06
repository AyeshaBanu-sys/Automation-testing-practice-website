package com.automation.test.reports;

import java.util.HashMap;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsManager implements ITestListener {

    private static ExtentReports extent = new ExtentReports();
    private static ExtentSparkReporter sparkReporter;
    private static Map<String, ExtentTest> testMap = new HashMap<>();

    @Override
    public void onStart(ITestContext context) {
        if (sparkReporter == null) {
        	String timeStamp = new java.text.SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new java.util.Date());
        	String reportFile = System.getProperty("user.dir") + "/Reports/Extent_Report_" +timeStamp+".html";
        	sparkReporter = new ExtentSparkReporter(reportFile);

            
            sparkReporter.config().setDocumentTitle("Automation Report");
            sparkReporter.config().setReportName("Test Execution Report");
            sparkReporter.config().setTheme(Theme.DARK);

            extent.attachReporter(sparkReporter);
            extent.setSystemInfo("Tester", "Ayesha");
            extent.setSystemInfo("Environment", "QA");
            String browser = context.getCurrentXmlTest().getParameter("browser");
            extent.setSystemInfo("Browser", browser);
        }
    }

    @Override
    public void onTestStart(ITestResult result) {
        String testName = result.getTestClass().getName() + " - " + result.getMethod().getMethodName();
        ExtentTest test = extent.createTest(testName);
        testMap.put(result.getMethod().getMethodName(), test); // Associate ExtentTest with the method
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentTest test = testMap.get(result.getMethod().getMethodName());
        if (test != null) {
            test.log(Status.PASS, "Test Passed");
        }
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentTest test = testMap.get(result.getMethod().getMethodName());
        if (test != null) {
            test.log(Status.FAIL, "Test Failed: " + result.getThrowable());
        }
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentTest test = testMap.get(result.getMethod().getMethodName());
        if (test != null) {
            test.log(Status.SKIP, "Test Skipped");
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        if (extent != null) {
            extent.flush(); // Only flush once at the end of the whole suite
        }
    }

}

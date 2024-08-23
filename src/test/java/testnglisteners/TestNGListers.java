package testnglisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import utils.ExtentReporter;
import webdriver.WebDriverManager;

public class TestNGListers implements ITestListener {

    public void onTestStart(ITestResult result) {
        WebDriverManager.initBrowser("chrome");
    }

    public void onTestSuccess(ITestResult result) {
        WebDriverManager.getDriver().close();
    }

    public void onTestFailure(ITestResult result) {
        WebDriverManager.getDriver().close();
    }

    public void onTestSkipped(ITestResult result) {
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        WebDriverManager.getDriver().close();
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        ExtentReporter.initReport();
    }

    public void onFinish(ITestContext context) {
        ExtentReporter.endReport();
    }
}

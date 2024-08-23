package utils;

import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.time.Duration;

import static webdriver.WebDriverManager.getDriver;


public class CommonMethods {

    WebDriverWait wait=new WebDriverWait(getDriver(),Duration.ofSeconds(30));

    public void clickElement(WebElement ele){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(ele));
            ele.click();
            //ExtentReporter(Status.INFO,ele+" is clicked");
        }catch (Exception e){
            //ExtentReporter(Status.FAIL,ele+" is not clicked "+e.getMessage());
        }
    }

    public void sendTextToElement(WebElement ele,String value){
        try{
            wait.until(ExpectedConditions.visibilityOf(ele));
            ele.sendKeys(value);
           //ExtentReporter(Status.INFO,value+" is Entered");
        }catch (Exception e){
            //ExtentReporter(Status.FAIL,value+"Unable to enter a value "+e.getMessage());
        }
    }

    public void selectValueFromDropDown(WebElement ele,String value){
        try {
            Select sel = new Select(ele);
            sel.selectByVisibleText(value);
            //ExtentReporter(Status.INFO,value+" is selected from dropdown");
        }catch (Exception e){
            //ExtentReporter(Status.INFO,"Unable to select "+value+" "+e.getMessage());
        }
    }

    public static String takeScreenShot()  {
        try {
            TakesScreenshot screenshot = ((TakesScreenshot) getDriver());
            File file = screenshot.getScreenshotAs(OutputType.FILE);
            File destFine = new File(ExtentReporter.reportPath + file.getName());
            FileUtils.copyFile(file, destFine);
            return file.getName();
        }catch (Exception e){
            //ExtentReporter(Status.FAIL,"Unable to take screenshot "+e.getMessage());
            return null;
        }
    }

    public void waitForElement(int sec){
        try{
            Thread.sleep(sec*1000L);
        }catch (Exception e){

        }
    }

    public void fluentWait(WebElement ele){
        FluentWait fluentWait=new FluentWait<>(getDriver());
        fluentWait.withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);
        ele.click();
    }
}

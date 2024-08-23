package pom;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;
import utils.ExtentReporter;
import utils.TestData;

import static webdriver.WebDriverManager.getDriver;

public class ChekOutPage extends InitElements{

    @FindBy(id="first-name")
    public WebElement firstName;
    @FindBy(id="last-name")
    public WebElement lastname;
    @FindBy(id="postal-code")
    public WebElement postalCode;
    @FindBy(id="checkout")
            public WebElement checkoutBtn;
    @FindBy(id="continue")
            public WebElement continueBtn;
    CommonMethods methods=new CommonMethods();

    public void enterCheckOutDetails(){
        methods.waitForElement(2);
        methods.clickElement(checkoutBtn);
        methods.waitForElement(2);
        methods.sendTextToElement(firstName, TestData.getData("FirstName"));
        methods.sendTextToElement(lastname,TestData.getData("LastName"));
        methods.sendTextToElement(postalCode,TestData.getData("PostalCode"));
        methods.clickElement(continueBtn);
        ExtentReporter.logWithScreenShot(Status.PASS,"Checkout is completed");
    }

}

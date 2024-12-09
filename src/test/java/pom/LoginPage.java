package pom;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;
import utils.ConfigManager;
import utils.ExtentReporter;
import utils.TestData;

import java.util.List;

public class LoginPage extends InitElements {

    @FindBy(id = "user-name")
    public WebElement userNameTxt;
    @FindBy(name = "password")
    public WebElement passwordTxt;
    @FindBy(id = "login-button")
    public WebElement loginBtn;
    @FindBy(xpath="//a[@id='item_4_title_link']/div")
            public WebElement inventoryItem;
    @FindBy(xpath = "//div[@class='c-landing-page-card__top']/div[@class='c-landing-page-card__content d-flex']/div[1]/div")
            public List<WebElement> cartDetails;
    CommonMethods methods = new CommonMethods();


    public void loginToThePage() {
        methods.sendTextToElement(userNameTxt, ConfigManager.getProperty("USERNAME"));
        methods.sendTextToElement(passwordTxt, ConfigManager.getProperty("PASSWORD"));
        methods.clickElement(loginBtn);
    }

    public void enterdetails(){
        boolean cartDetail=false;
        for(WebElement ele:cartDetails){
            if(ele.getText().equals(TestData.getData("SourceName"))){
                cartDetail=true;
            }
        }
        if(cartDetail){
            ExtentReporter.log(Status.PASS,"");
        }else {
            ExtentReporter.log(Status.FAIL,"");
        }
    }


    public void validateHomePage() {
        methods.takeScreenShot();
    }
}

package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;
import utils.ConfigManager;

public class LoginPage extends InitElements {

    @FindBy(id = "user-name")
    public WebElement userNameTxt;
    @FindBy(name = "password")
    public WebElement passwordTxt;
    @FindBy(id = "login-button")
    public WebElement loginBtn;
    @FindBy(xpath="//a[@id='item_4_title_link']/div")
            public WebElement inventoryItem;
    CommonMethods methods = new CommonMethods();


    public void loginToThePage() {
        methods.sendTextToElement(userNameTxt, ConfigManager.getProperty("USERNAME"));
        methods.sendTextToElement(passwordTxt, ConfigManager.getProperty("PASSWORD"));
        methods.clickElement(loginBtn);
    }

    public void validateHomePage() {
        methods.takeScreenShot();
    }
}

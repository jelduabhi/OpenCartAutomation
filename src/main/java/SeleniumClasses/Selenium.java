package SeleniumClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import pom.ChekOutPage;
import pom.LoginPage;
import pom.ProductsPage;
import utils.TestData;
import webdriver.WebDriverManager;

import java.io.IOException;
import java.util.List;

public class Selenium{
    static String browserName="Chrome";
   static WebDriverManager driverManager=new WebDriverManager();

    public static void main(String[] args) throws InterruptedException, IOException {
       // driverManager.initBrowser(browserName);
        TestData.readTestData("TC003");
        LoginPage loginPage = new LoginPage();
    }
}

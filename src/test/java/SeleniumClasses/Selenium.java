package SeleniumClasses;


import pom.LoginPage;
import utils.TestData;
import webdriver.WebDriverManager;

import java.io.IOException;

public class Selenium{
    static String browserName="Chrome";
   static WebDriverManager driverManager=new WebDriverManager();

    public static void main(String[] args) throws InterruptedException, IOException {
       // driverManager.initBrowser(browserName);
        TestData.readTestData("TC003");
        LoginPage loginPage = new LoginPage();
    }
}

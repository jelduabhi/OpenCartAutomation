package testngclasses;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.ChekOutPage;
import pom.LoginPage;
import pom.ProductsPage;
import utils.TestData;
import webdriver.WebDriverManager;

public class TestNG {

//    @BeforeMethod
//    public void init(){
//        WebDriverManager.initBrowser("chrome");
//        LoginPage loginPage=new LoginPage();
//        loginPage.loginToThePage();
//    }
//    @Test
//    public void validateUserIsAbleToLoginWithValidCredentials(){
//        TestData.readTestData("TC001");
//    }
//
//    @Test
//    public void validateUserIsAbleToCheckoutTheProduct(){
//        ProductsPage productsPage=new ProductsPage();
//        ChekOutPage chekOutPage=new ChekOutPage();
//        TestData.readTestData("TC001");
//        productsPage.addProduct();
//        chekOutPage.enterCheckOutDetails();
//    }
//
//    @Test
//    public void validateUserIsAbleToAddTheProduct(){
//        TestData.readTestData("TC001");
//        Assert.fail();
//    }
//
//    @AfterMethod
//    public void tearDown(){
//        WebDriverManager.getDriver().quit();
//    }
}

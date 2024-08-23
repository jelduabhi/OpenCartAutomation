package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.ChekOutPage;
import pom.LoginPage;
import pom.ProductsPage;
import utils.TestData;
import webdriver.WebDriverManager;

import java.io.IOException;


public class StepDefinitions_Login extends WebDriverManager{
     ProductsPage productsPage = new ProductsPage();
    LoginPage loginPage=new LoginPage();
    ChekOutPage chekOutPage=new ChekOutPage();


    @When("user enters valid credentials {string}")
    public void user_enters_valid_credentials(String testCaseID) {
        TestData.readTestData(testCaseID);
        loginPage.loginToThePage();
    }

    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.loginToThePage();
    }

    @Then("home page should be displayed")
    public void home_page_should_be_displayed() {
        loginPage.validateHomePage();
    }

    @And("user add the product {string}")
    public void user_add_the_product(String testCaseID) {
        TestData.readTestData(testCaseID);
        productsPage.addProduct();
    }
    @Then("product should be added to the cart")
    public void product_should_be_added_to_the_cart() throws IOException {
        productsPage.varifyPriceWithFilter();
    }

    @Then("user should be checkout the product")
    public void user_should_be_checkout_the_product() {
        chekOutPage.enterCheckOutDetails();
    }
}

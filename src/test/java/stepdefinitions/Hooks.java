package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import utils.CommonMethods;
import utils.ExtentReporter;
import webdriver.WebDriverManager;

public class Hooks {

    public static Scenario scenario;
    CommonMethods methods=new CommonMethods();
    WebDriverManager driverManager=new WebDriverManager();

    @Parameters("Browser")
    @BeforeTest
    public void initBrowser(String browser){
        WebDriverManager.browserName=browser;
    }
    @Before
    public void initScenario(Scenario sce){
        Hooks.scenario=sce;
        ExtentReporter.initTest(sce.getName());
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            scenario.attach(methods.takeScreenShot(),"image/png",Hooks.scenario.getName());
        }
    }
}

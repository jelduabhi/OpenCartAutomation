package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;
import utils.ExtentReporter;
import webdriver.WebDriverManager;

import static webdriver.WebDriverManager.getDriver;

public class Hooks {

    public static Scenario scenario;
    CommonMethods methods=new CommonMethods();
    WebDriverManager driverManager=new WebDriverManager();

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

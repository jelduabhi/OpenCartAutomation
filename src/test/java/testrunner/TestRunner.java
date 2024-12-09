package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "src\\test\\resources\\TestCases",
        glue = "stepdefinitions",
        tags = "${cucumber.filter.tags}",
       plugin = {"pretty","html:target\\CucumberReport\\report.html"}
        //plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"}
)
public class TestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}

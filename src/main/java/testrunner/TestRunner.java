package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src\\main\\resources\\TestCases",
        glue = "stepdefinitions",
        tags = "${cucumber.filter.tags}",
        plugin = {"pretty","html:target\\CucumberReport\\report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}

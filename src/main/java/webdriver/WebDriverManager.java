package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.CommonMethods;
import utils.ConfigManager;

import java.time.Duration;

public class WebDriverManager {


    static public WebDriver driver;

    public static void initBrowser(String browserName) {
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if ("Edge".equalsIgnoreCase(browserName)) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        driver.get(ConfigManager.getProperty("URL"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static WebDriver getDriver(){
        return driver;
    }
    public void closeCurrentBrowser(){
        driver.close();
    }

    public void closeAllBrowsers(){
        driver.quit();
    }
}

package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import utils.CommonMethods;
import utils.ConfigManager;

import java.time.Duration;

public class WebDriverManager {

static ThreadLocal<WebDriver>driver=new ThreadLocal<>();

public static  String browserName="Chrome";
byte a='c';

    public static void initBrowser() {
        if (browserName.equalsIgnoreCase("Chrome")) {
            driver.set(new ChromeDriver());
            driver.get().manage().window().maximize();
        } else if ("Edge".equalsIgnoreCase(browserName)) {
            driver.set(new EdgeDriver());
            driver.get().manage().window().maximize();
        }
        driver.get().get(ConfigManager.getProperty("URL"));
        driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static WebDriver getDriver(){
        return driver.get();
    }
    public void closeCurrentBrowser(){
        driver.get().close();
    }

    public void closeAllBrowsers(){
        driver.get().quit();
    }
}

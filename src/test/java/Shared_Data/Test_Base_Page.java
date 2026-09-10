package Shared_Data;

import Shared_Data.Browser.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Test_Base_Page {
    private WebDriver driver;

    @BeforeMethod
    public void initialiseBrowser() {
        driver = new BrowserFactory().getBrowserFactory();
        driver.get("https://demoqa.com/");

    }

    @AfterMethod
    public void clearBrowser() {//mostenirea
        driver.quit();
    }

    public WebDriver getDriver() {//incapsularea
        return driver;
    }
}

package Tests;

import Pages.AlertsPage;
import Pages.CommonPage;
import Pages.HomePage;
import Shared_Data.Test_Base_Page;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertTest extends Test_Base_Page {


    @Test
    public void metodaTest()throws InterruptedException {


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");


//        WebDriver driver = new ChromeDriver(options);
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com");

        JavascriptExecutor js = (JavascriptExecutor) getDriver();


        js.executeScript("window.scrollBy(0, 200);");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnAlertsButton();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Alerts");


//        List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
//        cardList.get(2).click();

//        js.executeScript("window.scrollBy(0, 200);");
//        List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
//        elementsList.get(1).click();

//        WebElement alertButton = driver.findElement(By.id("alertButton"));
//        WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
//        WebElement confirmButton = driver.findElement(By.id("confirmButton"));
//        WebElement promtButton = driver.findElement(By.id("promtButton"));

//         alertButton.click();
//         Alert alertOk = driver.switchTo().alert();
//         alertOk.accept();


        AlertsPage alertsPage = new AlertsPage(getDriver());
        alertsPage.dealWithAlertOk();
        alertsPage.dealAlertDelay(5);
        alertsPage.alertConfirm();
        alertsPage.alertPromt("bun");

      /*  timerAlertButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert5Seconds = driver.switchTo().alert();
        alert5Seconds.accept();


        wait.until(ExpectedConditions.elementToBeClickable(confirmButton));
        confirmButton.click();
        Alert alertconfirm = driver.switchTo().alert();
        alertconfirm.dismiss();


        promtButton.click();
        Alert promtConfirm = driver.switchTo().alert();
        promtConfirm.sendKeys("test");
        promtConfirm.accept();*/




        //getDriver-returneaza Webdriver

    }
}

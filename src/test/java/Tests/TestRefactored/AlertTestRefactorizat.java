package Tests.TestRefactored;

import Pages.AlertsPage;
import Pages.CommonPage;
import Pages.HomePage;
import Shared_Data.Test_Base_Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AlertTestRefactorizat extends Test_Base_Page {

    @Test
    public void metodaTest() throws InterruptedException {

//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");

        JavascriptExecutor js = (JavascriptExecutor) getDriver();

        js.executeScript("window.scrollBy(0, 200);");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnAlertsButton();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Alerts");

        AlertsPage alertsPage = new AlertsPage(getDriver());
        alertsPage.dealWithAlertOk();
        alertsPage.dealAlertDelay(5);
        alertsPage.alertConfirm();
        alertsPage.alertCancel();
        alertsPage.alertPromt("bun");

    }
}
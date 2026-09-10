package Tests;

import ObjectData.TextBoxObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.TextBoxPage;
import Shared_Data.Test_Base_Page;
import XmlReader.XmlDataLoader;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Map;

public class TextBoxRe extends Test_Base_Page {
    private Map<String, TextBoxObject> textBoxObjectMap;

    @Test
    public void metodaTest() {

        textBoxObjectMap = XmlDataLoader.loadData("C:\\Users\\glore\\IdeaProjects\\AutomationTestingFramework\\src\\test\\resources\\TextBoxData.xml", TextBoxObject.class);
        TextBoxObject data = textBoxObjectMap.get("dataSet_1");



        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");

//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://demoqa.com/");

        String fullName = "Arianda Burz";
        String email = "ariandatest@yahoo.com";
        String currentAddress = "Take1";
        String permanentAddress = "Take2";

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();
        //HomePage homePage = new HomePage(driver);

        //homePage.clickElements();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Text Box");

        TextBoxPage textBoxPage = new TextBoxPage(getDriver());
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0, 200);");
       // textBoxPage.fillForm(fullName, email, currentAddress, permanentAddress);

        //textBoxPage.verifyEntry(fullName, email, currentAddress, permanentAddress);

        getDriver().quit();
    }
}


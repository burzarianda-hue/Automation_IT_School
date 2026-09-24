package Tests.TestRefactored;


import ObjectData.PracticeFormObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.PracticeFormPage;
import Shared_Data.Test_Base_Page;
import XmlReader.XmlDataLoader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Map;

public class PracticeFormTestRefactorizat extends Test_Base_Page {

    private Map<String, PracticeFormObject> PracticeFormObjectMap;

    @Test
    public void metodaTest() throws InterruptedException {
        //ChromeOptions options = new ChromeOptions();

       // options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");

       // WebDriver driver = new ChromeDriver(options);//options in paranteza


        PracticeFormObjectMap = XmlDataLoader.loadData("C:\\Automation-Programare\\Automatizare_IT_Scool\\src\\test\\resources\\PracticeFormData.xml", PracticeFormObject.class);
        PracticeFormObject data = PracticeFormObjectMap.get("dataSet_1");


        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        HomePage homePage = new HomePage(getDriver());
        //js.executeScript("window.scrollBy(0, 200);");
        homePage.clickForms();


        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Practice Form");

        PracticeFormPage practiceFormPage = new PracticeFormPage(getDriver());
        practiceFormPage.completeFirstRegionField(data);
        practiceFormPage.completeGender(data);
        practiceFormPage.uploadPicture();
        practiceFormPage.completeStatesAndCity(data);
        practiceFormPage.completeHobbies(data);
        practiceFormPage.completeCalendar(data);
        practiceFormPage.submit();
    }
}




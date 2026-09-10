package Tests.TestRefactored;

import ObjectData.TextBoxObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.TextBoxPage;
import Shared_Data.Test_Base_Page;
import XmlReader.XmlDataLoader;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.Map;

import static java.sql.DriverManager.getDriver;

public class TextBoxRefactorizat extends Test_Base_Page {
    private Map<String, TextBoxObject> textBoxObjectMap;

    @Test
    public void metodaTest() {

        textBoxObjectMap = XmlDataLoader.loadData("C:\\Automation-Programare\\Automatizare_IT_Scool\\src\\test\\resources\\TextBoxData.xml", TextBoxObject.class);
        TextBoxObject data = textBoxObjectMap.get("dataSet_1");


//        String userName = "Arianda Burz";
//        String userEmail = "ariandatest@yahoo.com";
//        String currentAddress = "Take1";
//        String permanentAddress = "Take2";

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Text Box");


        TextBoxPage  textBoxPage = new TextBoxPage(getDriver());
        js.executeScript("window.scrollBy(0, 200);");
        textBoxPage.entryTextBox(data);

        textBoxPage.dateinserate();

        textBoxPage.verificareEntryText(data);

    }
}
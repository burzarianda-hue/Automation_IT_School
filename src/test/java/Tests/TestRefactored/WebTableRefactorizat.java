package Tests.TestRefactored;

import ObjectData.TextBoxObject;
import ObjectData.WebTableObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import Shared_Data.Test_Base_Page;
import XmlReader.XmlDataLoader;
import com.aventstack.chaintest.plugins.ChainTestListener;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Map;

@Listeners(ChainTestListener.class)
public class WebTableRefactorizat extends Test_Base_Page {

    private Map<String, WebTableObject> webTableObjectMap;


    @Test
    public void metodaTest() throws InterruptedException {

        webTableObjectMap = XmlDataLoader.loadData("C:\\Automation-Programare\\Automatizare_IT_Scool\\src\\test\\resources\\WebTableData.xml",WebTableObject.class);
        WebTableObject data = webTableObjectMap.get("dataSet_1");
       // WebTableObject data2 = webTableObjectMap.get("dataSet_2");


//        String firstName = "Arianda";
//        String lastName = "Burz";
//        String age = "30";
//        String email = "ari@yahoo.com";
//        String salary = "1000";
//        String department = "IT test";

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        HomePage homePage = new HomePage (getDriver());
        homePage.clickElements();

        ChainTestListener.log("The user clicked on Elements button");

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Web Tables");

        ChainTestListener.log("The user clicked on Submenu");

        WebTablesPage webTablesPage = new WebTablesPage(getDriver());
        webTablesPage.addEntry(data);

        ChainTestListener.log("The user added an full entry");

        WebElement rowAdded = getDriver().findElement(By.xpath("(//tr)[5]"));
        String rowAddedText = rowAdded.getText();
        System.out.println(rowAddedText);

        webTablesPage.verifyEntry(data);

        ChainTestListener.log("All entries were verified");
        //webTablesPage.verifyEntry(data2);
        //ChainTestListener.embed(bytes "image/png"); unde trebuie pus pentru screenshots, in Test_Base_Page, in metoda clearBrowswer;


    }
}



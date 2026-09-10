package Tests.TestRefactored;

import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import Shared_Data.Test_Base_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableRefactorizat extends Test_Base_Page {

    @Test
    public void metodaTest() throws InterruptedException {

        String firstName = "Arianda";
        String lastName = "Burz";
        String age = "30";
        String email = "ari@yahoo.com";
        String salary = "1000";
        String department = "IT test";

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0, 200);");
        HomePage homePage = new HomePage (getDriver());
        homePage.clickElements();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Web Tables");

        WebTablesPage webTablesPage = new WebTablesPage(getDriver());

        webTablesPage.addEntry(firstName, lastName, email, age, salary, department);
        webTablesPage.addEntry("Jon", "Ion", "jon@yahoo.com", "35", "10000", "IT manual");//ex

        webTablesPage.verifyEntry(firstName, lastName, email, age, salary, department);


    }
}



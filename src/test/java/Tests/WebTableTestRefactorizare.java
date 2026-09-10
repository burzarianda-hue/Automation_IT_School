package Tests;

import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableTestRefactorizare {


    @Test
    public void metodaTest() throws InterruptedException {
        //ChromeOptions options = new ChromeOptions();

        // options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");
        WebDriver driver = new ChromeDriver();//options
        //WebDriver driver = new ChromeDriver(); // se acceseaza Chrome
        driver.manage().window().maximize(); // maximizeaza fereastra
        driver.get("https://demoqa.com/"); // acceseaza https://demoqa.com/

        String firstName = "Arianda";
        String lastName = "Burz";
        String age = "30";
        String email = "ari@yahoo.com";
        String salary = "1000";
        String department = "IT test";

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200);");
        HomePage homePage = new HomePage(driver);
        homePage.clickElements();

        CommonPage commonPage = new CommonPage(driver);
        commonPage.clickOnSubMenu("Web Tables");

        WebTablesPage webTablesPage = new WebTablesPage(driver);

        webTablesPage.addEntry(firstName,lastName, email, age, salary, department);
        webTablesPage.addEntry("Jon", "Ion", "jon@yahoo.com", "35","10000","IT manual");//ex

        WebElement rowAdded = driver.findElement(By.xpath("(//tr)[5]"));
        String rowAddedText = rowAdded.getText();
        System.out.println(rowAddedText);

        webTablesPage.verifyEntry(firstName,lastName,email,age, salary, department);






    }
}

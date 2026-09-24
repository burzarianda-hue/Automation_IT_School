package Tests;

import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import Shared_Data.Test_Base_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTableTest extends Test_Base_Page {

    @Test
    public void metodaTest() throws InterruptedException {
        //ChromeOptions options = new ChromeOptions();

       // options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");
//        WebDriver driver = new ChromeDriver();//options
        //WebDriver driver = new ChromeDriver(); // se acceseaza Chrome
//        driver.manage().window().maximize(); // maximizeaza fereastra
//        driver.get("https://demoqa.com/"); // acceseaza https://demoqa.com/

        String firstName = "Arianda";//variabile
        String lastName = "Burz";
        String age = "30";
        String email = "ari@yahoo.com";
        String salary = "1000";
        String department = "IT test";

        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        //js.executeScript("window.scrollBy(0, 800);"); // 800 pixeli in jos -  asa se da scrol
//      Thread.sleep(millis 2000); - se asteapta 2s nu folosi pt ca oprest threadul si posibil sa strici ceva in spate

//        WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']")); //gaseste elementul
//        elementsButton.click();
        js.executeScript("window.scrollBy(0, 200);");
        HomePage homePage = new HomePage(getDriver());
        homePage.clickElements();

        //*[text()='Web Tables']

        //Thread.sleep(2000);


//        WebElement webTableButton = driver.findElement(By.xpath("//span[text()='Web Tables']"));
//        webTableButton.click();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Web Tables");

       // Thread.sleep(2000);


//        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
//        addButton.click();
//
//        WebElement firstNameField = driver.findElement(By.id("firstName"));
//        firstNameField.sendKeys(firstName);
//
//        WebElement lastNameField = driver.findElement(By.id("lastName"));
//        lastNameField.sendKeys(lastName);
//
//        WebElement userEmailField = driver.findElement(By.id("userEmail"));
//        userEmailField.sendKeys(email);
//
//        WebElement ageField = driver.findElement(By.id("age"));
//        ageField.sendKeys(age);
//
//        WebElement salaryField = driver.findElement(By.id("salary"));
//        salaryField.sendKeys(salary);
//
//        WebElement departmentField = driver.findElement(By.id("department"));
//        departmentField.sendKeys(department);
//
//        WebElement submitButton = driver.findElement(By.id("submit"));
//        submitButton.click();

        WebTablesPage webTablesPage = new WebTablesPage(getDriver());
       /* webTablesPage.clickOnAddButton();
        webTablesPage.enterFirstNameField(firstName);
        webTablesPage.enterLastNameField(lastName);
        webTablesPage.enterAgeField(age);
        webTablesPage.enterUserEmailField(userEmail);
        webTablesPage.enterSalaryField(salary);
        webTablesPage.enterDepartmentField(department);
        webTablesPage.clickOnSubmitButton();*/

       // webTablesPage.addEntry(firstName,lastName, email, age, salary, department);
       // webTablesPage.addEntry("Jon", "Ion", "jon@yahoo.com", "35","10000","IT manual");


        WebElement rowAdded = getDriver().findElement(By.xpath("(//tr)[5]"));
        String rowAddedText = rowAdded.getText();
        System.out.println(rowAddedText);

//        Assert.assertTrue(rowAddedText.contains("Arianda"));// assert
//        Assert.assertTrue(rowAddedText.contains("Burz"));// assert
//        Assert.assertTrue(rowAddedText.contains("30"));// assert
//        Assert.assertTrue(rowAddedText.contains("ari@yahoo.com"));// assert
//        Assert.assertTrue(rowAddedText.contains("1000"));// assert
//        Assert.assertTrue(rowAddedText.contains("IT test"));// assert

//        WebElement firstNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[1]")); //identificare elemente de la 1 la 6
//        WebElement lastNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[2]"));
//        WebElement ageColumn = driver.findElement(By.xpath("(//tr)[5]//td[3]"));
//        WebElement userEmailColumn = driver.findElement(By.xpath("(//tr)[5]//td[4]"));
//        WebElement salaryColumn = driver.findElement(By.xpath("(//tr)[5]//td[5]"));
//        WebElement departmentColumn = driver.findElement(By.xpath("(//tr)[5]//td[6]"));


//        String firstNameColumnText = firstNameColumn.getText();
//        String lastNameColumnText = lastNameColumn.getText();
//        String ageColumnText = ageColumn.getText();
//        String userEmailColumnText = userEmailColumn.getText();
//        String salaryColumnText = salaryColumn.getText();
//        String departmentColumnText = departmentColumn.getText();


//        Assert.assertTrue(firstNameColumnText.equals(firstName));
//        Assert.assertTrue(lastNameColumnText.equals(lastName));
//        Assert.assertTrue(ageColumnText.equals(age));
//        Assert.assertTrue(emailColumnText.equals(email),"E-mailul nu a fost corect");
//        Assert.assertEquals(salaryColumnText,salary);
//
//        Assert.assertTrue(departmentColumn.getText().equals(department));Assert.assertEquals(departmentColumn.getText(), department);


       // webTablesPage.verifyEntry(firstName,lastName,email,age, salary, department);





        //h5[text()='Elements'] - Xpath relativ
        // /html/body/div/div/div/div[2]/div/a[1]/div/div/div[3]/h5 //path absolut

    }
}
package Tests;

import Pages.CommonPage;
import Pages.HomePage;
import Pages.WebTablesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WebTableEx {

    @org.testng.annotations.Test
    public void metodaTest() throws InterruptedException {

        //ChromeOptions options = new ChromeOptions();
        //options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");

        WebDriver driver = new ChromeDriver(); // - primul pas deschide pagina Chrome
        driver.manage().window().maximize(); // - maximizeaza ecranul  - full screen
        driver.get("https://demoqa.com/"); // - deschide link-ul

        String firstName = "Arianda";
        String lastName = "Burz";
        String userEmail = "test@net.net";
        String age = "30";
        String salary = "1000";
        String department = "IT test";


        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0, 800);"); // 800 pixeli în jos

        Thread.sleep(2000); // metoda Wait (pauza) daca codul ruleaza prea rapid - (2sec)

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 800);"); // 800 pixeli în jos

       // WebElement elementsButton = driver.findElement(By.xpath("//h5[text()='Elements']"));
        //elementsButton.click();

        HomePage homePage = new HomePage(driver);
        homePage.clickElements();

        js.executeScript("window.scrollBy(0, -800);");

       // WebElement webTableButton = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        //webTableButton.click();

        CommonPage commonPage = new CommonPage(driver);
        commonPage.clickOnSubMenu("Web Tables");

        Thread.sleep(2000);

        //WebElement webElementButton = driver.findElement(By.xpath("//span[text()='Web Tables']"));
        //webElementButton.click();

       /* Thread.sleep(2000);

        WebElement addButton = driver.findElement(By.id("addNewRecordButton"));
        addButton.click();
        Thread.sleep(2000);

        WebElement firstNameField = driver.findElement(By.id("firstName"));
        firstNameField.sendKeys(firstName);

        WebElement lastNameField = driver.findElement(By.id("lastName"));
        lastNameField.sendKeys(lastName);

        WebElement userEmailField = driver.findElement(By.id("userEmail"));
        userEmailField.sendKeys(userEmail);

        WebElement ageField = driver.findElement(By.id("age"));
        ageField.sendKeys(age);

        WebElement salaryField = driver.findElement(By.id("salary"));
        salaryField.sendKeys(salary);

        WebElement departmentField = driver.findElement(By.id("department"));
        departmentField.sendKeys(department);

        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();*/

        WebTablesPage webTablesPage = new WebTablesPage(driver);
        webTablesPage.clickOnAddButton();
        webTablesPage.enterFirstNameField(firstName);
        webTablesPage.enterLastNameField(lastName);
        webTablesPage.enterUserEmailField(userEmail);
        webTablesPage.enterAgeField(age);
        webTablesPage.enterSalaryField(salary);
        webTablesPage.enterDepartmentField(department);
        webTablesPage.clickOnSubmitButton();

        WebElement rowAdded = driver.findElement(By.xpath("(//tr)[5]"));
        String rowAddedText = rowAdded.getText();
        System.out.println(rowAddedText);


        //*[text()='Web Tables']
        //(//li[@id='item-3'])[1]
        //[@class='element-list accordion-collapse collapse show']//li[@id='item-3']       -> //cea mai buna varianta
        //[@class='element-list accordion-collapse collapse show']//[@class='menu-list']//li[@id='item-3']
        //[@class='element-list accordion-collapse collapse show']//[@class='menu-list']//*[@class='btn btn-light ' and contains(@id, 'item-3')]

        //h5[text()='Elements'] - xpath relativ (ceam mai buna metoda)
        //html/body/div[1]/div/div/div[2]/div/a[1]/div/div/div[3]/h5 - xpath absolut
        //*[@id="root"]/div/div/div[2]/div/a[1]/div/div/div[3]/h5 - xpath absolut

        /*Assert.assertTrue(rowAddedText.contains("Arianda"));
        Assert.assertTrue(rowAddedText.contains("Burz"));
        Assert.assertTrue(rowAddedText.contains("30"));
        Assert.assertTrue(rowAddedText.contains("test@net.net"));
        Assert.assertTrue(rowAddedText.contains("1000"));
        Assert.assertTrue(rowAddedText.contains("IT test")); */

        WebElement firstNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[1]"));
        WebElement lastNameColumn = driver.findElement(By.xpath("(//tr)[5]//td[2]"));
        WebElement userEmailColumn = driver.findElement(By.xpath("(//tr)[5]//td[3]"));
        WebElement ageColumn = driver.findElement(By.xpath("(//tr)[5]//td[4]"));
        WebElement salaryColumn = driver.findElement(By.xpath("(//tr)[5]//td[5]"));
        WebElement departmentColumn = driver.findElement(By.xpath("(//tr)[5]//td[6]"));

        String firstNameColumnText = firstNameColumn.getText();
        String lastNameColumnText = lastNameColumn.getText();
        String userEmailColumnText = userEmailColumn.getText();
        String ageColumnText = ageColumn.getText();
        String salaryColumnText = salaryColumn.getText();
        String departmentColumnText = departmentColumn.getText();

        Assert.assertTrue(firstNameColumnText.equals("Arianda"));
        Assert.assertTrue(lastNameColumnText.equals("Burz"));
        Assert.assertTrue(userEmailColumnText.equals("test@net.net"), "Email-ul nu a fost corect");
        Assert.assertTrue(ageColumnText.equals("30"));
        Assert.assertEquals(salaryColumnText,"1000");

        Assert.assertTrue(departmentColumnText.equals("IT test"));
        Assert.assertEquals(departmentColumn.getText(),"IT test");



        // (//*["class='rt-tr-group'[4])


    }
}
package Tests;

import ObjectData.TextBoxObject;
import Pages.CommonPage;
import Pages.HomePage;
import Pages.TextBoxPage;
import Shared_Data.Test_Base_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Map;

public class TestBoxEx extends Test_Base_Page {
    private Map<String, TextBoxObject> textBoxObjectMap;

    @Test
    public void metodaTest(){



        // ChromeOptions options = new ChromeOptions();
        //options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");
        WebDriver driver = new ChromeDriver();
       //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        //JavascriptExecutor js = (JavascriptExecutor) driver;

        String fullName = "Arianda Burz";
        String email = "ariandatest@yahoo.com";
        String currentAddress = "Take1";
        String permanentAddress = "Take2";

       // js.executeScript("window.scrollBy(0, 200);");
        //List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        //cardList.get(0).click();

        //js.executeScript("window.scrollBy(0, 200);");
       // List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        //elementsList.get(0).click();

        HomePage homePage = new HomePage(driver);
        homePage.clickElements();

        CommonPage commonPage = new CommonPage(driver);
        commonPage.clickOnSubMenu("Text Box");


//        WebElement fullNameField = driver.findElement(By.id("userName"));
//        fullNameField.click();
//        fullNameField.sendKeys("Arianda Burz");

//        WebElement emailField = driver.findElement(By.id("userEmail"));
//        emailField.click();
//        emailField.sendKeys("ariandatest@yahoo.com");

//        WebElement currentAddressField = driver.findElement(By.id("currentAddress"));
//        currentAddressField.click();
//        currentAddressField.sendKeys("Take1");

//        WebElement permanentAddressField = driver.findElement(By.id("permanentAddress"));
//        permanentAddressField.click();
//        permanentAddressField.sendKeys("Take2");

        TextBoxPage textBoxPage = new TextBoxPage(getDriver());
        //textBoxPage.entryTextBox(data);

       // textBoxPage.dateinserate();

       // textBoxPage.verificareEntryText(data);

        driver.quit();



        //js.executeScript("window.scrollBy(0, 200);");
        //WebElement submitButton = driver.findElement(By.id("submit"));
        //submitButton.click();

        //WebElement name = driver.findElement(By.id("name"));
        //Assert.assertEquals(name.getText(), "Name:Arianda Burz");
        //assert name.getText().equals("Name:Arianda Burz");

       // WebElement userEmail = driver.findElement(By.id("email"));
        //Assert.assertEquals(userEmail.getText(), "email:ariandatest@yahoo.com");
       // assert email.getText().equals("Email:ariandatest@yahoo.com");

        //List<WebElement> infoList = driver.findElements(By.xpath("//*[@class='mb-1']"));
        //Assert.assertTrue(infoList.get(2).getText().contains("Take1"));
        //Assert.assertTrue(infoList.get(3).getText().contains("Take2"));

        //assert infoList.get(2).getText().equals("Current Address :Take1");
        //assert infoList.get(3).getText().equals("Permanent Address :Take2");


    }
}

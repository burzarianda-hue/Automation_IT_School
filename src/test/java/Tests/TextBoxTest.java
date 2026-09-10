package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TextBoxTest {

    @Test
    public void metodaTest() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");

        WebDriver driver = new ChromeDriver(options);//options in paranteza

        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://demoqa.com");


        JavascriptExecutor js = (JavascriptExecutor) driver;
        //refactoriza TestBoxTest+framesTest (ca la Pages.WebTablesPage.WebTableTest=WebTablePage,  TestBoxPage)
        // Click pe Elements
        List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        cardList.get(0).click();

        // Click pe Text Box
        List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        elementsList.get(0).click();

        // Completează formularul
        driver.findElement(By.id("userName")).sendKeys("Burz");
        driver.findElement(By.id("userEmail")).sendKeys("ariandatest@yahoo.com");
        driver.findElement(By.id("currentAddress")).sendKeys("Take1");
        driver.findElement(By.id("permanentAddress")).sendKeys("Take2");

        // Scroll până la butonul Submit
        WebElement submitButton = driver.findElement(By.id("submit"));
        js.executeScript("arguments[0].click();", submitButton);
        //submitButton.click();

        // Așteaptă apariția rezultatului
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

        // Citește rezultatele
        WebElement name = driver.findElement(By.id("name"));
        WebElement email = driver.findElement(By.id("email"));

        List<WebElement> infoList = driver.findElements(By.className("mb-1"));

        // Afișează rezultatele în consolă
        System.out.println(name.getText());
        System.out.println(email.getText());

        for (WebElement element : infoList) {
            System.out.println(element.getText());
        }

        // Verificări
        Assert.assertEquals(name.getText(), "Name:Burz");
        Assert.assertEquals(email.getText(), "Email:ariandatest@yahoo.com");
        Assert.assertTrue(infoList.get(2).getText().contains("Take1"));
        Assert.assertTrue(infoList.get(3).getText().contains("Take2"));

        driver.quit();
    }

}

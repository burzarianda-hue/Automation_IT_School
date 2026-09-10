package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class Interactions {

    @Test
    public void metodaTest(){


       // ChromeOptions options = new ChromeOptions();

        //options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");

        WebDriver driver = new ChromeDriver();//options in paranteza
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
        cardList.get(4).click();

        js.executeScript("window.scrollBy(0, 200);");
        List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
        elementsList.get(0).click();


       WebElement oneElement = driver.findElement(By.xpath("//div[@data-handler-id = 'T0']"));
       WebElement fiveElement = driver.findElement(By.xpath("//div[@data-handler-id = 'T8']"));


        Actions action = new Actions(driver);
        action.clickAndHold(oneElement).moveToElement(fiveElement, 0,  15).release().build().perform();//toate metodele 'Action' functioneaza astfel




        //div[@data-handler-id = 'T0']

        //release pica
        // Actions actions = new Actions(driver);
        //actions.dragAndDrop(oneElement, fiveElement).perform();
    }
}

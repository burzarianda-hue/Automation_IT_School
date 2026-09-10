package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class FramesTest {

    String text1 = "Textul din primul iframe este";
    String text2 = "Textul din al 2 - lea iframe este";

        @Test
        public void metodaTest() {


            ChromeOptions options = new ChromeOptions();
            options.addArguments("--user-data-dir=C:\\SeleniumChromeProfile");


            WebDriver driver = new ChromeDriver(options);
            driver.manage().window().maximize();
            driver.get("https://demoqa.com");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            //js.executeScript("window.scrollBy(0, 200);");


            List<WebElement> cardList = driver.findElements(By.xpath("//*[@class='category-cards']//*[@data-discover='true']"));
            cardList.get(2).click();

            js.executeScript("window.scrollBy(0, 200);");
            List<WebElement> elementsList = driver.findElements(By.xpath("//*[@class='element-list accordion-collapse collapse show']//*[@data-discover='true']"));
            elementsList.get(2).click();


            WebElement frame1 = driver.findElement(By.id("frame1"));
            driver.switchTo().frame(frame1);
            WebElement iframeText1 = driver.findElement(By.id("sampleHeading"));
            System.out.println(text1 + iframeText1.getText());

            driver.switchTo().defaultContent();

            WebElement frame2 = driver.findElement(By.id("frame2"));
            driver.switchTo().frame(frame2);
            WebElement iframeText2 = driver.findElement(By.id("sampleHeading"));
            System.out.println(text2 + iframeText2.getText());



            driver.switchTo().defaultContent();

        }
    }


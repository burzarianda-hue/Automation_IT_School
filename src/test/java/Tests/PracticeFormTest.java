package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class PracticeFormTest {

    @Test
    public void practiceFromTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--user-data-dir=C:\\SeleniumChomeProfile");


        WebDriver driver = new ChromeDriver(options);// primul pas deschide pagina Chome;
        driver.manage().window().maximize();//mareste eceanul- full screen;
        driver.get("https://demoqa.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(2000);

        WebElement formsButton = driver.findElement(By.xpath("//h5[text()='Forms']"));
        formsButton.click();

        WebElement practiceFormButton = driver.findElement(By.xpath("//span[text()='Practice Form']"));
        practiceFormButton.click();

        String gender = "Male";
        //String gender = "Female";
        //String gender = "Other";

        WebElement maleGenderButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-1']"));

        WebElement femaleGenderButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-2']"));

        WebElement otherGenderButton = driver.findElement(By.xpath("//*[@class='col-md-9 col-sm-12']//*[@id= 'gender-radio-3']"));

        /*if (gender.equals("Male")){

            maleGenderButton.click();
        }
        else if (gender.equals("Female")){

            femaleGenderButton.click();
        }
        else otherGenderButton.click();*/

        switch (gender) {

            case "Male":
                maleGenderButton.click();
                break;
            case "Female":
                femaleGenderButton.click();
                break;
            case "Other":
                otherGenderButton.click();
                break;


        }


        //(//*[@class='form-control'])[3]
        //*[@id='gender-radio-1']


    }
}

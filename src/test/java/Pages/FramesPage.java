package Pages;

import HelperMethods.ElementsMetods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FramesPage {

    WebDriver driver;
    ElementsMetods elementsMetods;

    public FramesPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMetods = new ElementsMetods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "frame1")
    WebElement frame1;

    @FindBy(id = "frame2")
    WebElement frame2;

    @FindBy(id = "sampleHeading")
    WebElement frameText;


    public void switchToFrame1() {
        driver.switchTo().frame(frame1);
    }

    public void switchToFrame2() {
        driver.switchTo().frame(frame2);
    }

    public String getFrameText() {
        return frameText.getText();
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
}
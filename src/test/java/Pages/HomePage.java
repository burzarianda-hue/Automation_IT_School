package Pages;

import HelperMethods.ElementsMethods;
import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    WebDriver driver;
    ElementsMethods elementsMetods;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.elementsMetods = new ElementsMethods(driver);//constructor
        PageFactory.initElements(driver, this);//fara aceasta linie nu o sa gaseasca elementele de la linile 18(elements),21(forms);
    }

    @FindBy(xpath = "//h5[text()='Elements']")
    WebElement elementsButton;

    @FindBy(xpath = "//h5[text()='Forms']")
    WebElement formsButton;

    @FindBy(xpath = "//div[@class='card mt-4 top-card'][.//h5[text()='Alerts, Frame & Windows']]")
    WebElement alertsButton;
    //@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
    //WebElement alertsButton;

    public void  clickElements(){

        elementsMetods.clickOnElement(elementsButton);
        LoggerUtility.infoTestCase("User clicked Element Button");
    }

    public void clickForms() {

        elementsMetods.clickOnElement(formsButton);
    }

    public void clickOnAlertsButton(){

        elementsMetods.clickOnElement(alertsButton);
    }
}
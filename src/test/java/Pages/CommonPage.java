package Pages;

import HelperMethods.ElementsMethods;
import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public  class CommonPage {

    WebDriver driver;
    ElementsMethods elementsMetods;

    public CommonPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMetods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//span[@class='text']")
    List<WebElement>elements;

    public void clickOnSubMenu(String text){

        elementsMetods.selectElementFromListByText(elements,text);
        LoggerUtility.infoTestCase("The user clicked on" + text + " submenu");
    }
}




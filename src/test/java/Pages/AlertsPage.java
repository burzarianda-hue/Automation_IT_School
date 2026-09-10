package Pages;

import HelperMethods.AlertMethods;
import HelperMethods.ElementsMetods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsPage {
    WebDriver driver;
    ElementsMetods elementsMetods;
    AlertMethods alertMethods;

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMetods =  new ElementsMetods(driver);
        this.alertMethods = new AlertMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='alertButton']")
    WebElement alertButton;

    @FindBy(xpath = "//*[@id='timerAlertButton']")
    WebElement timerAlertButton;

    @FindBy(xpath = "//*[@id='confirmButton']")
    WebElement confitmButton;

    @FindBy(xpath = "//*[@id='promtButton']" )
    WebElement promtButton;

    public void dealWithAlertOk(){
        elementsMetods.clickOnElement(alertButton);
        alertMethods. alertOk();
    }

    public void dealAlertDelay(int seconds){
      elementsMetods.clickOnElement(timerAlertButton);
      alertMethods.alertWithDelay(seconds);
    }

    public void alertConfirm(){
        elementsMetods.clickOnElement(confitmButton);
        alertMethods.alertConfirm();

    }

    public void alertCancel(){
        elementsMetods.clickOnElement(confitmButton);
        alertMethods.alertCancel();
    }

    public void alertPromt(String value){
        elementsMetods.clickOnElement(promtButton);
        alertMethods.alertText(value);


    }
}

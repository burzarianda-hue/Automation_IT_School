package Pages;

import HelperMethods.ElementsMethods;
import Logger.LoggerUtility;
import ObjectData.WebTableObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WebTablesPage {

    WebDriver driver;
    ElementsMethods elementsMetods;


    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        this.elementsMetods = new ElementsMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "addNewRecordButton")
    WebElement addButton;

    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "userEmail")
    WebElement userEmailField;

    @FindBy(id = "age")
    WebElement ageField;

    @FindBy(id = "salary")
    WebElement salaryField;

    @FindBy(id = "department")
    WebElement departmentField;

    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(xpath = "(//tr)[5]//td[1]")
    WebElement firstNameColumn;

    @FindBy(xpath = "(//tr)[5]//td[2]")
    WebElement lastNameColumn;

    @FindBy(xpath = "(//tr)[5]//td[3]")
    WebElement ageColumn;

    @FindBy(xpath = "(//tr)[5]//td[4]")
    WebElement emailColumn;

    @FindBy(xpath = "(//tr)[5]//td[5]")
    WebElement salaryColumn;

    @FindBy(xpath = "(//tr)[5]//td[6]")
    WebElement departmentColumn;


    public void addEntry(WebTableObject data) {

        clickOnAddButton();
        LoggerUtility.infoTestCase("User clicked on add Button");
        enterFirstNameField(data.getFirstName());
        LoggerUtility.infoTestCase("User entered First Name");
        enterLastNameField(data.getLastName());
        LoggerUtility.infoTestCase("User entered Last Name");
        enterUserEmailField(data.getEmail());
        LoggerUtility.infoTestCase("User entered the email");
        enterAgeField(data.getAge());
        LoggerUtility.infoTestCase("User entered the Age");
        enterSalaryField(data.getSalary());
        LoggerUtility.infoTestCase("User entered the Salary");
        enterDepartmentField(data.getDepartment());
        LoggerUtility.infoTestCase("User entered the Department");
        clickOnSubmitButton();

    }

    public void clickOnAddButton() {

        elementsMetods.clickOnElement(addButton);
    }

    public void enterFirstNameField(String firstName) {

        elementsMetods.enterText(firstNameField, firstName);
    }

    public void enterLastNameField(String lastName) {

        elementsMetods.enterText(lastNameField, lastName);
    }

    public void enterUserEmailField(String userEmail) {

        elementsMetods.enterText(userEmailField, userEmail);
    }

    public void enterAgeField(String age) {

        elementsMetods.enterText(ageField, age);
    }

    public void enterSalaryField(String salaryText) {

        elementsMetods.enterText(salaryField, salaryText);
    }

    public void enterDepartmentField(String departmentText) {

        elementsMetods.enterText(departmentField, departmentText);
    }

    public void clickOnSubmitButton() {

        elementsMetods.clickOnElement(submitButton);
    }

    public void verifyEntry(WebTableObject data) {

        Assert.assertTrue(firstNameColumn.getText().equals(data.getFirstName()));
        LoggerUtility.infoTestCase("User entered First Name");
        Assert.assertTrue(lastNameColumn.getText().equals(data.getLastName()));
        LoggerUtility.infoTestCase("User entered Last Name");
        Assert.assertTrue(ageColumn.getText().equals(data.getAge()));
        LoggerUtility.infoTestCase("User entered the Age");
        Assert.assertTrue(emailColumn.getText().equals(data.getEmail())); // "Email-ul nu a fost corect");
        LoggerUtility.infoTestCase("User entered the Email");
        Assert.assertTrue(salaryColumn.getText().equals(data.getSalary()));
        LoggerUtility.infoTestCase("User entered the Salary");
        Assert.assertTrue(departmentColumn.getText().equals(data.getDepartment()));
        LoggerUtility.infoTestCase("User entered the Department");

    }

}









package Tests.TestRefactored;


import Pages.CommonPage;
import Pages.FramesPage;
import Pages.HomePage;
import Shared_Data.Test_Base_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.sql.DriverManager.getDriver;

public class FramesTestRefactorizat extends Test_Base_Page {

    @Test
    public void metodaTest() {

        HomePage homePage = new HomePage(getDriver());
        homePage.clickOnAlertsButton();

        CommonPage commonPage = new CommonPage(getDriver());
        commonPage.clickOnSubMenu("Frames");

        FramesPage framesPage = new FramesPage(getDriver());


        framesPage.switchToFrame1();
        Assert.assertEquals(framesPage.getFrameText(), "This is a sample page");
        framesPage.switchToDefaultContent();


        framesPage.switchToFrame2();
        Assert.assertEquals(framesPage.getFrameText(), "This is a sample page");
        framesPage.switchToDefaultContent();
    }
}


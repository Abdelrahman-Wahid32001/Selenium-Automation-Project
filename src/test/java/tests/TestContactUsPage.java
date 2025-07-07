package tests;

import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class TestContactUsPage extends TestBase{

    HomePage home;
    ContactUsPage contactUs;
    String masg = "hello every one ";
    String masg2 = "  ";

    @Test
    public void testContactUsfeature(){
        home = new HomePage(driver);
        home.scrollDown();
        home.openContactUsPage();
        contactUs = new ContactUsPage(driver);
        contactUs.fullContactUsFields(
                data.getFname()+ data.getLname()
                , data.getEmail()
                ,masg );
        softAssert.assertTrue(contactUs.infoMessageContactUsPage.isDisplayed());
    }
    @Test
    public void testContactUsfeatureWithInvalidMassage(){
        home = new HomePage(driver);
        home.scrollDown();
        home.openContactUsPage();
        contactUs = new ContactUsPage(driver);
        contactUs.fullContactUsFields(
                data.getFname()+ data.getLname()
                , data.getEmail()
                ,masg2);
    softAssert.assertTrue(contactUs.errorMessageContactUsPage.isDisplayed());
    }
}

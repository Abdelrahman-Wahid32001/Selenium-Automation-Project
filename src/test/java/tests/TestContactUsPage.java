package tests;

import data.UserValidData;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class TestContactUsPage extends TestBase{

    HomePage home;
    ContactUsPage contactUs;
    UserValidData user;
    String masg = "hello every one ";
    @Test
    public void testContactUsfeature(){
        home = new HomePage(driver);
        home.scrollDown();
        home.openContactUsPage();
        contactUs = new ContactUsPage(driver);
        user = new UserValidData();
        contactUs.fullContactUsFields(
                user.getFname()+user.getLname()
                , user.getEmail()
                ,masg );


    }
}

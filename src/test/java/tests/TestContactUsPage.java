package tests;

import drivers.DriverManager;
import org.testng.annotations.Test;
import pages.P0_HomePage;
import pages.P4_ContactUsPage;

public class TestContactUsPage extends TestBase {


    String masg = "hello every one ";
    String masg2 = "  ";

    @Test
    public void testContactUsfeature() {

        new P0_HomePage(driver).navigateToPage().openContactUsPage();
        new P4_ContactUsPage(driver)
                .fullContactUsFields(data.getFname() + data.getLname(), data.getEmail(), masg2)
                .clickToSubmitMessage();
    }

    @Test
    public void testContactUsfeatureWithInvalidEmail() {
        new P0_HomePage(driver).navigateToPage().openContactUsPage();
        new P4_ContactUsPage(driver)
                .fullContactUsFields(data.getFname() + data.getLname(), data.getEmail(), masg)
                .clickToSubmitMessage();
    }

    @Test
    public void testContactUsfeatureWithInvalidMassage() {
        new P0_HomePage(driver).navigateToPage().openContactUsPage();
        new P4_ContactUsPage(driver)
                .fullContactUsFields(data.getFname() + data.getLname(), data.getEmail(), masg2)
                .clickToSubmitMessage();
    }

}
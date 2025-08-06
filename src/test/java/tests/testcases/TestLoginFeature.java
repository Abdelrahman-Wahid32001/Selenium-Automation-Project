package tests.testcases;

import org.testng.annotations.Test;
import pages.*;
import tests.TestBase;

public class TestLoginFeature extends TestBase {


    @Test
    public void testLoginFeature() {
        new P0_HomePage(driver).navigateToPage()
                .openAccountPage()
                .setLoginFields(data.getEmail(), data.getPass())
                .clickOnSubmit()
                .asserSuccessLoginMessage()
                .getConfirmationLoginEmail()
                .setConfirmationLoginEmail();
    }

    @Test
    public void testLoginFeatureWithInvalidEmail() {
        new P0_HomePage(driver).navigateToPage()
                .openAccountPage()
                .setLoginFields(data.getInvalidEmail(), data.getPass())
                .clickOnSubmit()
                .getConfirmationLoginEmail()
                .setConfirmationLoginEmail();


    }

    @Test
    public void testLoginFeatureWithInvalidPassword() {
        new P0_HomePage(driver).navigateToPage().openAccountPage()
                .setLoginFields(data.getEmail(), data.getInvalidPass())
                .clickOnSubmit()
                .getConfirmationLoginEmail()
                .setConfirmationLoginEmail();

    }
}

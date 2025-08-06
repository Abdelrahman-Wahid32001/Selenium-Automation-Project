package tests.testcases;

import org.testng.annotations.Test;
import pages.P0_HomePage;
import tests.TestBase;


public class TestForgotPasswordFeature extends TestBase {

    @Test
    public void testForgotPassField() {
        new P0_HomePage(driver)
                .navigateToPage()
                .assertAll()
                .openAccountPage()
                .goForgotPasswordPage()
                .setForgotPasswordField(data.getEmail());
    }

    @Test
    public void testForgotPassFieldWithInvalidEmail() {
        new P0_HomePage(driver)
                .navigateToPage()
                .assertAll()
                .openAccountPage()
                .goForgotPasswordPage()
                .setForgotPasswordField(data.getInvalidEmail());

    }

}

package tests.testcases;


import org.testng.annotations.Test;
import pages.P0_HomePage;
import tests.TestBase;


public class TestRegistrationFeature extends TestBase {

    @Test
    public void testValidRegistration() {

        new P0_HomePage(driver)
                .navigateToPage()
                .assertURL()
                .openAccountPage()
                .assertURL()
                .assertTitle()
                .createNewAccount()
                .assertURL()
                .userRegistration(user.Fname, user.Lname, user.Email.get(1), user.Pass)
                .assertMSG("Cannot save the customer.");

    }
    @Test
    public void testInvalidRegistrationUsingUsedEmail() {

        new P0_HomePage(driver)
                .navigateToPage()
                .assertURL()
                .openAccountPage()
                .assertURL()
                .assertTitle()
                .createNewAccount()
                .assertURL()
                .userRegistration(data.getFname(), data.getLname(), data.getEmail(), data.getPass())
                .assertMSG("There is already an account with this email address.");

    }
    @Test
    public void testInvalidRegistrationByInvalidEmail() {

        new P0_HomePage(driver)
                .navigateToPage()
                .openAccountPage()
                .createNewAccount()
                .userRegistration(user.Fname, user.Lname, user.InvalidEmail.get(1), user.Pass)
                .submitRegistration()
                .assertMSG("Please enter a valid email address.");


    }
    @Test
    public void testInvalidRegistrationByInvalidName() {

        new P0_HomePage(driver)
                .navigateToPage()
                .openAccountPage()
                .createNewAccount()
                .userRegistration("     ", data.getLname(), data.getEmail(), data.getPass())
                .submitRegistration().assertMSG("This is a required field.");
    }

}
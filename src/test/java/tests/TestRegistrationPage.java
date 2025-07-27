package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P0_HomePage;
import pages.P1_AccountPage;
import pages.P2_RegistrationPage;


public class TestRegistrationPage extends TestBase {
    @Test
    public void testValidRegistration() {

        new P0_HomePage(driver).openAccountPage();
        new P1_AccountPage(driver).createNewAccount();
        Assert.assertEquals(driver.getTitle(),"Create New Customer Account");
        new P2_RegistrationPage(driver)
                .userRegistration(data.getFname(), data.getLname(), data.getEmail(), data.getPass());

    }
}
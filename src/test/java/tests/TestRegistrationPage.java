package tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.HomePage;
import pages.RegistrationPage;


public class TestRegistrationPage extends TestBase {
  public   HomePage home;
    RegistrationPage reg;
    AccountPage account;
    @Test
    public void testValidRegistration() {
        home = new HomePage(driver);
        home.openAccountPage();
        account= new AccountPage(driver);
        account.createNewAccount();
        Assert.assertEquals(driver.getTitle(),"Create New Customer Account");
        reg = new RegistrationPage(driver);
        reg.userRegistration(data.getFname(), data.getLname(), data.getEmail(), data.getPass());
        Assert.assertNotNull(reg.getRegisteredAccountCorrectly());

    }

    @Test(dependsOnMethods = {"testValidRegistration"})
    public void testBackToAccountPage(){
        reg.getBackToAccountPage();
    }
}
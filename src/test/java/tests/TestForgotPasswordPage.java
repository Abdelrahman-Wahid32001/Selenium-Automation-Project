package tests;


import org.testng.annotations.Test;
import pages.AccountPage;
import pages.ForgetPasswordPage;
import pages.HomePage;


public class TestForgotPasswordPage extends TestBase{

    HomePage home;
    AccountPage account;
    ForgetPasswordPage forgetPass;

    @Test
    public void testForgotPassField(){
        home = new HomePage(driver);
        home.openAccountPage();
        account = new AccountPage(driver);
        account.goForgotPasswordPage();
        forgetPass = new ForgetPasswordPage(driver);
        forgetPass.setForgotPasswordField(data.getEmail());
        softAssert.assertTrue(forgetPass.submitForgotPasswordBtn.isEnabled());
    }
    @Test
    public void testForgotPassFieldWithInvalidEmail(){
        home = new HomePage(driver);
        home.openAccountPage();
        account = new AccountPage(driver);
        account.goForgotPasswordPage();
        forgetPass = new ForgetPasswordPage(driver);
        forgetPass.setForgotPasswordField(data.getInvalidEmail());
        softAssert.assertFalse(forgetPass.submitForgotPasswordBtn.isEnabled());
        driver.navigate().back();

    }

}

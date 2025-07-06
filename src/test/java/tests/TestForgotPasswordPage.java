package tests;

import data.UserValidData;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.ForgetPasswordPage;
import pages.HomePage;

public class TestForgotPasswordPage extends TestBase{

    HomePage home;
    AccountPage account;
    ForgetPasswordPage forgetPass;
    UserValidData user = new UserValidData();
    @Test
    public void testForgotPassField(){
        home = new HomePage(driver);
        home.openAccountPage();
        account = new AccountPage(driver);
        account.goForgotPasswordPage();
        forgetPass = new ForgetPasswordPage(driver);
        forgetPass.setForgotPasswordField(user.getEmail());
    }
}

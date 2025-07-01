package tests;

import data.UserValidData;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.ForgetPasswordPage;

public class TestForgotPasswordPage extends TestBase{

    AccountPage account;
    ForgetPasswordPage forgetPass;
    UserValidData user = new UserValidData();
    @Test
    public void testForgotPassField(){
        account = new AccountPage(driver);
        account.goForgotPasswordPage();
        forgetPass = new ForgetPasswordPage(driver);
        forgetPass.setForgotPasswordField(user.getEmail());
    }
}

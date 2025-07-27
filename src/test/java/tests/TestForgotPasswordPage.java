package tests;


import org.testng.annotations.Test;
import pages.P1_AccountPage;
import pages.P3_ForgetPasswordPage;
import pages.P0_HomePage;


public class TestForgotPasswordPage extends TestBase{

    @Test
    public void testForgotPassField(){
        new P0_HomePage(driver).openAccountPage();
        new P1_AccountPage(driver).goForgotPasswordPage();
       new P3_ForgetPasswordPage(driver).setForgotPasswordField(data.getEmail());
    }
    @Test
    public void testForgotPassFieldWithInvalidEmail(){
        new P0_HomePage(driver).openAccountPage();
        new P1_AccountPage(driver).goForgotPasswordPage();
        new P3_ForgetPasswordPage(driver).setForgotPasswordField(data.getInvalidEmail());
        driver.navigate().back();

    }

}

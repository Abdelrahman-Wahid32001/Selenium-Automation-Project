package tests;

import data.UserValidData;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class TestLoginPage extends TestBase{
    HomePage home;
    LoginPage login ;
    @Test
    public void testLoginFeature(){
        home = new HomePage(driver);
        home.openAccountPage();
        UserValidData user = new UserValidData();
        login = new LoginPage(driver);
        login.setLoginFields(user.getEmail(), user.getPass());




    }
}

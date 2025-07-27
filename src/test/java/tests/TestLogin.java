package tests;

import drivers.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.P0_HomePage;
import utilities.BrowserActions;
import utilities.FilesUtils;

import java.io.File;

public class TestLogin {
    File allure_result = new File("test-outputs/allure-results");


    public void successfulLogin() {
        new P0_HomePage(DriverManager.getDriver()).navigateToPage().openAccountPage();
        new LoginPage(DriverManager.getDriver())
                .setLoginFields("nike@nike.com", "147258369")
                .clickLoginBtn()
                .getConfirmationLoginEmail();
    }

    @BeforeSuite
    public void beforeSuite() {
        //FilesUtils.deleteFiles(allure_result);
    }

    @BeforeMethod
    public void setUp() {
        DriverManager.createInstance("edge"); // أنشئ الدرايفر أولاً
    }

    @AfterMethod
    public void tearDown() {
        BrowserActions.clossBrowser(DriverManager.getDriver());
    }
}

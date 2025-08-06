package tests;

import drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import pages.*;
import utilities.BrowserActions;
import utilities.FilesUtils;

import java.io.File;

public class TestSearchPage extends TestBase {
    String productName = "Chelsea Tee";
    @Test
    public void testSearchFeature() {

        new P5_SearchPage(driver)
                .setSearchBArTxt(productName)
                .openDetailsProductPage();
        new P7_ProductsPage(driver)
                .setChelseaTeeWhite();
        new P8_ShoppingCartPage(driver)
                .proceedToCheckout();
        new P9_CheckOutMethodPage(driver)
                .getCheckoutPage();
        new P10_BillingInformation(driver).fillBillingInformationFields(data.getFname()
                , data.getLname(), data.getSEmail(), data.getAddress(),
                data.getCity(), data.getZip(), data.getPhoneNo());
        new P11_CheckOutPage(driver)
                .finishCheckout();
    }

}

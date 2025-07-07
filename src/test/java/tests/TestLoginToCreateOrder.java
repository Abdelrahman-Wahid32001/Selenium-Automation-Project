package tests;

import org.testng.annotations.Test;
import pages.*;

public class TestLoginToCreateOrder extends TestBase{
    HomePage home ;
    LoginPage login ;
    SecondProductPage product;
    ShoppingCartPage shopping;
    CheckOutMethodPage method;
    BillingInformation info;

    @Test
    public void testLoginFeature(){
        home = new HomePage(driver);
        home.openAccountPage();
        login = new LoginPage(driver);
        login.setLoginFields(data.getEmail(), data.getPass());
        login.confirmLogin();
        login.submitConfirmationLogin();
        softAssert.assertTrue(login.infoMessageLoginConfirmed.isDisplayed());
        login.goToHomeByLogo();
        home.selectProductItem();
        product = new SecondProductPage(driver);
        product.selectTheProduct();
        shopping = new ShoppingCartPage(driver);
        shopping.updateNumberOfProduct("2");
        shopping.ProceedToCheckout();
        method = new CheckOutMethodPage(driver);
        method.getCheckoutPage("AsRegister");
        info = new BillingInformation(driver);
        info.fillBillingInformationFields(data.getFname(), data.getLname(),
                data.getEmail(), data.getAddress(),
                data.getCity(), data.getZip(),
                data.getPhoneNo() , data.getPass());










    }
}

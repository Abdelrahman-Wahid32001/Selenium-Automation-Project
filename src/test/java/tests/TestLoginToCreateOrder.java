package tests;

import org.testng.annotations.Test;
import pages.*;

public class TestLoginToCreateOrder extends TestBase {


    @Test
    public void testLoginFeature() {
        new P0_HomePage(driver).openAccountPage();
        new P1_AccountPage(driver).setLoginFields(data.getEmail(), data.getPass())
                .clickOnSubmit()
                .getConfirmationLoginEmail()
                .setConfirmationLoginEmail();

        new P0_HomePage(driver)
                .goToHomeByLogo()
                .selectProductItem();
        new P7_ProductsPage(driver).setLinenBlazer();
        new P8_ShoppingCartPage(driver)
                //.updateNumberOfProduct("2")
                .proceedToCheckout();
        new P9_CheckOutMethodPage(driver)
                .getCheckoutPage("AsRegister");
        new P10_BillingInformation(driver)
                .fillBillingInformationFields(data.getFname(), data.getLname(),
                        data.getSEmail(), data.getAddress(),
                        data.getCity(), data.getZip(),
                        data.getPhoneNo(), data.getPass());
        new P11_CheckOutPage(driver)
                .finishCheckout();


    }
}

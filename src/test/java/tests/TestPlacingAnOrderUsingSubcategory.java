package tests;


import org.testng.annotations.Test;
import pages.*;


public class TestPlacingAnOrderUsingSubcategory extends TestBase {


    @Test
    public void testBillingInformationFeature() {
        new P0_HomePage(driver)
                .selectFromCategory();
        new P6_SubCategoryPage(driver)
                .filterByBrice()
                .getFrenchCuffItemPage();
        new P7_ProductsPage(driver)
                .setFrenchCuff();
        new P8_ShoppingCartPage(driver)
                .modifyNumberOfProduct("3")
                .updateNumberOfProduct()
                .proceedToCheckout();
        new P9_CheckOutMethodPage(driver)
                .getCheckoutPage();
        new P10_BillingInformation(driver)
                .fillBillingInformationFields(
                        data.getFname(), data.getLname(), data.getEmail()
                        , data.getAddress(), data.getCity(), data.getZip(), data.getPhoneNo());
        new P11_CheckOutPage(driver)
                .finishCheckout();
    }
}

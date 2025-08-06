package tests;

import org.testng.annotations.Test;
import pages.*;

public class TestSuggestionSearch extends TestBase {

    @Test
    public void testSuggestionSearch() {
        new P5_SearchPage(driver).getProductFromSuggestionSearch("swi");
        new P7_ProductsPage(driver).setAddToCart();
        new P0_HomePage(driver)
                .goToHomeByLogo()
                .selectProductItem();
        new P7_ProductsPage(driver).setLinenBlazer();
        new P8_ShoppingCartPage(driver)
                .removeFirstItem()
                .proceedToCheckout();
        new P0_HomePage(driver).goToHomeByLogo().selectFromCategory();
        new P6_SubCategoryPage(driver).filterByColor().getFrenchCuffItemPage();
        new P7_ProductsPage(driver).setFrenchCuff();
        new P8_ShoppingCartPage(driver).modifyNumberOfProduct("5").updateNumberOfProduct().proceedToCheckout();
        new P9_CheckOutMethodPage(driver).getCheckoutPage();
        new P10_BillingInformation(driver).fillBillingInformationFields(data.getFname(), data.getLname(), data.getEmail(), data.getAddress(), data.getCity(), data.getZip(), data.getPhoneNo());
        new P11_CheckOutPage(driver).finishCheckout();
    }


}

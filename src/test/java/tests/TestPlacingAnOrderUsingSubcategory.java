package tests;


import org.testng.annotations.Test;
import pages.*;


public class TestPlacingAnOrderUsingSubcategory extends TestBase{
    HomePage home;
    SubCategoryPage category;
    ProductPage product;
    BillingInformation info;
    ShoppingCartPage shopping;
    CheckOutMethodPage method;
    CheckOutPage checkout;


    @Test
    public void testBillingInformationFeature(){
        home = new HomePage(driver);
        home.selectFromCategory();
        category = new SubCategoryPage(driver);
        category.openProductPage();
        product = new ProductPage(driver);
        product.addToCart(true);
        shopping =new ShoppingCartPage(driver);
        shopping.updateNumberOfProduct("1");
        shopping.ProceedToCheckout();
        method = new CheckOutMethodPage(driver);
        method.getCheckoutPage();
        info = new BillingInformation(driver);
        info.fillBillingInformationFields(data.getFname(), data.getLname(), data.getEmail(), data.getAddress(), data.getCity(), data.getZip(), data.getPhoneNo());
        checkout = new CheckOutPage(driver);
        checkout.finishCheckout();
    }
}

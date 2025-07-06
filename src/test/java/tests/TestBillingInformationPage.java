package tests;

import data.UserValidData;
import org.testng.annotations.Test;
import pages.*;

public class TestBillingInformationPage extends TestBase{
    HomePage home;
    SubCategoryPage category;
    ProductPage product;
    BillingInformation info;
    UserValidData user;
    ShopingCartPage shopping;
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
        shopping =new ShopingCartPage(driver);
        shopping.updateNumberOfProduct("1");
        shopping.ProceedToCheckout();
        method = new CheckOutMethodPage(driver);
        method.getCheckoutPage();
        info = new BillingInformation(driver);
        user = new UserValidData();
        info.fillBillingInformationFields(user.getFname(), user.getLname(), user.getEmail(), user.getAddress(), user.getCity(), user.getZip(), user.getPhoneNo());
        checkout = new CheckOutPage(driver);
        checkout.finishCheckout();
    }
}

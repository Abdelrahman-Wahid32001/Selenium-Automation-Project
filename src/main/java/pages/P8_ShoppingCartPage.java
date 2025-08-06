package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.ElementsActions.Click;
import static utilities.ElementsActions.SetText;

public class P8_ShoppingCartPage  {
    private  final WebDriver driver;
    public P8_ShoppingCartPage (WebDriver driver){
        this.driver = driver;
    }

    private final By proceedToCheckoutBtn = By.xpath("//*[@id='main-content']/div/div[1]/ul/li/button");
    private final By discountCodesBox = By.id("coupon_code");
    private final By applyDiscountBtn = By.cssSelector("button.button2");
    private final By ProductQtyBox = By.cssSelector("input[title='Qty']");
    private final By ProductUpdateBtn = By.xpath( "//*[@id=\"shopping-cart-table\"]/tbody/tr/td[4]/button");
    private final By removeItemX = By.cssSelector("a[title='Remove Item']");


    public P8_ShoppingCartPage modifyNumberOfProduct(String num) {
        SetText(driver, ProductQtyBox, num);
        Click(driver,ProductQtyBox);
        return this;
    }
    public P8_ShoppingCartPage updateNumberOfProduct() {
        Click(driver, ProductUpdateBtn);
        return this;
    }


    public P8_ShoppingCartPage removeFirstItem() {
        Click(driver, removeItemX);
        return this;
    }

    public P8_ShoppingCartPage addDiscountCode(String code) {
        SetText(driver, discountCodesBox, code);
        Click(driver, applyDiscountBtn);
        return this;
    }

    public P8_ShoppingCartPage proceedToCheckout() {
        Click(driver, proceedToCheckoutBtn);
        return this;
    }

}

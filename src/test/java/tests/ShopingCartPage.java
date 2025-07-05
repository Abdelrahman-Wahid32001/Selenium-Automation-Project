package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.PageBase;

public class ShopingCartPage extends PageBase {
    public ShopingCartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "button.button btn-proceed-checkout btn-checkout")
    WebElement proceedToCheckoutBtn;
    @FindBy(id = "coupon_code")
    WebElement discountCodesTxt;
    @FindBy(css = "button.button2")
    WebElement applyDiscountBtn;
    @FindBy(css = "#shopping-cart-table tbody tr:nth-child(1) .input-text.qty")
    WebElement firstProductQtyInput;
    @FindBy(css = "#shopping-cart-table tbody tr:nth-child(1) .btn-update")
    WebElement firstProductUpdateBtn;
    @FindBy (xpath = "#shopping-cart-table tbody tr:nth-child(1) .product-cart-remove a[title='Remove Item']")
    WebElement removeItem;

    public void updateNumberOfProduct(String num){
        setTxt(firstProductQtyInput,num);
        clickBtn(firstProductUpdateBtn);
    }
    public void removeFirstItem(){
        clickBtn(removeItem);
    }
    public void addDiscountCode(String code){
        setTxt(discountCodesTxt,code);
        clickBtn(applyDiscountBtn);

    }
    public void ProceedToCheckout(){
        clickBtn(proceedToCheckoutBtn);
    }

}

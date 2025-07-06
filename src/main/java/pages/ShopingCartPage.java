package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class ShopingCartPage extends PageBase {
    public ShopingCartPage(WebDriver driver) {
        super(driver);
    }

    private final By proceedToCheckoutBtnLocator = By.xpath("//*[@id='main-content']/div/div[1]/ul/li/button");
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
        firstProductQtyInput.clear();
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
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))           // وقت الانتظار الكلي
                .pollingEvery(Duration.ofSeconds(2))           // كل قد ايه يجرب يشوف العنصر ظهر ولا لا
                .ignoring(NoSuchElementException.class);
        WebElement proceedBtn = wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckoutBtnLocator));

        clickBtn(proceedBtn);
    }

}

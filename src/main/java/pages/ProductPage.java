package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.PageBase;

public class ProductPage extends PageBase {
    public ProductPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("Product Page");
    }
    @FindBy(id = "swatch79")
    WebElement sizeM;
    @FindBy(xpath = "/span[1]/img")
    WebElement colorBlue;
    @FindBy(xpath = "//*[@id='swatch22']/span[1]/img")
    WebElement colorWhite;
    @FindBy(css = "button.button.btn-cart")
    WebElement addToCartButton;

    public void addToCart(){
        clickBtn(sizeM);
        clickBtn(colorBlue);
        clickBtn(addToCartButton);
    }

    public void addToCart(boolean bool){
        clickBtn(sizeM);
        clickBtn(colorWhite);
        clickBtn(addToCartButton);
    }
}

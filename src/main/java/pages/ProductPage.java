package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageBase{
    public ProductPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"swatch81\"]/span[1]")
    WebElement sizeXS;
    @FindBy(xpath = "//*[@id=\"swatch27\"]/span[1]/img")
    WebElement colorBlue;
    @FindBy(css = "button.button.btn-cart")
    WebElement addToCartButton;

    public void addToCart(){
        clickBtn(sizeXS);
        clickBtn(colorBlue);
        clickBtn(addToCartButton);
    }
}

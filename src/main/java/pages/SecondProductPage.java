package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.PageBase;

public class SecondProductPage extends PageBase {
    public SecondProductPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("Forget Password Page");

    }
    @FindBy(css = "img[alt='White']")
    WebElement colorWhite;
    @FindBy(xpath = "//*[@id=\"swatch78\"]/span[1]")
    WebElement sizeL;
    @FindBy(css = "button[title='Add to Cart']")
    WebElement submitTheProduct;

    public void selectTheProduct(){
        clickBtn(colorWhite);
        clickBtn(sizeL);
        clickBtn(submitTheProduct);
    }
}

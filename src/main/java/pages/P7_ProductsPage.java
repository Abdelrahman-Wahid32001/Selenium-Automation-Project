package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.ElementsActions.Click;

public class P7_ProductsPage  {
    private final By chelseaTeeWhite = By.id("product-collection-image-409");
    private final By LinenBlazer = By.cssSelector("img[alt='Linen Blazer']");
    private final By sizeM = By.id("option79");
    private final By colorWhite = By.id("swatch22");
    private final By addToCartBtn = By.cssSelector("button[title='Add to Cart']");

    private  final WebDriver driver;
    public P7_ProductsPage (WebDriver driver){
        this.driver = driver;
    }

    public void setChelseaTeeWhite() {
        //Click(driver, chelseaTeeWhite);
        Click(driver, sizeM);
        Click(driver, colorWhite);
        Click(driver, addToCartBtn);
    }
    public void setLinenBlazer() {
        Click(driver, LinenBlazer);
        Click(driver, sizeM);
        Click(driver, colorWhite);
        Click(driver, addToCartBtn);
    }
    public void setFrenchCuff() {
        Click(driver, sizeM);
        Click(driver, colorWhite);
        Click(driver, addToCartBtn);
    }
    public void setAddToCart(){
        Click(driver, addToCartBtn );
    }

}
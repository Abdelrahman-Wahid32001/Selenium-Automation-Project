package pages;
import org.openqa.selenium.*;
import utilities.BrowserActions;

import static utilities.ElementsActions.*;

public class P0_HomePage  {
    private  final WebDriver driver;
    public P0_HomePage (WebDriver driver){
        this.driver = driver;
    }


    private final By accountButton = By.xpath( "//*[@id=\"header\"]/div[1]/div[2]/a[1]/span");
    private final By contactUs = By.xpath("/html/body/div/div/footer/div/div[2]/ul/li[2]/a");
    private final By newProductSectionItem2 = By.cssSelector("a[title='Linen Blazer']");
    private final By manCategory = By.xpath("//*[@id=\"nav\"]/ol/li[2]/a");
    private final By shirtsOnManCategoryBtn = By.xpath("//*[@id=\"nav\"]/ol/li[2]/ul/li[3]/a") ;
    private final By goToHomeByLogo = By.cssSelector("a.logo");

    public P0_HomePage navigateToPage() {
        BrowserActions.navigateToURL(driver, "https://demo.mahocommerce.com/");
    return this;
    }
    public P0_HomePage goToHomeByLogo(){
        Click(driver,goToHomeByLogo);
        return this;
    }
    public void openAccountPage() {
        Click(driver,accountButton);
    }
    public void openContactUsPage(){
       Click(driver,contactUs);
    }
    public void selectProductItem(){
        Click(driver,newProductSectionItem2);
    }
    public void selectFromCategory() {
        hoverAndClick(driver,manCategory,shirtsOnManCategoryBtn);
        }


}
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.ElementsActions.Click;


public class P6_SubCategoryPage {
    private  final WebDriver driver;
    public P6_SubCategoryPage (WebDriver driver){
        this.driver = driver;
    }

    private final By shirtsPriceFilter = By.xpath("//*[@id='narrow-by-list']/dd[1]/ol/li[3]/a/span");
    private final By shirtsColorWhite = By.xpath ( "//*[@id='narrow-by-list']/dd[2]/ol/li[6]/a/img") ;
    private final By manShirtsFrench =By.cssSelector("a[title='French Cuff Cotton Twill Oxford']")  ;

    public void getFrenchCuffItemPage() {
        Click(driver,manShirtsFrench);

    }
    public P6_SubCategoryPage filterByBrice(){
        Click(driver,shirtsPriceFilter);
        return this;
    }
    public P6_SubCategoryPage filterByColor(){
        Click(driver,shirtsColorWhite);
        return this;
    }




}

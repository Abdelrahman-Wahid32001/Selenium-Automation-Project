package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.BrowserActions;
import utilities.LogsUtils;

import static utilities.ElementsActions.*;

public class P5_SearchPage  {

    private  final WebDriver driver;
    public P5_SearchPage (WebDriver driver){
        this.driver = driver;
    }

    private final By SearchBox = By.id("search");
    private final By SearchBtn = By.cssSelector("button.button.search-button");
    private final By suggestionItem = By.cssSelector("#products-list > li");
    private final By chelseaTeeWhiteBtn = By.id("product-collection-image-409");


    //Action
    public void navigateToPage() {
        BrowserActions.navigateToURL(driver, "https://demo.mahocommerce.com/");
    }

    @Step("enter all product name  in search box : {productName}")
    public P5_SearchPage setSearchBArTxt(String productName) {
        SetText(driver, SearchBox, productName);
        Click(driver, SearchBtn);
        return this;
    }

    @Step("Open product details page ")
    public P5_SearchPage openDetailsProductPage() {
        Click(driver, chelseaTeeWhiteBtn);
        return this;
    }

    @Step("Writing letter of product name on search box  : {text}")
    public P5_SearchPage getProductFromSuggestionSearch(String text) {
        SetText(driver, SearchBox, text);

        // إذا لم تظهر العناصر، أعد الكتابة مرة أخرى
        if (!getProductFromList(driver, suggestionItem)) {
            LogsUtils.warn("Retrying search due to missing suggestions...");
            SetText(driver, SearchBox, text);
            getProductFromList(driver, suggestionItem);
        }
        return this;
    }

    //Validation
    public void assertSuccessfulSearch() {
        Assert.assertEquals(BrowserActions.currentURL(driver), "url");
    }
}
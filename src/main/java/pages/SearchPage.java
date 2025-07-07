package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.PageBase;

import java.util.List;

public class SearchPage extends PageBase {

    public SearchPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("Search Page");
    }

    @FindBy(id = "search")
    WebElement SearchBArTxt;

    @FindBy(css = "button.button.search-button")
    WebElement SearchBtn;

    @FindBy(id = "products-list")
    List<WebElement> ProductList;

    @FindBy(id = "product-collection-image-410")
    WebElement viewDetails;


    public void setSearchBArTxt(String productName) {
        setTxt(SearchBArTxt, productName);
        clickBtn(SearchBtn);

    }

    public void openDetailsProductPage() {
        clickBtn(viewDetails);
    }

    public void openAllListProductPage(String txt) {

        SearchBArTxt.clear();
        setTxt(SearchBArTxt, txt);
        ProductList.getFirst().click();
    }
}
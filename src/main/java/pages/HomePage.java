package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[2]/a[1]/span")
    WebElement accountButton;

    public void openAccountPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(accountButton));
        accountButton.click();
    }

    @FindBy(xpath= "/html/body/div/div/footer/div/div[2]/ul/li[2]/a")
    WebElement contactUs;
    public void openContactUsPage(){
        scrollDown();
        clickBtn(contactUs);
    }

    @FindBy (xpath = "//*[@id=\"main-content\"]/div/div[3]/div[2]/ul/li[3]")
    WebElement newProductSectionItem2;
     public void selectProductItem(){
         clickBtn(newProductSectionItem2);
     }

     @FindBy(css = "li.level0.nav-2 parent")
    WebElement manCategory;
     @FindBy(css = "li.level1.nav-2-2")
    WebElement shirtsOnManCategoryBtn;

     public void selectFromCategory(){
         action
                 .click(manCategory)
                 .click(shirtsOnManCategoryBtn)
                 .build()
                 .perform();
     }


}
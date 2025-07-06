package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;

public class HomePage extends PageBase {
    public HomePage(WebDriver driver) {
        super(driver);
        action = new Actions(driver);
        jse = (JavascriptExecutor) driver;
    }

    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div[2]/a[1]/span")
    WebElement accountButton;
    @FindBy(xpath= "/html/body/div/div/footer/div/div[2]/ul/li[2]/a")
    WebElement contactUs;
    @FindBy (xpath = "//*[@id=\"main-content\"]/div/div[3]/div[2]/ul/li[3]")
    WebElement newProductSectionItem2;
    @FindBy(xpath= "//*[@id=\"nav\"]/ol/li[2]/a")
    WebElement manCategory;
    @FindBy (xpath ="//*[@id=\"nav\"]/ol/li[2]/ul/li[3]/a")
    WebElement shirtsOnManCategoryBtn ;


    public void openAccountPage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(accountButton));
        accountButton.click();
    }

    public void openContactUsPage(){
        scrollDown();
        clickBtn(contactUs);
    }

     public void selectProductItem(){
         clickBtn(newProductSectionItem2);
     }

    public void selectFromCategory() {

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))           // وقت الانتظار الكلي
                .pollingEvery(Duration.ofSeconds(2))           // كل قد ايه يجرب يشوف العنصر ظهر ولا لا
                .ignoring(NoSuchElementException.class);

        // Hover على Men لإظهار القائمة المنسدلة
            wait.until(ExpectedConditions.visibilityOf(manCategory));
            action.moveToElement(manCategory).perform();

            // انتظر حتى يكون رابط Shirts مرئي وقابل للضغط
            wait.until(ExpectedConditions.visibilityOf(shirtsOnManCategoryBtn));
            action.moveToElement(shirtsOnManCategoryBtn).click().build().perform();

        }



}
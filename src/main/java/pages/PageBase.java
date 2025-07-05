package pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;
    public JavascriptExecutor jse;
    Actions action ;
    public PageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);
        jse = (JavascriptExecutor) driver;
        action = new Actions(driver);
    }

    protected static void setTxt(WebElement element, String word ){
        element.sendKeys(word);
    }
    protected static void clickBtn(WebElement element){
        element.click();
    }
    public void scrollDown(){
        jse.executeScript("scrollBy(0,2500)");
    }


}
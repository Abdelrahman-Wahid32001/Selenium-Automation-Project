package pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBase {
    protected WebDriver driver;
    public JavascriptExecutor jse;
    public Actions action ;
    public Select select;
    public Alert alert;
    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected static void setTxt(WebElement element, String word ){
        element.sendKeys(word);
    }
    protected static void setTxt(WebElement element, Integer number ){
        element.sendKeys(Integer.toString(number));
    }

    protected static void clickBtn(WebElement element){
        element.click();
    }
    public void scrollDown(){
        jse.executeScript("scrollBy(0,2500)");
    }
    public void cancelerAlert(){
        alert = driver.switchTo().alert();
        alert.dismiss();
    }


}
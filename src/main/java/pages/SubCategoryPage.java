package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.PageBase;


public class SubCategoryPage extends PageBase {
    public SubCategoryPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("Sub_Category Page");
    }

    @FindBy(xpath = "//*[@id=\"main-content\"]/div/ul/li/div[3]/a")
    WebElement manShirtsFrench;
    WebElement shirtsPriceFilter = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/dd[1]/ol/li[3]/a"));
    WebElement shirtsColorWhite = driver.findElement(By.xpath("//*[@id=\"narrow-by-list\"]/dd[2]/ol/li[6]/a/img"));

    public void openProductPage() {
        clickBtn(shirtsColorWhite);
        clickBtn(manShirtsFrench);


    }


}

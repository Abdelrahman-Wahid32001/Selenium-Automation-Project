package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.PageBase;

public class CheckOutMethodPage extends PageBase {
    public CheckOutMethodPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("CheckOutMethodPage");
    }
    WebElement checkoutAsGuest = driver.findElement(By.id("login:guest"));
    WebElement checkoutAsRegister = driver.findElement(By.id("login:register"));
    WebElement continuoBtn = driver.findElement(By.id("onepage-guest-register-button"));

    public void getCheckoutPage(){
        clickBtn(checkoutAsGuest);
        clickBtn(continuoBtn);
    }
    public void getCheckoutPage(String AsRegister){
        clickBtn(checkoutAsRegister);
        clickBtn(continuoBtn);
    }

}

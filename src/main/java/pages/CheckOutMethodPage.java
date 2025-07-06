package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutMethodPage extends PageBase{
    public CheckOutMethodPage(WebDriver driver) {
        super(driver);
    }
    WebElement checkoutAsGuest = driver.findElement(By.id("login:guest"));
    WebElement checkoutAsRegister = driver.findElement(By.id("login:register"));
    WebElement continuoBtn = driver.findElement(By.id("onepage-guest-register-button"));

    public void getCheckoutPage(){
        clickBtn(checkoutAsGuest);
        clickBtn(continuoBtn);
    }
    public void getCheckoutPage(boolean bool){
        clickBtn(checkoutAsRegister);
        clickBtn(continuoBtn);
    }

}

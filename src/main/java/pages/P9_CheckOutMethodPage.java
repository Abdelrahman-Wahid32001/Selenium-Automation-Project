package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utilities.ElementsActions.Click;

public class P9_CheckOutMethodPage  {
    private  final WebDriver driver;
    public P9_CheckOutMethodPage(WebDriver driver){
        this.driver = driver;
    }
    private final By checkoutAsGuest = By.id("login:guest");
    private final By checkoutAsRegister = By.id("login:register");
    private final By continuoBtn = By.id("onepage-guest-register-button");

    public void getCheckoutPage(){
        Click(driver,checkoutAsGuest);
        Click(driver,continuoBtn);
    }
    public void getCheckoutPage(String AsRegister){
        Click(driver,checkoutAsRegister);
        Click(driver,continuoBtn);
    }

}

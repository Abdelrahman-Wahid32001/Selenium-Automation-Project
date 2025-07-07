package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.PageBase;


public class AccountPage extends PageBase {

    public AccountPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("AccountPage");
    }

    @FindBy(xpath = "//a[@title='Create an Account']")
    WebElement createAccountLink;

/// Login WebElements
    @FindBy(id ="email")
    WebElement loginEmailTxt;
    @FindBy(id ="pass")
    WebElement loginPasswordTxt;
    @FindBy(id ="send2")
    WebElement loginBtn;

    WebElement forgotPasswordBtn = driver.findElement(By.cssSelector("a.f-left"));



    public void createNewAccount(){
        clickBtn(createAccountLink);

    }
/// login Methods
    public WebElement getLoginEmailTxt() {
        return loginEmailTxt;
    }
    public WebElement getLoginPasswordTxt() {
        return loginPasswordTxt;
    }
    public WebElement getLoginBtn() {
       return loginBtn;
    }
    /// ForgotPassword Methods
     public void goForgotPasswordPage(){
         clickBtn(forgotPasswordBtn);
     }

}

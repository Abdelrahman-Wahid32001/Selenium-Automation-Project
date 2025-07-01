package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AccountPage extends PageBase {

    public AccountPage(WebDriver driver) {
        super(driver);
        System.out.println(driver.getCurrentUrl());
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

    @FindBy(css = "a.f-left")
    WebElement forgotPasswordBtn;



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

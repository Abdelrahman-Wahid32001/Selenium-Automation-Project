package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.PageBase;

import java.time.Duration;

public class LoginPage extends PageBase {
    public LoginPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("Login Page");
    }

    AccountPage loginAccount;

    @FindBy(linkText = "Click here")
    WebElement clickHereToConfirmLoginBtn;

    @FindBy(css = "button[title='Submit']")
    WebElement submitToSendConfirmationLoginBtn;

    @FindBy (css = "ul.messages")
    public WebElement infoMessageLoginConfirmed;

    @FindBy (css = "a.logo")
    WebElement goToHomeByLogo;

    public void setLoginFields(String Email ,String pass){
        loginAccount = new AccountPage(driver);
        setTxt(loginAccount.getLoginEmailTxt(),Email);
        setTxt(loginAccount.getLoginPasswordTxt(),pass);
        clickBtn(loginAccount.getLoginBtn());

    }
    public void confirmLogin(){

            new WebDriverWait(driver, Duration.ofSeconds(10))
                    .until(ExpectedConditions.elementToBeClickable(clickHereToConfirmLoginBtn));
            clickHereToConfirmLoginBtn.click();

    }
    public void submitConfirmationLogin(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(submitToSendConfirmationLoginBtn));
        submitToSendConfirmationLoginBtn.click();


    }

    public void goToHomeByLogo(){
        clickBtn(goToHomeByLogo);
    }
}

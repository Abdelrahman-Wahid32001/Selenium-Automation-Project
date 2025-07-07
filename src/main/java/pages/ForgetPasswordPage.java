package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.PageBase;

public class ForgetPasswordPage extends PageBase {

    public ForgetPasswordPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("Forget Password Page");
    }

    @FindBy(id = "email_address")
     WebElement  forgotPassEmailTxt;
    @FindBy(css = "button[title='Submit']")
     public WebElement submitForgotPasswordBtn;

    public void setForgotPasswordField(String Email){
        forgotPassEmailTxt.clear();
        setTxt(forgotPassEmailTxt,Email);
        clickBtn(submitForgotPasswordBtn);
    }
}

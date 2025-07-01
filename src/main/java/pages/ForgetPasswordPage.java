package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ForgetPasswordPage extends PageBase {

    public ForgetPasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email_address")
     WebElement  forgotPassEmailTxt;

    public void setForgotPasswordField(String Email){
        setTxt(forgotPassEmailTxt,Email);

    }
}

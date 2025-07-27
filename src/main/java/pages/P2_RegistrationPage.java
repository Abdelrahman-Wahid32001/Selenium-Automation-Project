package pages;
import org.openqa.selenium.*;

import static utilities.ElementsActions.Click;
import static utilities.ElementsActions.SetText;

public class P2_RegistrationPage {
    private  final WebDriver driver;
    public P2_RegistrationPage (WebDriver driver){
        this.driver = driver;
    }
    private final By  firstName = By.id("firstname");
    private final By lastName = By.id("lastname");
    private final By email = By.id("email_address");
    private final By password = By.id( "password");
    private final By confirmPassword = By.id("confirmation");
    private final By registerBtn = By.cssSelector("button.button");
    private final By registeredAccount = By.linkText("click here");
    private final By backToAccountPage = By.xpath( "//*[@id=\"form-validate\"]/div/p/a");


    public void userRegistration(String fname, String lname, String emailText, String pass) {
       SetText(driver,firstName,fname);
       SetText(driver,lastName,lname);
        SetText(driver,email,emailText);
        SetText(driver,password,pass);
        SetText(driver,confirmPassword,pass);
        Click(driver,registerBtn);
    }

    public By getRegisteredAccountCorrectly() {
        return registeredAccount;
    }
    public void getBackToAccountPage(){Click(driver,backToAccountPage);
    }

}
package pages;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import utilities.PageBase;

public class RegistrationPage extends PageBase {
    public RegistrationPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("Registration Page");
    }

    @FindBy(id = "firstname")
    WebElement firstName;

    @FindBy(id = "lastname")
    WebElement lastName;

    @FindBy(id = "email_address")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "confirmation")
    WebElement confirmPassword;

    @FindBy(css = "button.button")
    WebElement registerBtn;

    @FindBy(linkText = "click here")
    WebElement registeredAccount;

    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/p/a")
    WebElement backToAccountPage;


    public void userRegistration(String fname, String lname, String emailText, String pass) {
       setTxt(firstName,fname);
       setTxt(lastName,lname);
        setTxt(email,emailText);
        setTxt(password,pass);
        setTxt(confirmPassword,pass);
        clickBtn(registerBtn);
    }

    public WebElement getRegisteredAccountCorrectly() {
        return registeredAccount;
    }
    public void getBackToAccountPage(){
        clickBtn(backToAccountPage);
    }

}
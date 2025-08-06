package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utilities.ElementsActions;

import static utilities.ElementsActions.Click;
import static utilities.ElementsActions.SetText;

public class LoginPage {

     private final WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver = driver;
    }



        private final By loginEmailBxt = By.id("email");
        private final By loginPasswordBox = By.id("pass");
        private final By loginBtn = By.id("send2");
        private final By ConfirmLoginBtn = By.linkText("Click here");
        private final By loginEmailBtn_2 = By.cssSelector("button[title='Submit']");
        private final By infoMessageLoginConfirmed = By.cssSelector("ul.messages");
        private final By forgotPasswordBtn = By.cssSelector("a.f-left");
        private final By createAccountLink = By.xpath ("//a[@title='Create an Account']") ;
        private final By messageAfterLogin = By.xpath("//*[@id=\"main-content\"]/div/ul/li/ul/li");


        @Step("Enter Eamil and password:{0},{1}")
        public LoginPage setLoginFields(String Email , String pass){
            SetText(driver,loginEmailBxt,Email);
            SetText(driver,loginPasswordBox,pass);
            return this;
        }

        public LoginPage clickLoginBtn(){
            Click(driver, loginBtn);
            return this;
        }
        public LoginPage getConfirmationLoginEmail(){
            Click(driver,ConfirmLoginBtn);
            return this;
        }

        public LoginPage setConfirmationLoginEmail(){
            Click(driver, loginEmailBtn_2);
            return this;
        }

        public LoginPage goForgotPasswordPage(){
            Click(driver,forgotPasswordBtn);
            return this;
        }
        public LoginPage createNewAccount(){
            Click(driver,createAccountLink);
            return this;
        }

        public String successfulLoginMssg(){
            return ElementsActions.getText(driver,messageAfterLogin);
        }

        //Validation
        public void assertSuccessfulLogin(){
            Assert.assertEquals(successfulLoginMssg(),"This account is not confirmed. Click here to resend confirmation email.");
        }

    }




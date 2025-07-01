package pages;

import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    AccountPage loginAccount;

    public void setLoginFields(String Email ,String pass){
        loginAccount = new AccountPage(driver);
        setTxt(loginAccount.getLoginEmailTxt(),Email);
        setTxt(loginAccount.getLoginPasswordTxt(),pass);
        clickBtn(loginAccount.getLoginBtn());
    }
}

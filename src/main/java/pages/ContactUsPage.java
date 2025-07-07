package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.PageBase;

public class ContactUsPage extends PageBase {
    public ContactUsPage(WebDriver driver) {
        super(driver);
        logCurrentUrl("ContactUsPage");
    }

    @FindBy(id = "name")
    WebElement Name;
    @FindBy(id = "email")
    WebElement Email;
    @FindBy(id = "telephone")
    WebElement phone;
    @FindBy(id = "comment")
    WebElement massage;
    @FindBy(css = "button[type='submit']")
    WebElement submitBtn;


    @FindBy(id = "messages_product_view")
    public WebElement infoMessageContactUsPage;
    @FindBy(id = "advice-required-entry-comment")
    public WebElement errorMessageContactUsPage;

    public void fullContactUsFields(String name , String email, String masg){
        setTxt(Name,name);
        setTxt(Email,email);
        setTxt(massage,masg);
        clickBtn(submitBtn);
    }

}

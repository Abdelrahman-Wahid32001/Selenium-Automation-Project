package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class BillingInformation extends PageBase{
    public BillingInformation(WebDriver driver) {
        super(driver);
        jse = (JavascriptExecutor) driver;

    }
    WebElement firstName = driver.findElement(By.id("billing:firstname"));
    WebElement lastName = driver.findElement(By.id("billing:lastname"));
    WebElement email = driver.findElement(By.id("billing:email"));
    WebElement address = driver.findElement(By.id("billing:street1"));
    WebElement city = driver.findElement(By.id("billing:city"));
    WebElement stateDropList = driver.findElement(By.id("billing:region_id"));
    WebElement postalCode = driver.findElement(By.id("billing:postcode"));
    WebElement countryDroplist = driver.findElement(By.id("billing:country_id"));
    WebElement telephone = driver.findElement(By.id("billing:telephone"));
    WebElement password = driver.findElement(By.id("billing:customer_password"));
    WebElement confirmPassword = driver.findElement(By.id("billing:confirm_password"));
    WebElement addressTypeBtn = driver.findElement(By.id("billing:use_for_shipping_yes"));
    WebElement  continueBtn = driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button"));


    public void fillBillingInformationFields(String fname,String lname,String Email,String Address,String City,String ZIP,int telephoneNo,String pass){
        setTxt(firstName,fname);
        setTxt(lastName,lname);
        setTxt(email,Email);
        setTxt(address,Address);
        setTxt(city,City);
        setTxt(postalCode,ZIP);
        setTxt(telephone,telephoneNo);
        setTxt(password,pass);
        setTxt(confirmPassword,pass);
        select = new Select(stateDropList);
        select.selectByValue("5");
        select = new Select(countryDroplist);
        select.selectByIndex(229);
        //jse.executeScript("arguments[0].scrollIntoView(true);", continueBtn);
        clickBtn(addressTypeBtn);
        clickBtn(continueBtn);

    }

    public void fillBillingInformationFields(String fname,String lname,String Email,String Address,String City,String ZIP,int telephoneNo){

        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))           // وقت الانتظار الكلي
                .pollingEvery(Duration.ofSeconds(2))           // كل قد ايه يجرب يشوف العنصر ظهر ولا لا
                .ignoring(NoSuchElementException.class);
        setTxt(firstName,fname);
        setTxt(lastName,lname);
        setTxt(email,Email);
        setTxt(address,Address);
        setTxt(city,City);
        setTxt(postalCode,ZIP);
        setTxt(telephone,telephoneNo);
        select = new Select(stateDropList);
        select.selectByValue("5");
        select = new Select(countryDroplist);
        select.selectByIndex(231);
        //scrollDown();
        jse.executeScript("arguments[0].scrollIntoView(true);", continueBtn);
        clickBtn(addressTypeBtn);
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        clickBtn(continueBtn);

    }
}

package pages;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class CheckOutPage extends PageBase {
    public CheckOutPage(WebDriver driver) {
        super(driver);

    }

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/button")
    WebElement continuoToPaymentPageBtn;
    @FindBy(xpath = "//*[@id=\"payment-buttons-container\"]/button")
    WebElement continuoToOrderReviewPageBtn;
    @FindBy(xpath = "//*[@id=\"review-buttons-container\"]/button")
    WebElement submittingOrderBtnLocator;
    //private final By submittingOrderBtnLocator = By.xpath("//*[@id=\"review-buttons-container\"]/button");


    public void finishCheckout() {
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);
        clickBtn(continuoToPaymentPageBtn);
        clickBtn(continuoToOrderReviewPageBtn);
        WebElement submittingOrderBtn = wait.until(ExpectedConditions.elementToBeClickable(submittingOrderBtnLocator));

        clickBtn(submittingOrderBtn);
    }
}

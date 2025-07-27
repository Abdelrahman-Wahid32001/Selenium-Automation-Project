package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ElementsActions {
@Step("Sending data:{data} to the element: {locator}")
    public static void SetText(WebDriver driver, By locator, String data){
        Waits.waitForElementVisible(driver, locator);
        WebElement el = findElement(driver, locator);
        Scrolling.scrollToElement(driver, locator);
        //el.click();
        el.clear();
        el.sendKeys(data);
        LogsUtils.info("Data entered: " + data + "' into " + locator.toString());
    }

@Step("Clicking on element : {loacator}")
    public static void Click(WebDriver driver , By locator){
            Waits.waitForElementClickable(driver, locator);
            Scrolling.scrollToElement(driver, locator);
            findElement(driver, locator).click();
            LogsUtils.info("Clicking on element: ", locator.toString());

        }

        @Step("Hover on element :{locator} and clicking on element :{locator1}")

    public static void hoverAndClick(WebDriver driver , By locator, By locator1){
        Waits.waitForElementVisible(driver, locator);
        //Scrolling.scrollToElement(driver, locator);
        new Actions(driver).moveToElement(findElement(driver, locator)).perform();
        LogsUtils.info("Hover on element: " + locator.toString());
        findElement(driver, locator1).click();
        LogsUtils.info("Hover and click on element: " + locator1.toString());
    }
@Step("Selecting From list :{locator} the element of index :{index}")
    public static void Select (WebDriver driver , By locator,Integer index) {
        Waits.waitForElementVisible(driver, locator);
        Scrolling.scrollToElement(driver, locator);
        new Select(findElement(driver,locator)).selectByIndex(index);
        LogsUtils.info("Select the item with index : ", index.toString());
    }
        public static String getText(WebDriver driver, By locator){
            Waits.waitForElementVisible(driver,locator);
            Scrolling.scrollToElement(driver, locator);
            LogsUtils.info("Getting the text from the " + locator.toString() + " Text: " + findElement(driver,locator).getText());
            return findElement(driver, locator).getText();
        }
@Step("Finding element : {locator}")
        public static WebElement findElement(WebDriver driver, By locator){
            return driver.findElement(locator);
        }


        public static void confirmAlert(WebDriver driver){
            Waits.waitAlertToBePresent( driver);
            driver.switchTo().alert().accept();
        }

        public static void declineAlert(WebDriver driver){
            Waits.waitAlertToBePresent(driver);
            driver.switchTo().alert().dismiss();
        }

    public static boolean getProductFromList(WebDriver driver, By locator) {
        try {
            Waits.waitForElementVisible(driver, locator); // وقت انتظار قصير
            List<WebElement> list = driver.findElements(locator);
            if (!list.isEmpty()) {
                list.get(0).click();
                LogsUtils.info("Clicked on first suggestion: " + list.get(0).getText());
                return true;
            } else {
                LogsUtils.warn("No suggestions appeared.");
                return false;
            }
        } catch (Exception e) {
            LogsUtils.error("Suggestion list did not appear at all.");
            return false;
        }
    }

}














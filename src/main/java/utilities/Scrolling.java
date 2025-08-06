package utilities;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static utilities.ElementsActions.findElement;

public class Scrolling {
     private Scrolling(){
     }
@Step("Scrolling to the element:{0}")
    public static void scrollToElement(WebDriver driver, By locator){
        LogsUtils.info("Scrolling to the element: ", locator.toString());
         ((JavascriptExecutor) driver).executeScript(
                "var element = arguments[0];" +
                        "var rect = element.getBoundingClientRect();" +
                        "window.scrollBy(0, rect.top + window.pageYOffset - (window.innerHeight / 2));",
                findElement(driver, locator)
        );
    }

}

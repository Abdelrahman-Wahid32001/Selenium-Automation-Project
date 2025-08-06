package utilities;

import drivers.DriverManager;
import org.openqa.selenium.WebDriver;

public class BrowserActions {
    private BrowserActions(){}
    public static void navigateToURL(WebDriver driver , String url){
        driver.get(url);
    }
    public static String currentURL(WebDriver driver){
        return driver.getCurrentUrl();
    }
    public static WebDriver refreshDreiver(){
        return DriverManager.getDriver();
    }
    public static void clossBrowser(WebDriver driver){
        if (driver != null) {
            driver.quit();
        };
    }
}

package drivers;

import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class BrowserFactory {
    public static WebDriver getBrowser(String browserName){
        switch (browserName.toLowerCase(Locale.ROOT)){
            case "chrome":
                return  new D1_ChromeOption().startDriver();
            case "firefox":
                return new D3_FirefoxOption().startDriver();
            default:
                return new D2_EdgeOption().startDriver();
        }
    }
}

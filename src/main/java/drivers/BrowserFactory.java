package drivers;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.Locale;
import java.util.Map;

public class BrowserFactory {
    public static WebDriver getBrowser(String browserName){
        switch (browserName.toLowerCase(Locale.ROOT)){
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--start-maximized");
                chromeOptions.addArguments("--disable-extensions");
                chromeOptions.addArguments("--disable-infobars");
                chromeOptions.addArguments("--disable-notifications");
                chromeOptions.addArguments("--remote-allow-origins=*");
                Map<String, Object> chromePrefs = Map.of(
                        "profile.default_content_setting_values.notifications", 2,
                        "credentials_enable_service", false,
                        "profile.password_manager_enabled", false,
                        "autofill.profile_enabled", false
                );

                chromeOptions.setExperimentalOption("prefs", chromePrefs);
                chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                return new ChromeDriver(chromeOptions);
            case "firefox":
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.addArguments("--start-maximized");
                firefoxOptions.addArguments("--disable-extensions");
                firefoxOptions.addArguments("--disable-infobars");
                firefoxOptions.addArguments("--disable-notifications");
                firefoxOptions.addArguments("--remote-allow-origins=*");

                firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                firefoxOptions.setAcceptInsecureCerts(true);
                return new FirefoxDriver(firefoxOptions);
            default:
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--start-maximized");
                edgeOptions.addArguments("--disable-extensions");
                edgeOptions.addArguments("--disable-infobars");
                edgeOptions.addArguments("--disable-notifications");
                edgeOptions.addArguments("--remote-allow-origins=*");
                Map<String, Object> edgePrefs = Map.of(
                        "profile.default_content_setting_values.notifications", 2,
                        "credentials_enable_service", false,
                        "profile.password_manager_enabled", false,
                        "autofill.profile_enabled", false
                );
                edgeOptions.setExperimentalOption("prefs", edgePrefs);

                edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
                return new EdgeDriver(edgeOptions);
        }
    }
}

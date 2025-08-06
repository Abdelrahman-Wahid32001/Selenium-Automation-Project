package drivers;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import utilities.LogsUtils;

import static org.testng.Assert.fail;

public class DriverManager {
    private static final ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    private DriverManager() {
        super();
    }

    @Step("create driver instance on: {browserName}")
    public static WebDriver createInstance(String browserName) {
        WebDriver driver = BrowserFactory.getBrowser(browserName);
        LogsUtils.info("Driver created on: ", browserName);
        setDriver(driver);
        return getDriver();
    }

    public static void setDriver(WebDriver driver) {
        driverThreadLocal.set(driver);
    }

    public static WebDriver getDriver() {
        if (driverThreadLocal.get() == null) {
            LogsUtils.info("Driver is null");
            fail("Driver is null");
        }
        return driverThreadLocal.get();
    }
}


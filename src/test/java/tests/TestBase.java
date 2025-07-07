package tests;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import utilities.CleanBrowser;
import utilities.ConfigReader;
import utilities.LoggerUtility;
import utilities.ScreenShots;

import java.time.Duration;
import java.util.Locale;

public class TestBase {
    public static WebDriver driver;
    public Logger logger = LoggerUtility.getLogger(TestBase.class);
    ConfigReader data = new ConfigReader();
    SoftAssert softAssert = new SoftAssert();
    @BeforeSuite
  @Parameters("browser")
    public void setUpEnvironment(String browserName) {
        logger.info("Selected browser: {}", browserName);
        switch (browserName.toLowerCase(Locale.ROOT)) {///
            case "firefox":
                driver = new FirefoxDriver();
                logger.info("FirefoxDriver launched.");
                break;
            case "edge":
                driver = new EdgeDriver();
                logger.info("EdgeDriver launched.");
                break;
            default:
                driver = CleanBrowser.createDriver();
                logger.info("Default browser (ChromeDriver) launched.");
                break;
        }

        driver.get("https://demo.mahocommerce.com/");
        logger.info("Navigated to: https://demo.mahocommerce.com/");
        driver.manage().window().maximize();
        //logger.info("Browser window maximized.");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //logger.info("Implicit wait set to 10 seconds.");
        logger.info("🧭 Current URL: {}" , driver.getCurrentUrl());


    }

    @AfterMethod
    public void screenShotFailure(ITestResult result) {
        String testName = result.getMethod().getMethodName();
        if (result.getStatus() == ITestResult.FAILURE) {
            logger.error("❌ Test Failed: {}" , testName);

            Throwable error = result.getThrowable();
            if (error != null) {
                logger.error("🔍 Exception thrown in test {}: {}", testName, error.getMessage(), error);
            }

            ScreenShots shot = new ScreenShots();
            shot.takeScreenShot(result);

            logger.info("📸 Screenshot captured for failed test: {}" , testName);
        } else if (result.getStatus() == ITestResult.SUCCESS) {
            logger.info("✅ Test Passed: {}" , testName);
        } else if (result.getStatus() == ITestResult.SKIP) {
            logger.warn("⚠️ Test Skipped: {}" , testName);
        }
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            logger.info("🔒 Browser closed and WebDriver quit.");
        }
    }
}

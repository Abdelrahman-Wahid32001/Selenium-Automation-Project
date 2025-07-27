package tests;

import drivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utilities.BrowserActions;
import utilities.ConfigReader;
import utilities.FilesUtils;
import utilities.ScreenShots;

import java.io.File;

public class TestBase {

    protected WebDriver driver; // Changed to protected to be accessible by subclasses
    File allure_results = new File("test-outputs/allure-results");
    public ConfigReader data = new ConfigReader();

    @BeforeSuite
    public void beforeSuite() {
        FilesUtils.deleteFiles(allure_results);
    }

    @BeforeMethod
    public void setUp() {
        // Create an instance of the WebDriver before each test method
        DriverManager.createInstance("edge");
        driver = DriverManager.getDriver(); // Assign the created driver to the protected field
    }

    @AfterMethod
    public void screenShotFailure(ITestResult result) {
        // No need for 'testName' if not used, but kept it for potential future use.
        // String testName = result.getMethod().getMethodName();

        if (result.getStatus() == ITestResult.FAILURE) {
            Throwable error = result.getThrowable();
            if (error != null) {
                System.err.println("Test failed: " + result.getName() + " with error: " + error.getMessage());
                // You might want to log the stack trace here as well
                 //error.printStackTrace();
            }

            ScreenShots shot = new ScreenShots();
            shot.takeScreenShot(result); // Assuming 'takeScreenShot' uses 'DriverManager.getDriver()' or the driver is passed
        }
        BrowserActions.clossBrowser(DriverManager.getDriver()); // This is the problem line

        // No need for empty else if blocks for SUCCESS or SKIP unless you have specific actions
    }

    @AfterSuite
    public void tearDown() {
        // Close the browser after all tests in the suite have completed
        BrowserActions.clossBrowser(DriverManager.getDriver()); // Or use 'driver' if you are consistent with its lifecycle
    }
}
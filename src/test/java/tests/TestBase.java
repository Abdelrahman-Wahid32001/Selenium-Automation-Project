package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import utilities.CleanBrowser;
import utilities.ScreenShots;

import java.time.Duration;
import java.util.Locale;

public class TestBase {
    public static WebDriver driver;

    @BeforeSuite
    @Parameters("browser")
    public void setUpEnvironment(String browserName) {
        switch (browserName.toLowerCase(Locale.ROOT)) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver  = CleanBrowser.createDriver();
                break;
        }
            driver.get("https://demo.mahocommerce.com/");
            driver.manage().window().maximize();
            System.out.println("🧭 Current URL: " + driver.getCurrentUrl());
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));



    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) driver.quit();
    }
    @AfterMethod
    public void screenShotFailure(ITestResult res){
        if(res.getStatus()==ITestResult.FAILURE){
            ScreenShots shot = new ScreenShots();
            shot.takeScreenShot(res);
        }
    }
}

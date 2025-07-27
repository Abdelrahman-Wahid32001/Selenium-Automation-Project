package utilities;


import drivers.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import tests.TestBase;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenShots {
    public void takeScreenShot(ITestResult result){


            TakesScreenshot tk = (TakesScreenshot) DriverManager.getDriver();
            File src = tk.getScreenshotAs(OutputType.FILE);

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File destFile = new File("./test-outputs/ScreenShots/" + result.getName() + "_" + timeStamp + ".png");

            try {
                FileUtils.copyFile(src,destFile);
            } catch (IOException e) {
            }
        }

    }


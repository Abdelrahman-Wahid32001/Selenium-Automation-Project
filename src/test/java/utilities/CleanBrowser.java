package utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class CleanBrowser {
    public static WebDriver createDriver() {
        ChromeOptions options = new ChromeOptions();

        // تعطيل ميزات الملء التلقائي قدر الإمكان
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        prefs.put("profile.autofill_profile_enabled", false); // تعطيل الملء التلقائي للعناوين
        prefs.put("autofill.enabled", false);
        options.setExperimentalOption("prefs", prefs);

        // مجلد بيانات مستخدم جديد
        String userDataDir = "C:/temp/cleanProfile-" + System.currentTimeMillis();
        options.addArguments("--user-data-dir=" + userDataDir);

        // وضع التخفي
        options.addArguments("--incognito");

        // أخرى
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-notifications");
        options.addArguments("--start-maximized");

        return new ChromeDriver(options);
    }
}





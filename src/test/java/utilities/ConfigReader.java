package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/config.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            System.out.println("Error loading config.properties: " + e.getMessage());
        }
    }

    public static String GetProperty(String key) {return properties.getProperty(key);}
    public String getFname() {return GetProperty("Fname");}
    public String getLname() {return GetProperty("Lname");}
    public String getEmail() {return GetProperty("Email");}
    public String getInvalidEmail() {return GetProperty("InvalidEmail");}
    public String getPass() {return GetProperty("Pass");}
    public String getPhoneNo() {return GetProperty("PhoneNo"); }// ونتأكد إن القيمة محفوظة كنص أصلاً}
    public String getAddress(){return GetProperty("Address") ;}
    public String getCity(){return GetProperty ("City");}
    public String getZip(){return GetProperty ("Zip");}
}

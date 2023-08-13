package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonActions {

    protected static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}

package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {

    public static WebDriver driver;

    public BasePage () {
        if (BasePage.driver == null) {
            BasePage.driver = new ChromeDriver();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void openUrl (String url) {
        driver.get(url);
    }

}

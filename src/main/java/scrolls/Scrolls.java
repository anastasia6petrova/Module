package scrolls;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

public class Scrolls {
    protected WebDriver driver = BasePage.getDriver();


    public void scrollToEnd() {
        driver = BasePage.getDriver();
        Actions scrollToEnd = new Actions(driver);
        scrollToEnd.sendKeys(Keys.END).build().perform();

    }
}

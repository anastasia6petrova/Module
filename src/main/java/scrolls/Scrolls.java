package scrolls;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolls {
    protected WebDriver driver;

    public Scrolls (WebDriver driver){
        this.driver = driver;
    }

    public void scrollToEnd() {
        Actions scrollToEnd = new Actions(driver);
        scrollToEnd.sendKeys(Keys.END).build().perform();

    }
}

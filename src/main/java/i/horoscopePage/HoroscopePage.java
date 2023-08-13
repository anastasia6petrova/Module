package i.horoscopePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class HoroscopePage extends BasePage {


    public HoroscopePage(WebDriver driver) {
        super(driver);
    }


    private By geminiMainTitle = By.xpath("//li[contains(@class, 'summary_item col-headline')]//span[text() = 'Близнюки']");
    private By geminiLink = By.xpath("//li[contains(@class, 'multicol_item')]//a[text() = 'Близнюки']");
    private By businessTab = By.xpath("//li[contains(@class, 'selector_item ')]//a[text() = 'Бізнес']");
    private By businessTabMarked = By.xpath("//li[contains(@class, 'selector_item -current')]//a[text() = 'Бізнес']");


    public WebElement getGeminiMainTitle() {
        return driver.findElement(geminiMainTitle);
    }

    public WebElement getGeminiLink() {
        return driver.findElement(geminiLink);
    }

    public WebElement getBusinessTab() {
        return driver.findElement(businessTab);
    }

    public WebElement getBusinessTabMarked() {
        return driver.findElement(businessTabMarked);
    }





}

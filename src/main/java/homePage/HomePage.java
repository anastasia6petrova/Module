package homePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BasePage;

public class HomePage extends BasePage {


    private By logo = By.xpath("//input[@value = 'Знайти']");
    private By contactInfo = By.cssSelector(".copyright.clear");
    private By findButton = By.xpath("//input[@value = 'Знайти']");
    private By searchInput = By.cssSelector("#searchQ");
    private By logInButton = By.xpath("//a[text() = \"Вхід\"]");

    public HomePage() {
        super();
    }


    public boolean isLogoDisplayed() {
        return  driver.findElement(logo).isDisplayed();
    }

    public boolean isContactInfoDisplayed() {
        return driver.findElement(contactInfo).isDisplayed();
    }

    public WebElement getContactInfo() {
        return driver.findElement(contactInfo);

    }

    public WebElement getSearchInput() {
        return driver.findElement(searchInput);

    }









    public HomePage clickLoginButton(){
        driver.findElement(logInButton).click();

        return this;
    }

    public HomePage clickFindButton(){
        driver.findElement(findButton).click();

        return this;
    }




}

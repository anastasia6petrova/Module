package i.home;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By usernameField = By.xpath("//*[@class = 'width_100' and @name = 'login']");
    private By passwordField = By.xpath("//*[@class = 'width_100' and @name = 'pass']");
    private By signInButton = By.xpath("//form[@name = 'lFloat']//input[@value = 'Увійти']");
    private By rememberMeCheckbox = By.xpath("//fieldset/label/input[@type = 'checkbox' and @name = 'auth_type']");
    private By twitterIcon = By.cssSelector(".twitter_20");
    private By facebookIcon = By.cssSelector(".facebook_20");
    private By googleInIcon = By.cssSelector(".googleplus_20");
    private By remindPassword = By.xpath("//a[text() = 'нагадати пароль']");
    private By toRegistrationForm = By.xpath("//a[text() = 'зареєструватись']");



    public void setUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public boolean isRememberUsernameChecked() {
        return driver.findElement(rememberMeCheckbox).isSelected();
    }

    public void setRememberUsername(boolean checkIt) {
        boolean alreadySelected = isRememberUsernameChecked();

        if( (checkIt && !alreadySelected) || (!checkIt && alreadySelected) ) {
            driver.findElement(rememberMeCheckbox).click();
        }
    }









}

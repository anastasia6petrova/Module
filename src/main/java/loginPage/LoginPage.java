package loginPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import base.BasePage;

import static constants.Constant.Credentials.PASSWORD;
import static constants.Constant.Credentials.USERNAME;

public class LoginPage extends BasePage {

    public LoginPage() {
        super();
    }

    private By loginPopUp = By.cssSelector(".popup.login");
    private By usernameField = By.xpath("//*[@class = 'width_100' and @name = 'login']");
    private By passwordField = By.xpath("//*[@class = 'width_100' and @name = 'pass']");
    private By signInButton = By.xpath("//form[@name = 'lFloat']//input[@value = 'Увійти']");
    private By rememberMeCheckbox = By.xpath("//fieldset/label/input[@type = 'checkbox' and @name = 'auth_type']");
    private By twitterIcon = By.cssSelector(".twitter_20");
    private By facebookIcon = By.cssSelector(".facebook_20");
    private By googleInIcon = By.cssSelector(".googleplus_20");
    private By remindPassword = By.xpath("//a[text() = 'нагадати пароль']");
    private By toRegistrationForm = By.xpath("//a[text() = 'зареєструватись']");
    private By closeLoginPopUpButton = By.xpath("//div[contains(@class, 'popup') and contains(@class, 'login')]//div[contains(@class, 'content') and contains(@class, 'clear')]//i[contains(@class, 'close_button')]");
    private By loginUser = By.xpath("//*[text()='Привіт,'] | //*[text()='Анастасія']");
    private By errorCredentialsMessage = By.xpath("//div[text() = 'Невірний логін або пароль']");


    public WebElement getLoginPopUp () {
        return driver.findElement(loginPopUp);
    }

    public WebElement getUsername () {
        return driver.findElement(usernameField);
    }

    public WebElement getPassword () {
        return driver.findElement(passwordField);
    }

    public void setUsername() {
        getUsername().sendKeys(USERNAME);
    }

    public void setPassword() {
        getPassword().sendKeys(PASSWORD);
    }

    public void clickSignInButton () {
        driver.findElement(signInButton).click();
    }

    public void clickTwitterIcon () {
        driver.findElement(twitterIcon).click();
    }

    public void clickFacebookIcon () {
        driver.findElement(facebookIcon).click();
    }

    public void clickGoogleInIcon() {
        driver.findElement(googleInIcon).click();
    }

    public void clickToRegistrationForm() {
        driver.findElement(toRegistrationForm).click();
    }

    public void clickToRemindPassword() {
        driver.findElement(remindPassword).click();
    }

    public void clickCloseLoginPopUpButton() {
        driver.findElement(closeLoginPopUpButton).click();
    }

    public WebElement getLoginUser () {
        return driver.findElement(loginUser);
    }

    public boolean isErrorMessageDisplayed() {
        return driver.findElement(errorCredentialsMessage).isDisplayed();
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

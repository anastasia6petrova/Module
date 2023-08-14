package test.loginPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import test.base.BaseTest;

import java.time.Duration;

import static constants.Constant.Credentials.INVALID_PASSWORD;
import static constants.Constant.Credentials.INVALID_USERNAME;
import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;
import static constants.Constant.Urls.*;
import static org.testng.Assert.*;

public class LoginPageTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        driver = BasePage.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT)).pageLoadTimeout(Duration.ofSeconds(IMPLICIT_WAIT));
        basePage.openUrl(IUA_HOME_PAGE);
        homePage.clickLoginButton();
        waiters.waitElementIsVisible(loginPage.getLoginPopUp());

    }

    @Test
    public void loginWithValidCredentials () {
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickSignInButton();

        assertTrue(loginPage.getLoginUser().isDisplayed(), "User is not logged in");
    }

    @Test
    public void loginWithEmptyUsernameField () {
        loginPage.setPassword();
        loginPage.clickSignInButton();

        assertTrue(loginPage.getLoginPopUp().isDisplayed(), "User has successfully logged in");
    }

    @Test
    public void loginWithEmptyPasswordField () {
        loginPage.setUsername();
        loginPage.clickSignInButton();

        assertTrue(loginPage.getLoginPopUp().isDisplayed(), "User has successfully logged in");
    }

    @Test
    public void loginWithInvalidUsernameValidPassword () {
        loginPage.getUsername().sendKeys(INVALID_USERNAME);
        loginPage.setPassword();
        loginPage.clickSignInButton();

        assertEquals(driver.getCurrentUrl(), IUA_LOGIN_PAGE, "User has successfully logged in");
        assertTrue(loginPage.isErrorMessageDisplayed(), "User has successfully logged in");
    }

    @Test
    public void loginWithValidUsernameInvalidPassword () {
        loginPage.setUsername();
        loginPage.getPassword().sendKeys(INVALID_PASSWORD);
        loginPage.clickSignInButton();

        assertEquals(driver.getCurrentUrl(), IUA_LOGIN_PAGE, "User has successfully logged in");
        assertTrue(loginPage.isErrorMessageDisplayed(), "User has successfully logged in");
    }

    @Test
    public void loginWithTwitter () {
        loginPage.clickTwitterIcon();

    }

    @Test
    public void loginWithFacebook () {
        loginPage.clickFacebookIcon();
    }

    @Test

    public void loginWithGoogle () {
        loginPage.clickGoogleInIcon();
    }


   @Test
   public void getToRegistrationForm () {
        loginPage.clickToRegistrationForm();
       assertEquals(driver.getCurrentUrl(), IUA_REGISTRATION_PAGE, "You were not redirected to the correct page");
   }

    @Test
    public void getToForgetPasswordPage () {
        loginPage.clickToRemindPassword();
        assertEquals(driver.getCurrentUrl(), IUA_FORGOT_PASSWORD_PAGE, "You were not redirected to the correct page");
    }


    @Test
    public void closeLoginForm () {
        loginPage.clickCloseLoginPopUpButton();
        assertFalse(loginPage.getLoginPopUp().isDisplayed(), "Window is not closed");

    }


}

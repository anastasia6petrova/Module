package test.homePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BasePage;
import test.base.BaseTest;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;
import static constants.Constant.Urls.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HomePageElementsTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        driver = BasePage.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT)).pageLoadTimeout(Duration.ofSeconds(IMPLICIT_WAIT));
        basePage.openUrl(IUA_HOME_PAGE);
    }

    @Test
    public void logoPresence() {
        assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed");
    }

    @Test
    public void contactIngoPresence() {
        scrolls.scrollToEnd();
        waiters.waitElementIsVisible(homePage.getContactInfo());
        assertTrue(homePage.isContactInfoDisplayed(), "Contact Info is not displayed");

    }

    @Test
    public void checkIsRedirectToJobPage() {

        homePageSidebar.clickJobButton();

        assertEquals(driver.getCurrentUrl(), IUA_JOB_PAGE, "You were not redirected to the correct page");
    }

    @Test
    public void checkIsRedirectToCatalogPage() {

        homePageSidebar.clickCatalogButton();

        assertEquals(driver.getCurrentUrl(), IUA_CATALOG_PAGE, "You were not redirected to the correct page");
    }

    @Test
    public void checkIsRedirectToHoroscopePage() {

        homePageSidebar.clickHoroscopeButton();

        assertEquals(driver.getCurrentUrl(), IUA_HOROSCOPE_PAGE, "You were not redirected to the correct page");
    }

}


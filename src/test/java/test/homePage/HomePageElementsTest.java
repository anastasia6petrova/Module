package test.followingLinks;

import common.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.base.BaseTest;

import java.time.Duration;

import static constants.Constant.Urls.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FollowingLinksFromHomPageTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        driver = CommonActions.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)).pageLoadTimeout(Duration.ofSeconds(10));
        basePage.openUrl(IUA_HOME_PAGE);
    }

    @Test
    public void logoPresence () {
        assertTrue(homePage.isLogoDisplayed(), "Logo is not displayed");
    }

    @Test
    public void contactIngoPresence () {
        scrolls.scrollToEnd();
        waiters.waitElementIsVisible(homePage.getContactInfo());
        assertTrue(homePage.isContactInfoDisplayed(), "Contact Info is not displayed");

    }


    @Test
    public void checkIsRedirectToJobPage (){

        homePage.clickJobButton();

        assertEquals(driver.getCurrentUrl(), IUA_JOB_PAGE, "You were not redirected to the correct site");
    }

    @Test
    public void checkIsRedirectToCatalogPage (){

        homePage.clickCatalogButton();

        assertEquals(driver.getCurrentUrl(), IUA_CATALOG_PAGE, "You were not redirected to the correct site");
    }
    @Test
    public void checkIsRedirectToHoroscopePage (){

        homePage.clickHoroscopeButton();

        assertEquals(driver.getCurrentUrl(), IUA_HOROSCOPE_PAGE, "You were not redirected to the correct site");
    }



    }



package test.homePage;

import common.CommonActions;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.base.BaseTest;

import java.time.Duration;


import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;
import static constants.Constant.Urls.*;
import static constants.Constant.WordsForSearch.*;
import static org.testng.Assert.*;

public class SearchInputTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        driver = CommonActions.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT)).pageLoadTimeout(Duration.ofSeconds(IMPLICIT_WAIT));
        basePage.openUrl(IUA_HOME_PAGE);
    }

    @Test
    public void inputSearchAvailability() {
        assertTrue(homePage.getSearchInput().isEnabled(), "Search Input is not available");
    }


    @Test
    public void searchResultsAvailability (){
        homePage.getSearchInput().sendKeys(VALID_KEYWORD_1);
        homePage.clickFindButton();
        waiters.waitElementIsVisible(searchPage.getSearchResults());
        assertTrue(searchPage.getSearchResults().isDisplayed(), "Search Results is not displayed");

    }

    @Test
    public  void searchWithEmptyInput () {
        homePage.getSearchInput().sendKeys(Keys.ENTER);
        assertEquals(driver.getCurrentUrl(), IUA_EMPTY_SEARCH_PAGE, "Search Results is not empty");
    }

    @Test
    public  void searchWithInvalidKeyword () {
        homePage.getSearchInput().sendKeys(INVALID_KEYWORD);
        waiters.waitElementIsVisible(searchPage.getNoResultsMessage());
        assertTrue(searchPage.getNoResultsMessage().isDisplayed(), "No Search Results Message is not displayed");

    }

    @Test
    public  void searchWithValidKeyword () {
        homePage.getSearchInput().sendKeys(VALID_KEYWORD_1, Keys.ENTER);
        waiters.waitElementIsVisible(searchPage.getSearchResults());
        assertTrue(searchPage.getSearchQueryResult().getText().toUpperCase().contains(VALID_KEYWORD_1.toUpperCase()), "Search result is not relevant.");

    }


    @AfterMethod
    public void driverQuit() {
        driver.quit();

    }








}



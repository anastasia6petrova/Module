package test.base;

import common.CommonActions;
import i.home.HomePage;
import i.home.HomePageSidebar;
import i.horoscopePage.HoroscopePage;
import i.login.LoginPage;
import i.searchPage.SearchPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import pages.BasePage;
import scrolls.Scrolls;
import waiters.Waiters;


public class BaseTest {

    protected WebDriver driver = CommonActions.getDriver();
    protected BasePage basePage = new BasePage(driver);
    protected HomePage homePage = new HomePage(driver);
    protected HomePageSidebar homePageSidebar = new HomePageSidebar(driver);
    protected LoginPage loginPage = new LoginPage(driver);
    protected SearchPage searchPage = new SearchPage(driver);
    protected HoroscopePage horoscopePage = new HoroscopePage(driver);
    protected Waiters waiters = new Waiters(driver);
    protected Scrolls scrolls = new Scrolls(driver);



}
package test.base;

import homePage.HomePage;
import homePage.HomePageSidebar;
import horoscopePage.HoroscopePage;
import loginPage.LoginPage;
import searchPage.SearchPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import base.BasePage;
import scrolls.Scrolls;
import waiters.Waiters;


public class BaseTest {

    protected WebDriver driver = BasePage.getDriver();
    protected BasePage basePage = new BasePage();
    protected HomePage homePage = new HomePage();
    protected HomePageSidebar homePageSidebar = new HomePageSidebar();
    protected LoginPage loginPage = new LoginPage();
    protected SearchPage searchPage = new SearchPage();
    protected HoroscopePage horoscopePage = new HoroscopePage();
    protected Waiters waiters = new Waiters();
    protected Scrolls scrolls = new Scrolls();


    @AfterSuite (alwaysRun = true)

    public void driverQuit() {
            driver.quit();

    }

}
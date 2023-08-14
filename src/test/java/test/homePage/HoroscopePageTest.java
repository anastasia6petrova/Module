package test.homePage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.BasePage;
import test.base.BaseTest;

import java.time.Duration;

import static constants.Constant.TimeoutVariable.IMPLICIT_WAIT;
import static constants.Constant.Urls.IUA_HOROSCOPE_PAGE;
import static org.testng.Assert.assertTrue;

public class HoroscopePageTest extends BaseTest {

    @BeforeMethod
    public void setUp() {
        driver = BasePage.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT)).pageLoadTimeout(Duration.ofSeconds(IMPLICIT_WAIT));
        basePage.openUrl(IUA_HOROSCOPE_PAGE);

    }
    @Test

    public void chooseGeminiTitleZodiac (){
        horoscopePage.getGeminiLink().click();
        waiters.waitElementIsVisible(horoscopePage.getGeminiMainTitle());

        assertTrue(horoscopePage.getGeminiMainTitle().isDisplayed(), "Title Zodiac not changed");

    }

    @Test
    public void chooseBusinessHoroscope (){
        horoscopePage.getBusinessTab().click();
        waiters.waitElementIsVisible(horoscopePage.getBusinessTabMarked());

        assertTrue(horoscopePage.getBusinessTabMarked().isDisplayed(), "Switch to tab Business has not been made");

    }


}

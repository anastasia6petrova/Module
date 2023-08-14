package homePage;

import org.openqa.selenium.By;
import base.BasePage;

public class HomePageSidebar extends BasePage {

    public HomePageSidebar () {
            super();
        }


        private By jobButton = By.xpath("//a[@title = 'Робота']");
        private By catalogButton = By.xpath("//a[@title = 'Каталог']");
        private By horoscopeButton = By.xpath("//a[@title = 'Гороскоп']");




        public HomePageSidebar clickJobButton(){
            driver.findElement(jobButton).click();

            return this;
        }

        public HomePageSidebar clickCatalogButton(){
            driver.findElement(catalogButton).click();

            return this;
        }
        public HomePageSidebar clickHoroscopeButton(){
            driver.findElement(horoscopeButton).click();

            return this;
        }




    }


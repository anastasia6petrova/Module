package i.searchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class SearchPage extends BasePage {

    public SearchPage (WebDriver driver) {
            super(driver);
        }

    private By searchBox = By.cssSelector(".gsc-resultsbox-visible");
    private By searchBoxInvisible = By.cssSelector(".gsc-resultsbox-invisible");
    private By noResultsMessage = By.xpath("//div[text() = 'Результатів немає']");
    private By searchQueryResult = By.xpath("//b[text() = 'EPAM']");

    public WebElement getSearchResults() {
        return driver.findElement(searchBox);
    }

    public WebElement getSearchResultsEmpty() {
        return driver.findElement(searchBoxInvisible);
    }

    public WebElement getNoResultsMessage() {
        return driver.findElement(noResultsMessage);
    }

    public WebElement getSearchQueryResult (){
        return driver.findElement(searchQueryResult);
    }




}

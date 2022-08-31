package tasks;

import initalizers.InitializeDriver;
import org.openqa.selenium.WebDriver;
import pageobjects.SearchProfilePage;
import utilities.WebUtilities;

public class SearchAndSelect {
    private WebDriver webDriver = InitializeDriver.getWebDriver();
    public void aProfile(String profile){
        WebUtilities.enterTextInTextBox(webDriver, SearchProfilePage.SEARCH_INPUT_LOCATOR, profile);
        WebUtilities.clickButton(webDriver, SearchProfilePage.profileLocator(profile));
    }
}

package tasks;

import initalizers.InitializeDriver;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import pageobjects.PhotoPage;
import utilities.WebUtilities;

public class Add {
    private WebDriver webDriver = InitializeDriver.getWebDriver();

    public void comment(String comment){
        try {
            WebUtilities.enterTextInTextBox(webDriver, PhotoPage.COMMENT_INPUT_LOCATOR, comment);
        }catch (StaleElementReferenceException staleElementReferenceException){
            WebUtilities.enterTextInTextBox(webDriver, PhotoPage.COMMENT_INPUT_LOCATOR, comment);
            WebUtilities.clickButton(webDriver, PhotoPage.POST_BUTTON_LOCATOR);
            webDriver.navigate().refresh();
        }
    }
}

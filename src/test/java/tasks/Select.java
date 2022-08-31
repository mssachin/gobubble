package tasks;

import initalizers.InitializeDriver;
import org.openqa.selenium.WebDriver;
import pageobjects.PhotoPage;
import utilities.WebUtilities;

public class Select {
    private WebDriver webDriver = InitializeDriver.getWebDriver();

    public void aPhoto(String photoName){
        WebUtilities.clickButton(webDriver, PhotoPage.photoLocator(photoName));
    }

}

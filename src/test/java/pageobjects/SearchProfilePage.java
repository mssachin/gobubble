package pageobjects;

import org.openqa.selenium.By;

public class SearchProfilePage {
    public static final By SEARCH_INPUT_LOCATOR = By.xpath("//input[@aria-label='Search Input']");

    public static By profileLocator(String profile) {
        return By.xpath("//div[text()='" + profile + "']");
    }

}



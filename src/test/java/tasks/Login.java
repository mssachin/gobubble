package tasks;

import initalizers.InitializeDriver;
import org.openqa.selenium.WebDriver;
import pageobjects.LoginPage;
import utilities.WebUtilities;

public class Login {
    private WebDriver webDriver = InitializeDriver.getWebDriver();

    public void toInstagram(String username, String password) {
        WebUtilities.enterTextInTextBox(webDriver, LoginPage.USERNAME_INPUT_LOCATOR, username);
        WebUtilities.enterTextInTextBox(webDriver, LoginPage.PASSWORD_INPUT_LOCATOR, password);
        WebUtilities.clickButton(webDriver, LoginPage.LOGIN_BUTTON_LOCATOR);
    }
}

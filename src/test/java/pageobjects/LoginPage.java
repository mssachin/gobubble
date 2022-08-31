package pageobjects;

import org.openqa.selenium.By;

public class LoginPage {

    public static final By USERNAME_INPUT_LOCATOR = By.name("username");
    public static final By PASSWORD_INPUT_LOCATOR = By.name("password");
    public static final By LOGIN_BUTTON_LOCATOR = By.xpath("//div[text()='Log In']");
}

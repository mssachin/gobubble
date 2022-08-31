package pageobjects;

import org.openqa.selenium.By;

public class PhotoPage {

    public static By photoLocator(String photoName) {
        if (photoName.equalsIgnoreCase("vikings")) {
            return By.xpath("//a[@href='/p/Cht3cpaossa/']");
        } else if (photoName.equalsIgnoreCase("cats")) {
            return By.xpath("//a[@href='/p/CgPOqH6IcUg/']");
        } else {
            throw new IllegalArgumentException("Invalid Photo Name Does not Exist");
        }
    }

    public static final By COMMENT_INPUT_LOCATOR = By.xpath("//textarea[@placeholder='Add a comment…']");
    public static final By POST_BUTTON_LOCATOR = By.xpath("//div[text()='Post']");
    public static final By ALL_COMMENTS_LOCATOR = By.xpath("//ul//div[@class='_a9zs']/span");
}

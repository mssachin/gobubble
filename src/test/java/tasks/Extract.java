package tasks;

import initalizers.InitializeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pageobjects.PhotoPage;
import utilities.WebUtilities;

import java.util.ArrayList;
import java.util.List;

public class Extract {
    private WebDriver webDriver = InitializeDriver.getWebDriver();

    public List<String> allComments(){
        List<WebElement> commentsAsElements = WebUtilities.findAllElements(webDriver, PhotoPage.ALL_COMMENTS_LOCATOR);
        List<String> allCommentsAsString = new ArrayList<>();
        for(WebElement webElement: commentsAsElements){
            String commentAsString = webElement.getText();
            allCommentsAsString.add(commentAsString);
        }
        return allCommentsAsString;
    }
}

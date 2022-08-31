package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class WebUtilities {

    public static void enterTextInTextBox(WebDriver driver, By locator, String textToEnter){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(textToEnter);
    }

    public static void clickButton(WebDriver driver, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public static List<WebElement> findAllElements(WebDriver driver, By locator){
        WebDriverWait webDriverWait = new WebDriverWait(driver, 60);
        return webDriverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
}

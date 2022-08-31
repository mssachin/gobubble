package runners;


import initalizers.InitializeDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features = {"src/test/resources/features/"},
        glue = {""}
)
public class CucumberRunner {

    @BeforeClass
    public static void setup(){
        InitializeDriver.getWebDriver().get("https://www.instagram.com");
    }

    @AfterClass
    public static void tearDown(){
        InitializeDriver.getWebDriver().quit();
    }
}

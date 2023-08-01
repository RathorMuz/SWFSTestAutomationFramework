package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.Allure;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import static base.setup.driver;
import static base.setup.initiateBrowser;


@CucumberOptions(
        features = {"src/test/features/Case1_login.feature","src/test/features/Case2_addtocart.feature","src/test/features/Case3_logout.feature"},
        glue = {"stepdefinition"}
)
public class runner extends AbstractTestNGCucumberTests {
    @BeforeSuite
    public void broswerOpening() throws IOException
    {
        initiateBrowser();
        Allure.step("Initiate the browser");
    }

    @AfterSuite
    public void teardown()
    {
        driver.quit();
        Allure.step("Close the browser");
    }
}
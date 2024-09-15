package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.MainDriver;

import java.io.IOException;

public class hooks {
    public WebDriver driver;
    @Before
    public void setUp() throws IOException {
        MainDriver.getInstance();
        MainDriver.openWebpage(MainDriver.config.getProperty("testsiteUrl"));
    }

    @After
    public void afterScenario(){
        MainDriver.tearDown();
    }
}

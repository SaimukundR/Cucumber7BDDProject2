package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features="src/test/resources/features",glue={"stepDefinitions"},tags="@SuccessfulLogin", plugin = {"pretty","html:target/cucumber-reports/cucumber-html-report.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = true,
publish = true)
public class Runner1 extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel=true)
    public Object[][] scenarios(){
        return super.scenarios();
    }

}

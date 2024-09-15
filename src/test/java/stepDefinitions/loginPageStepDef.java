package stepDefinitions;

import PageObjects.basePage;
import PageObjects.homePage;
import PageObjects.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.MainDriver;

public class loginPageStepDef {

    @Given("user is on login page")
    public void user_is_on_login_page() {
        basePage.userNavigatesToLoginPage();
    }
    @Given("user has entered valid username and password")
    public void user_has_entered_valid_username_and_password() {
        loginPage.userEntersCredentils();

    }
    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.userClicksOnLogin();

    }
    @Then("user logs in successfully")
    public void user_logs_in_successfully() {
        // Write code here that turns the phrase above into concrete actions

    }
}

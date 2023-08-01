package stepdefinition;

import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.logout;

public class logoutsteps extends setup {
    @Given("User is logged in")
    public void user_is_logged_in()
    {
        new logout(driver).checkUserIsOnCart();
    }
    @When("user click on the menu icon")
    public void user_click_on_menu_icon()
    {
        new logout(driver).clickMenuIcon();
    }
    @And("click on Logout")
    public void click_on_Logout()
    {
        new logout(driver).clickLogoutButton();
    }
    @Then("user should be logged out from application")
    public void user_should_be_logged_out_from_application()
    {
        new logout(driver).checkUserIsLoggedOut();
    }
}
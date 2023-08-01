package stepdefinition;

import Pages.loginpage;
import base.setup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps extends setup {
    @Given("User is on the login page")
    public void OpenURL()
    {
        new loginpage(driver).checkUserOnLoginPage();
    }

    //Valid credentials scenario
    @When("user enter the username")
    public void Enter_Username()
    {
        new loginpage(driver).enter_User_Name();
    }
    @And("user enter the password")
    public void Enter_Password()
    {
        new loginpage(driver).enter_Password();
    }
    @And("user click on the login button")
    public void Enter_LoginButton()
    {
        new loginpage(driver).click_Login_Button();
    }
    @Then("user should be logged in successfully")
    public void Logged_In()
    {
        new loginpage(driver).checkUserLoggedIn();
    }

    //Invalid credentials scenario
    @When("user enter the incorrect username")
    public void Enter_Incorrect_Username()
    {
        new loginpage(driver).enterIncorrectUsername();
    }
    @And("user enter the incorrect password")
    public void Enter_Incorrect_Password()
    {
        new loginpage(driver).enterIncorrectPassword();
    }
    @Then("user should not be logged in successfully")
    public void User_Not_Logged_In()
    {
        new loginpage(driver).checkUserOnLoginPage();
    }

}

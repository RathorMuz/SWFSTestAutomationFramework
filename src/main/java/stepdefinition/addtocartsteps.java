package stepdefinition;

import Pages.addtocart;
import base.setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addtocartsteps extends setup {
    @Given("User is on the main page")
    public void user_is_on_main_page() {
        new addtocart(driver).checkUserIsOnMainPage();
    }
    @When("user click on Add to cart button")
    public void user_click_on_add_to_cart_button()
    {
        new addtocart(driver).addtoCart();
    }
    @When("click on cart icon")
    public void click_on_cart_icon()
    {
        new addtocart(driver).clickCartIcon();
    }
    @Then("product should be added to cart successfully")
    public void product_should_be_added_to_cart_successfully()
    {
        new addtocart(driver).checkCartBadgeQuantity();
    }
    @Then("item should show in cart")
    public void item_should_show_in_cart()
    {
        new addtocart(driver).checkIfCartItemAdded();
    }

}
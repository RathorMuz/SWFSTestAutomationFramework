package Pages;

import base.setup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import io.qameta.allure.Allure;

public class addtocart extends setup {
    public addtocart(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //Web Elements for Add to Cart button, Cart icon, Cart badge
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    public WebElement addToCartbtn;
    @FindBy(css = "span.shopping_cart_badge")
    public WebElement cartBadge;
    @FindBy(css = "a.shopping_cart_link")
    public WebElement cartIcon;
    @FindBy(css = "div.cart_item")
    public WebElement itemAddedInCart;

    public void checkUserIsOnMainPage()
    {
        String loggedInURL = driver.getCurrentUrl();
        Assert.assertEquals(loggedInURL, "https://www.saucedemo.com/inventory.html");
        Allure.step("Verify if user is on saucedemo main page");
    }
    public void addtoCart()
    {
        addToCartbtn.click();
        Allure.step("Click on add to cart button to add a product to cart");
    }
    public void checkCartBadgeQuantity()
    {
        String cartBadgeNumOfItems = cartBadge.getText();
        Assert.assertEquals(cartBadgeNumOfItems,"1");
        Allure.step("Verify the quantity of cart badge after adding one product to cart");
    }
    public void clickCartIcon()
    {
        cartIcon.click();
        Allure.step("Click on cart icon");
    }
    public void checkIfCartItemAdded()
    {
        itemAddedInCart.isDisplayed();
        Allure.step("Verify if the added item is showing in cart");
    }

}
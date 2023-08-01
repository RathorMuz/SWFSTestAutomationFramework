package Pages;

import base.setup;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class logout extends setup {
    public logout(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    //Web Elements for Menu icon and Logout button
    @FindBy(id = "react-burger-menu-btn")
    public WebElement menuIcon;
    @FindBy(id = "logout_sidebar_link")
    public WebElement logoutbtn;
    public void checkUserIsOnCart()
    {
        String loggedInURL = driver.getCurrentUrl();
        Assert.assertEquals(loggedInURL, "https://www.saucedemo.com/cart.html");
        Allure.step("Verify if user is on cart page");
    }
    public void clickMenuIcon() {
        menuIcon.click();
        Allure.step("Click on menu icon");
    }
    public void clickLogoutButton()
    {
        logoutbtn.click();
        Allure.step("Click on logout button");
    }
    public void checkUserIsLoggedOut()
    {
        String loggedOutURL = driver.getCurrentUrl();
        Assert.assertEquals(loggedOutURL,"https://www.saucedemo.com/");
        Allure.step("Check if user is logged out after logout action is performed");
    }
}
package Pages;

import base.setup;
import io.qameta.allure.Allure;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class loginpage extends setup {

    public loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "user-name")
    public WebElement user_name;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "login-button")
    public WebElement login_button;
    @FindBy(css = "div.error-message-container h3")
    public WebElement error_message;

    public void checkUserOnLoginPage()
    {
        driver.get("https://www.saucedemo.com/");
        Allure.step("Go to saucedemo login page");
    }

    //ValidLogin Scenario
    public void enter_User_Name()
    {
        user_name.sendKeys("standard_user");
        Allure.step("Enter user name");
    }
    public void enter_Password()
    {
        password.sendKeys("secret_sauce");
        Allure.step("Enter password");
    }
    public void click_Login_Button()
    {
        login_button.click();
        Allure.step("Click on login button");
    }
    public void checkUserLoggedIn ()
    {
        String mainPage = driver.getCurrentUrl();
        Assert.assertEquals(mainPage,"https://www.saucedemo.com/inventory.html");
        Allure.step("Check if user is on logged in or not");
    }

    //InvalidLogin Scenario
    public void enterIncorrectUsername()
    {
        user_name.sendKeys("wrong_user");
        Allure.step("Enter incorrect username");
    }
    public void enterIncorrectPassword()
    {
        password.sendKeys("secret_spice");
        Allure.step("Enter incorrect password");
    }
    public void displayErrorMessage()
    {
        String error = error_message.getText();
        System.out.println(error);
        Assert.assertEquals(error,"Epic sadface: Username and password do not match any user in this service");
        Allure.step("Check if error message is appearing after invalid credentials are provided");
    }
}

package page;
/*
   Napraviti testove za sledece stranice:
  1. Login na stranicu (username: standard_user, password: secret_sauce)
     https://www.saucedemo.com
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    private WebElement loginForm = getDriver().findElement(By.xpath("//*[@id='root']/div/div[2]/div[1]"));
    private WebElement usernameField = getDriver().findElement(By.id("user-name"));
    private WebElement passwordField = getDriver().findElement(By.id("password"));
    private WebElement loginButton = getDriver().findElement(By.id("login-button"));

    public LoginPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
    public boolean isLoginButtonPresented(){
        return getLoginButton().isDisplayed();
    }

    public WebElement getLoginForm() {
        return loginForm;
    }
    public boolean isLoginFormPresented(){
        return getLoginForm().isDisplayed();
    }

    public void login (String username, String password){
        usernameField.clear();
        passwordField.clear();
        usernameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();


    }
}
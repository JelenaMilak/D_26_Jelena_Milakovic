package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourCart extends BasePage {
    public By cartItem = By.xpath("//*[@id='cart_contents_container']/div/div[1]/div[3]/div[2]");
    public By removeButton = By.id("remove-sauce-labs-backpack");
    public By continueShoppingBtn = By.id("continue-shopping");
    public By checkoutBtn = By.id("checkout");

    public YourCart(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public WebElement getCartItem() {
        return getDriver().findElement(cartItem);
    }

    public WebElement getContinueShoppingBtn() {
        return getDriver().findElement(continueShoppingBtn);
    }

    public WebElement getRemoveButton() {
        return getDriver().findElement(removeButton);
    }

    public WebElement getCheckoutBtn() {
        return getDriver().findElement(checkoutBtn);
    }

    public boolean isGetCartItemPresented() {
        return getCartItem().isDisplayed();
    }

    public boolean isRemoveButtonPresented() {
        return getRemoveButton().isDisplayed();
    }

    public boolean isContinueShoppingBtnPresented() {
        return getContinueShoppingBtn().isDisplayed();
    }

    public boolean isCheckoutBtnPresented(){
        return getCheckoutBtn().isDisplayed();
    }

    public void checkout() {
        getCheckoutBtn().click();
    }
}



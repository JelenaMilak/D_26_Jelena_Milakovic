package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends BasePage {
    private By form = By.xpath("//*[@id='checkout_info_container']/div/form");
    private By firstname = By.id("first-name");
    private By lastname = By.id("last-name");
    private By zipCode = By.id("postal-code");
    private By cancelBtn = By.id("cancel");
    private By continueBtn = By.id("continue");

    public CheckOutPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);

    }

    public WebElement getForm() {
        return getDriver().findElement(form);
    }

    public WebElement getFirstname() {
        return getDriver().findElement(firstname);
    }

    public WebElement getLastname() {
        return getDriver().findElement(lastname);
    }

    public WebElement getZipCode() {
        return getDriver().findElement(zipCode);
    }

    public WebElement getCancelBtn() {
        return getDriver().findElement(cancelBtn);
    }

    public WebElement getContinueBtn() {
        return getDriver().findElement(continueBtn);
    }

    public boolean isCancelBtnPresented() {
        return getCancelBtn().isDisplayed();
    }

    public boolean isContinueBtnPresented() {
        return getContinueBtn().isDisplayed();
    }


    public void formCheckout(String firstname, String lastname, String zipCode) {
        getFirstname().sendKeys(firstname);
        getLastname().sendKeys(lastname);
        getZipCode().sendKeys(zipCode);
        getContinueBtn().click();
    }

    public boolean isFormPresented() {
        return getForm().isDisplayed();
    }
}
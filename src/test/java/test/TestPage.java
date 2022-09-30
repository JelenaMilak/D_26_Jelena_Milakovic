package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.CheckOutPage;
import page.LoginPage;
import page.YourCart;


import java.time.Duration;

public class TestPage {
    private LoginPage loginPage;
    private WebDriver driver;
    private WebDriverWait wait;
    private ProductPage productPage;
    private YourCart yourCart;
    private CheckOutPage checkOutPage;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "../chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginPage = new LoginPage(driver, wait);
        productPage = new ProductPage(driver, wait);

    }

    @AfterClass
    public void afterClass() {

    }


    @Test(priority = 1)
    public void testLogin() {
        loginPage.login("standar_user", "secret_sauce");
        String expectedResult = "Swag Labs";
        String actualResult = loginPage.getDriver().getTitle();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @Test(priority = 2)
    public void testAddProduct() {

        Assert.assertTrue(productPage.isAddToCartBtnPresented());
        productPage.addProductToCart();

        Assert.assertTrue(productPage.isRemoveBtnPresented());
        Assert.assertTrue(productPage.isCartWithProductPresented());
        productPage.goToCart();
    }

    @Test(priority = 3)
    public void checkoutProductTest() {
        Assert.assertTrue(yourCart.isGetCartItemPresented());
        Assert.assertTrue(yourCart.isRemoveButtonPresented());
        Assert.assertTrue(yourCart.isContinueShoppingBtnPresented());
        Assert.assertTrue(yourCart.isCheckoutBtnPresented());
        yourCart.checkout();

        Assert.assertTrue(checkOutPage.isFormPresented());

    }

}







        







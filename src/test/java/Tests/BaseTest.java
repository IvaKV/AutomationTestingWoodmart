package Tests;

import helpers.SeleniumHelpers;
import org.testng.annotations.*;
import pages.*;

import java.awt.dnd.DragGestureEvent;
import java.time.Duration;

public class BaseTest {

    HomePage homepage;
    ProductDetailsPage productDetailsPage;
    ShoppingCartPage shoppingCartPage;
    CheckoutPage checkoutPage;
    OrderDetailsPage orderDetailsPage;

    MyAccountPage myAccountPage;
    SignInPage signInPage;
    AccountDetailsPage accountDetailsPage;
    ContactUsPage contactUsPage;



    @BeforeClass
    public void setUp() {

        SeleniumHelpers.initializeWebDriver();
        SeleniumHelpers.getDriver().manage().window().maximize();
        SeleniumHelpers.getDriver().get("https://woodmart.xtemos.com/home/");
        SeleniumHelpers.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    @BeforeTest
    public void initializePages() {
        homepage = new HomePage();
        productDetailsPage = new ProductDetailsPage();
        shoppingCartPage = new ShoppingCartPage();
        checkoutPage = new CheckoutPage();
        orderDetailsPage = new OrderDetailsPage();
        myAccountPage = new MyAccountPage();
        signInPage = new SignInPage();
        accountDetailsPage = new AccountDetailsPage();
        contactUsPage = new ContactUsPage();
    }

//    @AfterClass
//    public void tearDown () {
//        SeleniumHelpers.getDriver().quit();
//    }
}

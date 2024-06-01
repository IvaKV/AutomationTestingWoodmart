package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;

public class VerifyCheckoutTest extends BaseTest{


    @Test
    public void verifyCheckout() {

        homepage.searchProduct("Stacking chair");
        productDetailsPage.clickOnAddToCart();

        shoppingCartPage.clickOnCheckoutBtn();

        checkoutPage.addBillingDetals("first name", "last name", "Slovakia", "adress", "12345", "city", "123456", "test@test.co");
        checkoutPage.selectTermsCheckbox();
        checkoutPage.clickOnPlaceOrderBtn();

        String expectedResult = "Thank you. Your order has been received.";
        String actualResult = orderDetailsPage.getConfirmationMsg();
        Assert.assertEquals(actualResult, expectedResult);

    }

    @Test
    public void verifyCheckout2 () {
        homepage.searchProduct("Slat bench");
        productDetailsPage.clickOnAddToCart();

        shoppingCartPage.clickOnCheckoutBtn();

        checkoutPage.addBillingDetals(" name", "last name", "Slovakia", "adress", "12345", "city", "123456", "test1@test.co");
        checkoutPage.selectTermsCheckbox();
        checkoutPage.clickOnPlaceOrderBtn();

        String expectedResult = "Thank you. Your order has been received.";
        String actualResult = orderDetailsPage.getConfirmationMsg();
        Assert.assertEquals(actualResult, expectedResult);
    }
}

package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class ShoppingCartPage {
    private final By checkoutBtn = By.xpath("//a[@class='button checkout wc-forward']");

    public void clickOnCheckoutBtn () {
        SeleniumHelpers.waitAndFindElement(checkoutBtn).click();
    }
}

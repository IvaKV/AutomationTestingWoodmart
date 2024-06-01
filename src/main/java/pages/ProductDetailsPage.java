package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class ProductDetailsPage {

    private final By addToCartBtn = By.name("add-to-cart");

    public void clickOnAddToCart () {
        SeleniumHelpers.waitAndFindElement(addToCartBtn).click();
    }


}

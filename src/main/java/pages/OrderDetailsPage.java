package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class OrderDetailsPage {
    private final By confirmationMsg = By.xpath("//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']");

    public String getConfirmationMsg () {
        return SeleniumHelpers.findElement(confirmationMsg).getText();
    }
}

package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class HomePage {
    private By searchField = By.name("s");
    private final By registerLink = By.xpath("//a[@title='My account']");
    private final By contactUsLink = By.id("menu-item-2193");

    public void searchProduct (String product) {
        SeleniumHelpers.findElement(searchField).sendKeys(product);
    }

    public void clickOnRegister () {
        SeleniumHelpers.findElement(registerLink).click();
    }

    public void clickOnContactUs () {
        SeleniumHelpers.findElement(contactUsLink).click();
    }
}

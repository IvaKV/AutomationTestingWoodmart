package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class AccountDetailsPage {
    private final By accountDetailsLink = By.linkText("Account details");
    private final By accountEmailField = By.id("account_email");
    public void clickOnAccountDetailsLink () {
        SeleniumHelpers.findElement(accountDetailsLink).click();
    }


    public String getAccountEmail () {
        return SeleniumHelpers.waitAndFindElement(accountEmailField).getAttribute("value");
    }


}

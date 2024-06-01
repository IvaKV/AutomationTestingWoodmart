package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class SignInPage {
    private final By createAccountBtn = By.cssSelector("a.create-account-button");

    public void clickOnCreateAccountBtn () {
        SeleniumHelpers.waitAndFindElement(createAccountBtn).click();
    }


}

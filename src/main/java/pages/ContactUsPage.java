package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

public class ContactUsPage {

    private final By yourNameField = By.name("your-name");
    private final By yourEmailField = By.name("your-email");
    private final By yourMessageField = By.name("your-message");
    private final By askQuestionBtn = By.xpath("//input[@value='ASK A QUESTION']");
    private final By errorMsg = By.className("wpcf7-response-output");

    public void fillQuestionForm(String name, String email, String message) {
        SeleniumHelpers.findElement(yourNameField).sendKeys(name);
        SeleniumHelpers.findElement(yourEmailField).sendKeys(email);
        SeleniumHelpers.findElement(yourMessageField).sendKeys(message);
    }

    public void clickAskQuestionBtn () {
        SeleniumHelpers.findElement(askQuestionBtn).click();
    }

    public String getErrorMsg () {
        return SeleniumHelpers.waitAndFindElement(errorMsg).getText();
    }
}

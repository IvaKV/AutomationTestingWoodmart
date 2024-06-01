package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;

import java.util.Scanner;

public class MyAccountPage {

    private final By usernameField = By.id("reg_username");
    private final By emailField = By.id("reg_email");
    private final By passwordField = By.id("reg_password");
    private final By registerBtn = By.name("register");

    public void fillRegistrationForm (String username, String email, String password) {
        SeleniumHelpers.findElement(usernameField).sendKeys(username);
        SeleniumHelpers.findElement(emailField).sendKeys(email);
        SeleniumHelpers.findElement(passwordField).sendKeys(password);
        SeleniumHelpers.findElement(registerBtn).click();
    }

}

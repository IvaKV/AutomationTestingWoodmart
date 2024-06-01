package pages;

import helpers.SeleniumHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
    private final By firstNameField = By.id("billing_first_name");
    private final By lastNameField = By.id("billing_last_name");
    private final  By countryField = By.id("billing_country");
    private final By billingAddressField = By.id("billing_address_1");
    private final By billingPostCodeField = By.id("billing_postcode");
    private final By billingCityField = By.id("billing_city");
    private final By billingPhoneField = By.id("billing_phone");
    private final By billingEmailField = By.id("billing_email");

    private final By termsCheckBox = By.id("terms");

    private final By placeOrderBtn = By.id("place_order");

    public void addBillingDetals (String firstName,String lastName, String country,String address, String postalCode, String city, String phone, String email) {
        SeleniumHelpers.findElement(firstNameField).sendKeys(firstName);
        SeleniumHelpers.findElement(lastNameField).sendKeys(lastName);

        WebElement countryDropDown = SeleniumHelpers.findElement(countryField);
        Select countryList = new Select(countryDropDown);
        countryList.selectByVisibleText(country);

        SeleniumHelpers.findElement(billingAddressField).sendKeys(address);
        SeleniumHelpers.findElement(billingPostCodeField).sendKeys(postalCode);
        SeleniumHelpers.findElement(billingCityField).sendKeys(city);
        SeleniumHelpers.findElement(billingPhoneField).sendKeys(phone);
        SeleniumHelpers.findElement(billingEmailField).sendKeys(email);
    }

    public void selectTermsCheckbox () {
        SeleniumHelpers.waitAndFindElement(termsCheckBox).click();
    }

    public void clickOnPlaceOrderBtn () {
        SeleniumHelpers.waitAndFindElement(placeOrderBtn).click();
    }





}

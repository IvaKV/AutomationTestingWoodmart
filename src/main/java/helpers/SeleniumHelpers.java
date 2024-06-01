package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumHelpers {

    //Prvo scenario
    //    Navigate to https://woodmart.xtemos.com/home/
//    Search product
//    Add to cart the search product
//    Go to Checkout
//    Fill the billing form
//    Select terms and condition
//    Place the order
//    Verify the order has been received. (By verifying the success message:‘Thank you. Your order has been received.’)

    //Vtoro scenario
    /*- Open https://woodmart.xtemos.com/home/
- Navigate to Login/Register
- Create an account by filling all the fields
- Go to account details and assert the email address*/


    private static WebDriver driver;

    private static WebDriverWait wait;

    public static void initializeWebDriver () {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static WebDriver getDriver () {
        return driver;
    }

    public static WebElement findElement (By locator) {
        return driver.findElement(locator);
    }

    public static WebElement waitAndFindElement (By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}

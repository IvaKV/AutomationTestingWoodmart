package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;
import java.util.UUID;

public class VerifyRegisterTest extends BaseTest{
    //Soo UUID - universally unique identifier
    String username = UUID.randomUUID().toString().substring(0, 7);
    String email = UUID.randomUUID().toString().substring(0, 6) + "@test.co";
    String password = UUID.randomUUID().toString().toUpperCase().substring(1, 10).toLowerCase() + "!!";


    //So RANDOM KLASA
    Random random = new Random();
    String username1 = random.toString();
    String email1 = random.toString().substring(0, 6) + "@test.co";

    //Na drug nacin
    String username2 = "test" + System.currentTimeMillis() + "456789123";
    String email2 = "test" + System.currentTimeMillis() + "email.co";



    @Test
    public void verifyRegister() {
        homepage.clickOnRegister();

        signInPage.clickOnCreateAccountBtn();

        myAccountPage.fillRegistrationForm(username, email, password);

        accountDetailsPage.clickOnAccountDetailsLink();

        String actualResult = accountDetailsPage.getAccountEmail();
        Assert.assertEquals(actualResult, email);

    }
}

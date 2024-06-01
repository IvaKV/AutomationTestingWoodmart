package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class VerifyAskQuestionMsgTest extends BaseTest{


    @Test
    public void verifyAskQuestionErrorMsg() {

        homepage.clickOnContactUs();

        String name = UUID.randomUUID().toString();
        String email = UUID.randomUUID().toString().substring(0,4) + "@test.co";
        String question = "This is a message for testing purposes";

        contactUsPage.fillQuestionForm(name, email, question);

        contactUsPage.clickAskQuestionBtn();

        String expectedErrorMessage = "There was an error trying to send your message. Please try again later.";
        String actualErrorMessage = contactUsPage.getErrorMsg();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);

    }
}

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestWebdev extends Maindriver {


    @Test
    public void testDevbgCreateAccount() {
        LoginTest loginTest = new LoginTest(driver);
        loginTest.clickMakeAccountButton();
        RegistrationPage page =  new RegistrationPage(driver);

        page.accountButtonCreate();
        Assert.assertTrue(page.isConsentErrorPresent(), "Consent error is not presented!");

    }
    @Test
    public void testDevbgRegistrationPage (){
        LoginTest loginTest = new LoginTest(driver);
        loginTest.clickMakeAccountButton();
        RegistrationPage page =  new RegistrationPage(driver);
        page.clickChecbox();
        page.enterFirstName("");
        page.enterLastName("");
        page.enterEmail("");
        page.enterPassword("");
        page.getPasswordFieldColor();

        String color = page.getPasswordFieldColor();
        String color1 = page.getFirstnameFieldColor();
        String color2 = page.getLastnameFieldColor();
        String color3 = page.getEmailFieldColor();
        page.accountButtonCreate();


        SoftAssert softAssert = new SoftAssert();

        Assert.assertEquals(color, "rgba(89, 89, 89, 1)");
        Assert.assertEquals(color1, "rgba(89, 89, 89, 1)");
        Assert.assertEquals(color2, "rgba(89, 89, 89, 1)");
        Assert.assertEquals(color3, "rgba(89, 89, 89, 1)");

        softAssert.assertAll();
    }
    @Test
    public void testQaSection (){
        LoginTest loginTest = new LoginTest(driver);
        loginTest.clickQaButton();
        loginTest.acceptCookies();

        AutomationPage page = new AutomationPage(driver);

        page.setFullyRemote();
        page.setJobsVarna();

        SoftAssert softAssert = new SoftAssert();

        Assert.assertTrue(page.fullyRemoteBoxIsDisplayed(),"Nothing is displayed");
        Assert.assertTrue(page.varnaBoxIsDisplayed(),"Nothing is displayed");

        softAssert.assertAll();
    }
}

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
    public RegistrationPage(WebDriver driver) {
        super(driver);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.buttonCreate = buttonCreate;
    }

    @FindBy(css = "#fname")
    private WebElement firstName;

    @FindBy(css = "#lname")
    private WebElement lastName;

    @FindBy(css = "#email")
    private WebElement email;
    @FindBy(css = "#password")
    private WebElement password;
    @FindBy(name = "Submitted")
    private WebElement buttonCreate;
    @FindBy(id = "consent-error")
    private WebElement consentError;
    @FindBy(id = "subscriber-register-consent")
    private WebElement checkbox;


    public void enterFirstName(String text) {
        firstName.sendKeys(text);
    }

    public void enterLastName(String text) {
        lastName.sendKeys(text);

    }

    public void enterEmail(String text) {
        email.sendKeys(text);
    }

    public void enterPassword(String text) {
        password.sendKeys(text);
    }

    public void accountButtonCreate() {
        buttonCreate.click();
    }

    public boolean isConsentErrorPresent() {
        return consentError.isDisplayed();
    }

    public void clickChecbox() {
        checkbox.click();
    }

    public String getPasswordFieldColor() {
        String color = password.getCssValue("color");
        return color;
    }

    public String getFirstnameFieldColor() {
        String color = firstName.getCssValue("color");
        return color;
    }

    public String getLastnameFieldColor() {
        String color = lastName.getCssValue("color");
        return color;
    }

    public String getEmailFieldColor() {
        String color = lastName.getCssValue("color");
        return color;
    }
}
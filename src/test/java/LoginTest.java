import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginTest extends BasePage {

    @FindBy(css = ".bold.subscriber-register-btn")
    private WebElement makeAccount;
    @FindBy(partialLinkText = "Automation QA")
   private WebElement qaButton ;

    @FindBy(xpath= "//*[text()='Разрешавам всички']")
    private WebElement cookies;




    public LoginTest(WebDriver driver) {
        super(driver);

    }
    public void clickMakeAccountButton() {
        makeAccount.click();
    }
public void clickQaButton () {
        qaButton.click();
}
public void acceptCookies () {
        cookies.click();
}

    }






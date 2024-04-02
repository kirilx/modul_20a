import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AutomationPage extends BasePage {

    private WebDriver driver;


    @FindBy(xpath = "//*[@id='filter-job_location']/div[2]/div[2]/span[1]")
    private WebElement fullyRemote;

    @FindBy(xpath = "//*[@id='filter-job_location']/div[2]/div[3]/span[1]")
    private WebElement jobsVarna;

    @FindBy(xpath = "//*[@id='jobs']/div[1]/section[1]/div[1]/div[3]/ul/li/span[2]")
    private WebElement fullyRemoteBox;
    @FindBy(xpath = "//*[@id='jobs']/div[1]/section[1]/div[1]/div[3]/ul/li/span[2]")
    private WebElement varnaBox;

    public AutomationPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void setFullyRemote() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement fullyRemoteElement = wait.until(ExpectedConditions.visibilityOf(fullyRemote));
        fullyRemoteElement.click();
    }

    public void setJobsVarna() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            WebElement jobsVarnaElement = wait.until(ExpectedConditions.elementToBeClickable(jobsVarna));
            jobsVarnaElement.click();
        } catch (StaleElementReferenceException e) {
            setJobsVarna();
        }
    }

    public boolean fullyRemoteBoxIsDisplayed() {
        return fullyRemoteBox.isDisplayed();
    }

    public boolean varnaBoxIsDisplayed() {
        return varnaBox.isDisplayed();
    }

    }



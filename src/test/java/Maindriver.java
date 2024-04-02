import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Maindriver {
     WebDriver driver = new ChromeDriver();
    @BeforeClass
    public  void before () {
        driver.get("https://dev.bg/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));



}
}
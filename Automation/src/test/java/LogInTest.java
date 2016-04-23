import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Emily on 13.4.2016 ã..
 */
public class LogInTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new FirefoxDriver();

    }

    @Test
    public void TestLogin_ValidCredentials_ShouldLoginCorrectly(){
        driver.get("http://zknadejda.bg/bg/claims//");
        String validUsername = "16010120000006";
        String validPassword = "8901176692";

        WebElement usernameField = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div[1]/div[2]/input"));
        WebElement passwordField = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div[2]/div[2]/input"));
        usernameField.clear();
        usernameField.sendKeys(validUsername);
        passwordField.click();
        passwordField.sendKeys(validPassword);

        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/form/div[3]/a"));

        loginButton.click();
    }

    @After
    public  void terDown (){

    }
}

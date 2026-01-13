package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;

    By signUpButton= By.xpath("//button[contains(text(),'Login')]");
    By emailId = By.id("email");
    By password = By.id("password");
    By signInButton = By.xpath("//button[text()='Sign In']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public void clickOnSignup(){
        driver.findElement(signUpButton).click();
    }
    public void inputEmailId(String emailid) {
        driver.findElement(emailId).sendKeys(emailid);
    }

    public void inputPassword(String pass) {
        driver.findElement(password).sendKeys(pass);
    }

    public void clickOnSignIn() {
        driver.findElement(signInButton).click();
    }
}

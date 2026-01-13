package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage  {
    private WebDriver driver;
    WebDriverWait wait;


    By userName = By.xpath("//header/div[1]/div[2]/h5[1]");
    By viewPackage = By.xpath("//a[contains(text(),'View Packages')]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public String validateUsername() {
        wait.until(ExpectedConditions.presenceOfElementLocated(userName));
        return driver.findElement(userName).getText();
    }

    public void clickOnViewPackage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(viewPackage));
        driver.findElement(viewPackage).click();
    }

}

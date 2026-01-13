package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PackagesPage {
    WebDriver driver;
    WebDriverWait wait;
    By linkViewDetailOfLondonExtra = By.xpath("//a[@href='/packages/P101']");
    By bookNowButton = By.xpath("//a[@href='/book-package/P101']");

    public PackagesPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickOnViewDetailsLondonExtra() {
        wait.until(ExpectedConditions.presenceOfElementLocated(linkViewDetailOfLondonExtra));
        driver.findElement(linkViewDetailOfLondonExtra).click();
    }

    public void clickOnBookNow() {
        wait.until(ExpectedConditions.presenceOfElementLocated(bookNowButton));
        driver.findElement(bookNowButton).click();
    }
}

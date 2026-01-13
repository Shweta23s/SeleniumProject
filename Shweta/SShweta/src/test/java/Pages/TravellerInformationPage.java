package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TravellerInformationPage {

    WebDriver driver;
    WebDriverWait wait;

    By selectDatebox = By.id("date");
    By totalGuestBox = By.id("person");
    By roomRequiredBox = By.id("room");
    By confirmBookingButton = By.xpath("//button[contains(text(),'Confirm Booking')]");

    By checkConfirmedMessage = By.xpath("//p[contains(text(),'Thank You. Your booking order is confirmed now.')]");

    public TravellerInformationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void setSelectDateBox() {
        driver.findElement(selectDatebox).sendKeys("02-28-2025");
    }

    public void inputTotalGuest() {
        driver.findElement(totalGuestBox).sendKeys("5");
    }

    public void inputTotalRoom() {
        driver.findElement(roomRequiredBox).sendKeys("2");
    }

    public void clickOnConfirmBooking() {
        driver.findElement(confirmBookingButton).click();
    }

    public String validateConfirmedMessage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(checkConfirmedMessage));
        return driver.findElement(checkConfirmedMessage).getText();
    }
}

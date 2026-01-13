package StepDefinition;

import Pages.HomePage;
import Pages.PackagesPage;
import Pages.TravellerInformationPage;
import Utility.WebDriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ViewAndBookingConfirmStepDef {

    HomePage homePage;
    PackagesPage packagesPage;
    TravellerInformationPage travellerInformationPage;
    WebDriver driver;

    @Given("User click on View Package option to see all the packages")
    public void user_click_on_package_option_to_see_all_the_packages() {
        this.driver = WebDriverManager.getDriver();
        homePage = new HomePage(driver);
        homePage.clickOnViewPackage();
        Assert.assertTrue(driver.getCurrentUrl().contains("all-packages"));
    }

    @When("User select view details for the London Extravaganza")
    public void user_select_view_details_for_the_london_extravaganza() {
        packagesPage = new PackagesPage(driver);
        packagesPage.clickOnViewDetailsLondonExtra();
        Assert.assertTrue(driver.getCurrentUrl().contains("packages/P101"));
    }

    @Then("User click on Book now option")
    public void user_click_on_book_now_option() {
        packagesPage.clickOnBookNow();
        Assert.assertTrue(driver.getCurrentUrl().contains("book-package/P101"));
    }

    @Given("User enter the traveller information")
    public void user_enter_the_traveller_information() {
        travellerInformationPage = new TravellerInformationPage(driver);
        travellerInformationPage.setSelectDateBox();
    }

    @When("User click on Confirm booking")
    public void user_click_on_confirm_booking() {
        travellerInformationPage.inputTotalGuest();
        travellerInformationPage.inputTotalRoom();
        travellerInformationPage.clickOnConfirmBooking();
    }

    @Then("User should be able to see the booking confirmation message")
    public void user_should_be_able_to_see_the_booking_confirmation_message() {
        String message = travellerInformationPage.validateConfirmedMessage();
        Assert.assertEquals("Thank You. Your Booking Order Is Confirmed Now.", message);
    }

}

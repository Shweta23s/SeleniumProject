package StepDefinition;

import Pages.HomePage;
import Pages.LoginPage;
import Utility.WebDriverManager;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginStepDef {
    LoginPage loginPage;
    HomePage homePage;
    WebDriver driver;

    @Before
    public void setup() {
        driver = WebDriverManager.getDriver();
        driver.get("http://localhost:3001/");
        driver.manage().window().maximize();
        System.out.println("Driver initilaized");

    }

    @After
    public void tearDown(){
        if (driver != null) {
            driver.quit();  // Close the WebDriver session after each scenario
        }
    }
    @Given("Redirect to the application Home page")
    public void redirect_to_the_application_home_page() {
        loginPage = new LoginPage(driver);
        loginPage.clickOnSignup();
    }

    @Given("User enter the username {string}")
    public void user_enter_the_username(String emailId) {
        loginPage.inputEmailId(emailId);
    }

    @When("User enter the password {string}")
    public void user_enter_the_and(String password) {
        loginPage.inputPassword(password);
        loginPage.clickOnSignIn();
    }

    @Then("User should be able to login to the website")
    public void user_should_be_able_to_login_to_the_website() {
        homePage = new HomePage(driver);
        String username = homePage.validateUsername();
        Assert.assertTrue(username.contains("Maddy"));
    }
}

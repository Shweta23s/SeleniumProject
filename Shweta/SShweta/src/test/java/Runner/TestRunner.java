package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\shweta.sharma6\\Desktop\\training_projects\\Capstone_Shweta_2552870\\src\\test\\resources\\Feature\\loginAndConfirmBooking.feature",
        glue = {"StepDefinition"},
        plugin = {"pretty", "html:target/cucumber-reports"}
       // tags = ""
)
public class TestRunner {
}

package zadaniekoncowe1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/correct-address-data.feature",
        glue = "zadaniekoncowe1",
        plugin = {"pretty","html:out"})

public class AddAddressTest {
}

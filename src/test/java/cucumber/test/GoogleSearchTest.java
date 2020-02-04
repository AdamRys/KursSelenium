package cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/change-user-information.feature",
        glue = "przyklad4",
        plugin = {"pretty","html:out"})

public class GoogleSearchTest {
}
package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/featureFiles",
    glue = {"stepDefinitions"},
    tags = {"@JobBoard"},
    plugin = { "pretty", "html:target/cucumber-reports/reports" },
    //plugin = { "pretty" },
    strict=true
    //monochrome = true
    )

public class JobBoard {

}

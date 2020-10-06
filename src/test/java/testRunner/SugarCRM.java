package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/java/featureFiles",
    glue = {"stepDefinitions"},
    tags = {"@sugarCRM"},
    strict=true,
    plugin = {"pretty", "html: test-reports-CRM"},
    monochrome = true
    
    )

 public class SugarCRM {}

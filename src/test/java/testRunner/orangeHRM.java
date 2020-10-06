package testRunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/featureFiles",
	    glue = {"stepDefinitions"},
	    tags = {"@OrangeHRM"},
	    strict=true,
	    plugin = {"pretty", "html: test-reports-HRM"},
        monochrome = true
	
)
public class orangeHRM {
}

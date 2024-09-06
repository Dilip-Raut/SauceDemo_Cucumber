package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Features",
				glue = "definitions")

public class RunnerTests extends AbstractTestNGCucumberTests {
}

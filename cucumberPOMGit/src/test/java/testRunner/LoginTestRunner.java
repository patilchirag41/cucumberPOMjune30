package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features\\DemoWebshopLogin.feature",
		glue = "stepDefinition"
		
		
		
		)
public class LoginTestRunner {

}

package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:/Users/Admin/workspace/OrangeArtifact/src/main/java/features/Login.feature", 
		glue={"StepDefinition"}
		//format={"pretty","html:test-output"}
		
		)
public class Runner {

}

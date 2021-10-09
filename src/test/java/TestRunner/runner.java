package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features= {"SoftTech/facebook.feature"},
			glue={"Tutorial1"},
			monochrome=true,
			dryRun=false
		)
public class runner {

}

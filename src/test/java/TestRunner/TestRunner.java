package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Run this class as cucumber class
@RunWith(Cucumber.class)
@CucumberOptions(
			features= {"SoftTech/multData.feature"},
			glue= {"Tutorial1"},
			// it will display output console in proper readable format
			monochrome=true,
			dryRun=false
			
		
		)
public class TestRunner {

}

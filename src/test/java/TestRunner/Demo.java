package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "SoftTech/facebook.feature" }, 
	glue = { "StepDefination" }, monochrome = true,
	dryRun=false,
		// to check mapping between feature file and step definatio file
		plugin = { "html:Reports/abc.html", 
				"json:Reports/pune.json", 
				"junit:Reports/mumbai.xml",
				"pretty:Reports/abc.txt" }
		)

public class Demo {

}

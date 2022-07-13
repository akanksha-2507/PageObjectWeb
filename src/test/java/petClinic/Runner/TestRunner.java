package petClinic.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
                glue={"petClinic.Steps"},
                		plugin = { "pretty", "html:target/cucumber-html-report" },
                monochrome= true)
public class TestRunner
{
	
}
package StepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",
glue= {"StepDefinition"},
monochrome = true,
//plugin = {"pretty","html:target/HTMLReports"}, 
//plugin = {"pretty","json:target/JSONReports"},
//plugin = {"pretty","json:target/JSONReport/report.json"},
//plugin = {"pretty","junit:target/JUnitReports/report.xml"},
plugin = {"pretty","junit:target/JUnitReports/report.xml",
		"json:target/JSONReports",
		"html:target/HTMLReports"})
public class TestRunner {

}

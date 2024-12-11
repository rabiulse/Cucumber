package runner;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/java/features"},
glue={"stepdefinitions"},monochrome=true,
plugin= {"pretty","html:target/htmlreport.html"})

public class MyRunner extends AbstractTestNGCucumberTests {

}

package testRunner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles",
                                     glue = "stepDefination",
                                     dryRun = false,
                                     monochrome = true,
                                   
                                     plugin = { "pretty", "html: TestReports/Test.html"})


public class Runner extends AbstractTestNGCucumberTests {

}

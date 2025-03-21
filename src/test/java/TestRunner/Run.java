package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features/login.feature",
    glue = "stepDefination",
    dryRun = false,
    monochrome = true,
    plugin = {"pretty"}
    
)
public class Run {

}

package parallel;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        dryRun = false,
        features = {"src/test/java/resources"},
        glue = {"parallel/stepDefinitions"},
        plugin = { "json:target/json-cucumber-reports/cukejson.json",
                "junit:target/junit-cucumber-reports/cukejunit.xml",
                "html:target/junit-cucumber-reports/cukejunit.html"},
        tags = {"@smoke"}

)
public class RunCucumberIT
{
    @AfterClass
    public static void tearDown()
    {
        System.out.println("test is over");
    }
}

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {
                "pretty",
                "html:report-cucumber.html",
                "json:cucumber-json.json"
        }
)
public class CucumberRunnerTest extends AbstractTestNGCucumberTests {}

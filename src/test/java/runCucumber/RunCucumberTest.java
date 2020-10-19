package runCucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        monochrome = true,
        tags = "@Test",
        glue={"steps"}
)

public class RunCucumberTest{
}

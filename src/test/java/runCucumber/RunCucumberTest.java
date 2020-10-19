package runCucumber;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/features",
        monochrome = true,
        tags = "@Test",
        glue={"runCucumber.RunCucumberTest"}
)

public class RunCucumberTest{
}

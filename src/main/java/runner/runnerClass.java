package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/feature",
					glue="steps",
					publish=true,
//					tags="@smoke" // runs only smoke test cases
//					tags="@regression or @smoke"  //runs both regression and smoke test cases
//					tags="@regression and @smoke" // runs test cases tagged with both smoke and regression
					tags="not @smoke" // runs the test cases whihc is not having smoke
		)

public class runnerClass extends AbstractTestNGCucumberTests {

	
}

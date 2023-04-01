package cucumberOptions; 

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/featureLayer"
		,glue="stepDefinition"
		,tags="@RegressionTest"
//		,dryRun=true
		,monochrome=true
		,plugin= {"pretty","html:target/cucumberReport.html","json:target/cucumberReport1.json"}
	)
public class RunnerClass extends AbstractTestNGCucumberTests{

}

package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*Writing dryrun=false states that it will run only the feature files which have step definitions in it.
and writing dryrun=true runs the features files and prints a set of pre-defined template sets of step 
definitions 
*/
/*
 tags can be written in both ways tags=("@name of tag") or tags="@name of tag"
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"}
		,glue= {"Stepsinfo"}
		,plugin = { "pretty", "json:Allreportstarget/Cucumber-reports/Cucumber.json",
						"junit:Allreportstarget/Cucumber-reports/Cucumber",
						"html:Allreportstarget/Cucumber-reports/Cucumber.html"}
				//,monochrome = true
				//,tags = "@P300 or @P2"
				//,tags="@Advance and @Searchlink"
				//,tags="@P1"
		,tags="not @P300"
				//,dryRun = true
				//,name="Link"
				
			)

public class Testrunner {

}

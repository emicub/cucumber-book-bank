package nicebank.StepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/cucumber/features",
        //glue = {"com.cucumber.StepDefinitions"},
        glue = {"nicebank.StepDefinitions", "hooks"},
        snippets = SnippetType.CAMELCASE,
        plugin = { 
                    "pretty",                        
                    "html:out",
                } 
        )
public class RunCukeTest {
}
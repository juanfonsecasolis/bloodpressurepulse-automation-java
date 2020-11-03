package BehaviorDrivenDevelopment;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/BehaviorDrivenDevelopment/Features",
        glue={"classpath:BehaviorDrivenDevelopment.Steps"}
        )
public class Runner extends AbstractTestNGCucumberTests {
}

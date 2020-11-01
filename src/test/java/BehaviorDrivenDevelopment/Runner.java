package BehaviorDrivenDevelopment;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="classpath:BehaviorDrivenDevelopment.Features",
        glue={"classpath:BehaviorDrivenDevelopment.Steps"}
        )
public class Runner {
}
